package br.com.java.application;

import br.com.java.entities.Bird;

public class Chicken extends Bird {

    @Override
    public Integer qtdBirds(Integer qtdNewBirds) {

        Integer existingBirds = 10000;

        return existingBirds + qtdNewBirds;

    }

}
