package com.example.android.undergraduatesattitude;

/**
 *
 * @author abdelkhalik
 */
public class CommittedActivity extends OptimalActivity {

    private String advice;

    public CommittedActivity(Category category, String name, ActivityDuration committedDuration) {
        super(category, name, KnowledgeBase.getActivityOptimalMaxDuration(name), KnowledgeBase.getActivityOptimalMinDuration(name), KnowledgeBase.getActivityPriority(name));
        this.setDuration(committedDuration);
    }

    public ActivityDuration getCommittedDuration() {
        return getDuration();
    }

    public void setCommittedDuration(ActivityDuration duration) {
        this.setDuration(duration);
    }

    /**
     * @return the advice
     */
    public String getAdvice() {
        generateAdice();
        return advice;
    }

    private void generateAdice() {
        String Advice = null;
        String optionalAdvice = "You Have more committed Duration in this Activity which the number of hours is : ";
        String recommendedDecreaseAdvice = "You must decrease the committed duration with  ";
        String recommendedIncreaseAdvice = "You must increase the committed duration with ";
        String highlyRecommendedDecreaseAdvice = " may be need to decrease the committed duration with ";
        String highlyRecommendedIncreaseAdvice = "You need to increase the committed duration with ";
        String mandatoryDecreaseAdvice = "To much time , you must decrease the committed duration with ";
        String mandatoryIncreaseAdvice = "Committed duration must be increase with ";
        String forgetRecommendAdvice = " you have do this activity ";
        String forgetMandatoryAdvice = " you must do this activity ";
        String totalNumberHourseAdvice = null;
        Report report = User.user.getWeek().getReport();
        double CommittedDuration = this.getCommittedDuration().getHours() + ((this.getCommittedDuration().getMinutes()) / 60);
        double maxDuration = this.getMaxDuration().getHours() + ((this.getMaxDuration().getMinutes()) / 60);
        double minDuration = this.getMinDuration().getHours() + ((this.getMinDuration().getMinutes()) / 60);
        int allCommittedHourse = report.getAllCommitedHours();
        switch (this.getPriority()) {
            case OPTIONAL:
                if (CommittedDuration > maxDuration) {
                    Advice = optionalAdvice + (CommittedDuration - maxDuration) + " Hrs";

                }

                break;
            case RECOMMENDED:
                if (CommittedDuration == 0) {
                    Advice = forgetRecommendAdvice;
                } else {
                    if (CommittedDuration > maxDuration) {
                        Advice = recommendedDecreaseAdvice + (CommittedDuration - maxDuration) + " Hrs";
                    } else if (CommittedDuration < minDuration) {
                        Advice = recommendedIncreaseAdvice + (minDuration - CommittedDuration) + " Hrs";
                    }
                }
                break;

            case HIGHLY_RECOMMENDED:
                if (CommittedDuration == 0) {
                    Advice = forgetRecommendAdvice;
                } else {
                    if (CommittedDuration > maxDuration) {
                        Advice = highlyRecommendedDecreaseAdvice + (CommittedDuration - maxDuration) + " Hrs";
                    } else if (CommittedDuration < minDuration) {
                        Advice = highlyRecommendedIncreaseAdvice + (minDuration - CommittedDuration) + " Hrs";
                    }
                }
                break;

            case MANDATORY:
                if (CommittedDuration == 0) {
                    Advice = forgetMandatoryAdvice;

                } else {

                    if (CommittedDuration > maxDuration) {
                        Advice = mandatoryDecreaseAdvice + (CommittedDuration - maxDuration) + " Hrs to be come better !";
                    } else if (CommittedDuration < minDuration) {
                        Advice = mandatoryIncreaseAdvice + (minDuration - CommittedDuration) + " Hrs to be come better ";
                    }
                }
                break;

            default:
                break;

        }
        if (allCommittedHourse > report.WEEK_HOURS) {
            totalNumberHourseAdvice = "You enter large number of Hours is " + (allCommittedHourse) + " Hrs V.S the number of the week hours is 168 Hrs ";
            report.setTotalNumberHoursAdvice(totalNumberHourseAdvice);
        } else if (report.WEEK_HOURS > allCommittedHourse) {
            totalNumberHourseAdvice = "you have " + (168 - allCommittedHourse) + " Hrs which you have to make use of this hours to do anther activity ";
            report.setTotalNumberHoursAdvice(totalNumberHourseAdvice);
        }

        this.advice = Advice;
    }

}
