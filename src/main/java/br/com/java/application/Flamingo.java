package br.com.java.application;

import br.com.java.entities.Birds;

public class Flamingo extends Birds {

    @Override
    public Integer qtdBirds(Integer qtdNewBirds) {

        Integer existingBirds = 5000;

        return existingBirds + qtdNewBirds;
    }

}
