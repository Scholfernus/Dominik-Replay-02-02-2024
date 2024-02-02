package com.example.demo.service;

import com.example.demo.repository.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SetterGreetingService implements GreetingRepository {
    @Override
    public String sayGreeting() {
        return "Wstrzykiwanie przez setter";
    }
}
