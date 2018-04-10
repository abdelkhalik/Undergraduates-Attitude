package com.example.android.undergraduatesattitude;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author abdelkhalik
 */
public class KnowledgeBase {

    OptimalActivity optimalActivity;
    static public final String[] healthyList = {"Sleeping", "Sports"};
    static public final ArrayList<String> Healthy = new ArrayList<>(Arrays.asList(healthyList));
    static public final String[] lifeList = {"HouseHold", "Eating and Drinking", "Purchasing goods and services", "Transportation", "Religious and Spiritual Activities"};
    static public final ArrayList<String> Life = new ArrayList<>(Arrays.asList(lifeList));
    static public ArrayList<String> Educational = new ArrayList<>();
    static public final String[] responsList = {"Planning", "Volunteerism", "Socializing and communicating", "Telephone call and e-mails"};
    static public final ArrayList<String> Responsibility = new ArrayList<>(Arrays.asList(responsList));
    static public final String[] entertainmentList = {"Hobby", "Social Media", "Leisure"};
    static public final ArrayList<String> Entertainment = new ArrayList<>(Arrays.asList(entertainmentList));
    static public final String[] skillsList = {"Language Acquisition", "Teaching", "Writing", "Reading"};
    static public final ArrayList<String> Skills = new ArrayList<>(Arrays.asList(skillsList));

    //===============================================================================================
    static public final OptimalActivity sleeping = new OptimalActivity(Category.HEALTH, "Sleeping", new ActivityDuration(56, 0), new ActivityDuration(42, 0), OptimalActivity.Priority.MANDATORY);
    static public final OptimalActivity sports = new OptimalActivity(Category.HEALTH, "Sports", new ActivityDuration(7, 0), new ActivityDuration(0, 0), OptimalActivity.Priority.HIGHLY_RECOMMENDED);
    static public final OptimalActivity houseHold = new OptimalActivity(Category.LIFE, "HouseHold", new ActivityDuration(14, 0), new ActivityDuration(0, 0), OptimalActivity.Priority.OPTIONAL);
    static public final OptimalActivity eatingAndDrinking = new OptimalActivity(Category.LIFE, "Eating and Drinking", new ActivityDuration(7, 0), new ActivityDuration(3, 0), OptimalActivity.Priority.MANDATORY);
    static public final OptimalActivity purchasingGoodsAndServices = new OptimalActivity(Category.LIFE, "Purchasing goods and services", new ActivityDuration(3, 0), new ActivityDuration(0, 0), OptimalActivity.Priority.OPTIONAL);
    static public final OptimalActivity transportation = new OptimalActivity(Category.LIFE, "Transportation", new ActivityDuration(21, 0), new ActivityDuration(0, 0), OptimalActivity.Priority.OPTIONAL);
    static public final OptimalActivity religiousAndSpiritualActivities = new OptimalActivity(Category.LIFE, "Religious and Spiritual Activities", new ActivityDuration(28, 0), new ActivityDuration(0, 0), OptimalActivity.Priority.OPTIONAL);
    static public final OptimalActivity planning = new OptimalActivity(Category.RESPONSIBILITY, "Planning", new ActivityDuration(2, 0), new ActivityDuration(1, 0), OptimalActivity.Priority.HIGHLY_RECOMMENDED);
    static public final OptimalActivity volunteerism = new OptimalActivity(Category.RESPONSIBILITY, "Volunteerism", new ActivityDuration(6, 0), new ActivityDuration(3, 0), OptimalActivity.Priority.RECOMMENDED);
    static public final OptimalActivity socializingAndCommunicating = new OptimalActivity(Category.RESPONSIBILITY, "Socializing and communicating", new ActivityDuration(14, 0), new ActivityDuration(7, 0), OptimalActivity.Priority.MANDATORY);
    static public final OptimalActivity telephoneCallsAndEMails = new OptimalActivity(Category.RESPONSIBILITY, "Telephone call and e-mails", new ActivityDuration(3, 0), new ActivityDuration(2, 0), OptimalActivity.Priority.RECOMMENDED);
    static public final OptimalActivity hobby = new OptimalActivity(Category.ENTERTAINMENT, "Hobby", new ActivityDuration(14, 0), new ActivityDuration(7, 0), OptimalActivity.Priority.RECOMMENDED);
    static public final OptimalActivity socialMedia = new OptimalActivity(Category.ENTERTAINMENT, "Social Media", new ActivityDuration(14, 0), new ActivityDuration(7, 0), OptimalActivity.Priority.RECOMMENDED);
    static public final OptimalActivity leisure = new OptimalActivity(Category.ENTERTAINMENT, "Leisure", new ActivityDuration(14, 0), new ActivityDuration(7, 0), OptimalActivity.Priority.RECOMMENDED);
    static public final OptimalActivity languageAcquisition = new OptimalActivity(Category.SKILLS, "Language Acquisition", new ActivityDuration(14, 0), new ActivityDuration(7, 0), OptimalActivity.Priority.HIGHLY_RECOMMENDED);
    static public final OptimalActivity teaching = new OptimalActivity(Category.SKILLS, "Teaching", new ActivityDuration(14, 0), new ActivityDuration(7, 0), OptimalActivity.Priority.OPTIONAL);
    static public final OptimalActivity writing = new OptimalActivity(Category.SKILLS, "Writing", new ActivityDuration(7, 0), new ActivityDuration(0, 0), OptimalActivity.Priority.OPTIONAL);
    static public final OptimalActivity reading = new OptimalActivity(Category.SKILLS, "Reading", new ActivityDuration(14, 0), new ActivityDuration(7, 0), OptimalActivity.Priority.HIGHLY_RECOMMENDED);

