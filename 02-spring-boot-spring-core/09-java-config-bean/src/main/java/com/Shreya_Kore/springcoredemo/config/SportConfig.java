package com.Shreya_Kore.springcoredemo.config;

import com.Shreya_Kore.springcoredemo.common.Coach;
import com.Shreya_Kore.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
