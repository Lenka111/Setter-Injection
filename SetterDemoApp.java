//Elena Voinu
package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        //load the s[ring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean from the spring container
        CricketCoach theCoach = context.getBean("cricketCoach", CricketCoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        
        //we set the values in the .xml file
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        //close context
        context.close();
    }
}
