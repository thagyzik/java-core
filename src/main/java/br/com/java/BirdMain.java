package br.com.java;

import br.com.java.application.BlueArara;
import br.com.java.application.Chicken;
import br.com.java.application.Flamingo;
import br.com.java.entities.BirdImplementation;
import br.com.java.entities.Birds;

import java.util.ArrayList;
import java.util.List;

public class BirdMain {

    public static void main(String[] args) {

        BlueArara blueArara = new BlueArara();
        blueArara.setColor("blue");
        blueArara.setName("Arara");
        blueArara.setCountryOrigin("Brazil");

        Flamingo flamingo = new Flamingo();
        flamingo.setColor("pink");
        flamingo.setName("Flamingo");
        flamingo.setCountryOrigin("Brazil");

        Chicken chicken = new Chicken();
        chicken.setColor("Brown, white and black");
        chicken.setName("Chicken");
        chicken.setCountryOrigin("Brazil");


        BirdImplementation birdImplementation = new BirdImplementation();
        birdImplementation.actionBirds(blueArara);
        birdImplementation.actionBirds(flamingo);

        birdImplementation.actionBirds(chicken.getName());

        List<Birds> birdsList = new ArrayList<>();
        birdsList.add(blueArara);
        birdsList.add(flamingo);
        birdsList.add(chicken);

        birdImplementation.allBirds(birdsList);

    }

}
