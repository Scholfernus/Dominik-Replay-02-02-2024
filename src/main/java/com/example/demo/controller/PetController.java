package com.example.demo.controller;

import com.example.demo.repository.PetRepository;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
private final PetRepository pet;

    public PetController(PetRepository petRepository) {
        this.pet = petRepository;
    }
    public String checkPet() {
        return pet.checkPet();
    }
}
