package com.example.demo.service;

import com.example.demo.repository.PetRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("pet")
@Profile("dog")
public class DogService implements PetRepository {
    @Override
    public String checkPet() {
        return "Dog";
    }
}
