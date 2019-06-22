package com.luv2code.springdemo;

import com.luv2code.springdemo.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day. Friday night.";
    }

}