    //=====================================================================================
    
    static public final OptimalCategory HealthtCat = new OptimalCategory(Category.HEALTH,new ActivityDuration(63, 0), new ActivityDuration(42, 0));
    static public final OptimalCategory LifeCat = new OptimalCategory(Category.LIFE, new ActivityDuration(73, 0),new ActivityDuration(0, 0));
    static public OptimalCategory EducationalCat = new OptimalCategory(Category.EDUCATIONAL, new ActivityDuration(0, 0),new ActivityDuration(0, 0));
    static public final OptimalCategory ResponsibilityCat = new OptimalCategory(Category.RESPONSIBILITY,new ActivityDuration(25, 0), new ActivityDuration(13, 0));
    static public final OptimalCategory EntertainmentCat = new OptimalCategory(Category.ENTERTAINMENT, new ActivityDuration(14, 0), new ActivityDuration(7, 0));
    static public final OptimalCategory SkillsCat = new OptimalCategory(Category.SKILLS, new ActivityDuration(42, 0), new ActivityDuration(14, 0));
           /*****************************************************/    
    
    static public final ArrayList<String> optimalCategoryList = new ArrayList<>(Arrays.asList("EDUCATIONAL","HEALTH","LIFE","RESPONSIBILITY","ENTERTAINMENT","SKILLS"));
    static public final ArrayList<OptimalCategory> optimalCategories = new ArrayList<>(Arrays.asList(EducationalCat,HealthtCat,LifeCat,ResponsibilityCat,EntertainmentCat,SkillsCat));
    
    //=====================================================================================================
    
    
    static public ArrayList<String> optimalActivityList = new ArrayList<>(Arrays.asList("Sleeping", "Sports","HouseHold", "Eating and Drinking", "Purchasing goods and services", "Transportation", "Religious and Spiritual Activities", "Planning", "Volunteerism", "Socializing and communicating", "Telephone call and e-mails", "Hobby","Social Media","Leisure","Language Acquisition", "Teaching", "Writing", "Reading"));
    static public ArrayList<OptimalActivity> optimalActivities = new ArrayList<>(Arrays.asList(sleeping, sports, houseHold, eatingAndDrinking, purchasingGoodsAndServices, transportation, religiousAndSpiritualActivities, planning, volunteerism, socializingAndCommunicating, telephoneCallsAndEMails, hobby, socialMedia, leisure, languageAcquisition, teaching, writing, reading));

    static public ArrayList<String> courseActivities = new ArrayList<>(Arrays.asList("Attendance", "Homework", "Assignments", "Final Project"));

    static public ActivityDuration getActivityOptimalMaxDuration(String name){
        return optimalActivities.get(optimalActivityList.indexOf(name)).getMaxDuration();

    }

    static public ActivityDuration getActivityOptimalMinDuration(String name){
        return optimalActivities.get(optimalActivityList.indexOf(name)).getMinDuration();
    }

    static public ActivityDuration getCategoryOptimalMaxDuration(String name){
        return optimalCategories.get(optimalCategoryList.indexOf(name)).getMaxDuration();
    }

    static public ActivityDuration getCategoryOptimalMinDuration(String name){
        return optimalCategories.get(optimalCategoryList.indexOf(name)).getMinDuration();
    }

    public static OptimalActivity.Priority getActivityPriority(String activityName){
        for(OptimalActivity activity : optimalActivities){
            if(activity.getName().equals(activityName)){
                return activity.getPriority();
            }
        }
        return OptimalActivity.Priority.OPTIONAL;
    }

    static public void createCourseActivity(Course course){
        Educational.add(course.getName());
        OptimalActivity courseActivity = new OptimalActivity(Category.EDUCATIONAL, course.getName(), Course.calculateAllCourseHours(course), Course.calculateAllCourseHours(course), OptimalActivity.Priority.MANDATORY);
        EducationalCat.setMaxDuration(ActivityDuration.addTwoDurations(EducationalCat.getMaxDuration(), courseActivity.getMaxDuration()));
        EducationalCat.setMinDuration(ActivityDuration.addTwoDurations(EducationalCat.getMinDuration(), courseActivity.getMinDuration()));
        optimalActivityList.add(course.getName());
        optimalActivities.add(courseActivity);
    }

}
