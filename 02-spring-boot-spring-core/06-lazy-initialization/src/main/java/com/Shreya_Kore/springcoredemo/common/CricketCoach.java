package com.Shreya_Kore.springcoredemo.common;

import com.Shreya_Kore.springcoredemo.common.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "practice fast bowling for 15 minutes !";
    }
}
