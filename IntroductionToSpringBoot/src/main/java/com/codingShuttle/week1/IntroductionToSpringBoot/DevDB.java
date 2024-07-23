package com.codingShuttle.week1.IntroductionToSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class DevDB implements DB{

    public String getData(){
        return "Dev Data";
    }
}
