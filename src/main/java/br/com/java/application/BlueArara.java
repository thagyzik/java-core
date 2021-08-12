package br.com.java.application;

import br.com.java.entities.Birds;

public class BlueArara extends Birds {

    @Override
    public Integer qtdBirds(Integer qtdNewBirds) {

        Integer existingBirds = 300;

        return existingBirds + qtdNewBirds;

    }

}
