package com.example.demo.service;

import com.example.demo.repository.PetRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("pet")
@Profile("cat")
public class CatService implements PetRepository {
    @Override
    public String checkPet() {
        return "Cat";
    }
}
