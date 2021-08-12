package br.com.java.application;

import br.com.java.entities.Birds;

public class Chicken extends Birds {

    @Override
    public Integer qtdBirds(Integer qtdNewBirds) {

        Integer existingBirds = 10000;

        return existingBirds + qtdNewBirds;

    }

}
