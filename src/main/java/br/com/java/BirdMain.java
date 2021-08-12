package br.com.java;

import br.com.java.application.BlueArara;
import br.com.java.application.Chicken;
import br.com.java.application.Flamingo;
import br.com.java.entities.BirdImplementation;
import br.com.java.entities.Bird;

import java.util.ArrayList;
import java.util.List;

public class BirdMain {

    public static void main(String[] args) {

        BlueArara blueArara = new BlueArara();
        blueArara.setColor("Blue");
        blueArara.setName("Arara Azul");
        blueArara.setCountryOrigin("Brazil");
        blueArara.setHabitat("Amazonia");
        blueArara.setSpecies("Bird");

        Flamingo flamingo = new Flamingo();
        flamingo.setColor("pink");
        flamingo.setName("Flamingo");
        flamingo.setCountryOrigin("Brazil");
        flamingo.setHabitat("Lagoons");
        flamingo.setSpecies("Bird");

        Chicken chicken = new Chicken();
        chicken.setColor("Brown, white and black");
        chicken.setName("Chicken");
        chicken.setCountryOrigin("Brazil");
        chicken.setHabitat("Bush");
        chicken.setSpecies("Bird");

        BirdImplementation birdImplementation = new BirdImplementation();
        birdImplementation.actionBirds(blueArara);
        birdImplementation.actionBirds(flamingo);

        birdImplementation.actionBirds(chicken.getName());

        List<Bird> birdList = new ArrayList<>();
        birdList.add(blueArara);
        birdList.add(flamingo);
        birdList.add(chicken);

        birdImplementation.allBirds(birdList);

    }

}
