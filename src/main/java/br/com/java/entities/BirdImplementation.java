package br.com.java.entities;

import java.util.List;

public class BirdImplementation implements BirdActions {

    public void allBirds(List<Birds> birdsList){

        System.out.println("\n All birds: ");

        for (Birds birds : birdsList){

            System.out.println(birds.getName());

        }

    }

    public void actionBirds(String nameBirdException){

        System.out.println("\n Bird: " + nameBirdException);
        walk();
        eat();

    }

    public void actionBirds(Birds birds){

        System.out.println("\n " + birds.toString());
        walk();
        eat();
        fly();

    }

    @Override
    public void walk() {

        System.out.println("This bird walks");

    }

    @Override
    public void eat() {

        System.out.println("This bird eats");

    }

    @Override
    public void fly() {

        System.out.println("This bird flys");

    }

}
