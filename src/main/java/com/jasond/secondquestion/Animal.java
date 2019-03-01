package com.jasond.secondquestion;

import Interfaces.Mover;
import Interfaces.Speaker;

public abstract class Animal implements Mover, Speaker {

    private String animalType;

    public Animal(String animalType){
        this.animalType = animalType;


    }

    public String getAnimalType() {
        return animalType;
    }
}
