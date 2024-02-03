package com.example.demo.controller;

import com.example.demo.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterGreetingController {
@Autowired
    private GreetingRepository greetingRepository;

    public void setGreetingRepository(@Qualifier("setterGreetingService") GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }



        public String getGreeting(){
            return greetingRepository.sayGreeting();
        }
}
