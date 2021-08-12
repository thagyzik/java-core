package br.com.java.application;

import br.com.java.entities.Bird;

public class Flamingo extends Bird {

    @Override
    public Integer qtdBirds(Integer qtdNewBirds) {

        Integer existingBirds = 5000;

        return existingBirds + qtdNewBirds;
    }

}
