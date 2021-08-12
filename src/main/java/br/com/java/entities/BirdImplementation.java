package br.com.java.entities;

import java.util.List;

public class BirdImplementation implements BirdActions {

    public void allBirds(List<Bird> birdList){

        System.out.println("\n All birds: ");

        for (Bird bird : birdList){

            System.out.println(bird.getName());

        }

    }

    public void actionBirds(String nameBirdException){

        System.out.println("\n Bird: " + nameBirdException);
        walk();
        eat();

    }

    public void actionBirds(Bird bird){

        System.out.println("\n " + bird.toString());
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
