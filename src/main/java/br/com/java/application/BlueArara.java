package br.com.java.application;

import br.com.java.entities.Bird;

public class BlueArara extends Bird {

    @Override
    public Integer qtdBirds(Integer qtdNewBirds) {

        Integer existingBirds = 300;

        return existingBirds + qtdNewBirds;

    }

}
