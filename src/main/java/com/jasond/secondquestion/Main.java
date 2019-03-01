package com.jasond.secondquestion;

import Interfaces.Mover;
import Interfaces.Speaker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        try{

            System.out.println("Enter value");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String input;

            while((input = br.readLine())!=null) if (input.toLowerCase().equals("cat")) {
                Cat cat = new Cat();
                doSpeak(cat);
                doMove(cat);
//                    doAnimalActions(new Cat());

            } else if (input.toLowerCase().equals("dog")) {
                Dog dog = new Dog();
                doSpeak(dog);
                doMove(dog);

//                    doAnimalActions(new Dog());
            }
        }catch(IOException io){
            io.printStackTrace();
        }

    }
//    private static void doAnimalActions(Animal animal){
//        System.out.println(animal.speak());
//        System.out.printf(animal.move());
//
//    }

    private static void doMove(Mover mover){

        System.out.println(mover.move());
    }

    private static void doSpeak(Speaker speaker){

        System.out.println(speaker.speak());
    }
}
