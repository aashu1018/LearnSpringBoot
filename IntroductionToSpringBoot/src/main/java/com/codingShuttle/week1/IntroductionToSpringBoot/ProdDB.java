package com.codingShuttle.week1.IntroductionToSpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ProdDB implements DB{

    public String getData(){
        return "Prod Data";
    }
}
