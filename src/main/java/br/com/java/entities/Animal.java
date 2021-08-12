package br.com.java.entities;

public class Animal {

    private String species;
    private String habitat;
    private String name;
    private String color;
    private String countryOrigin;

    public Animal(){

    }

    public Animal(String species, String habitat, String name, String color, String countryOrigin) {
        this.species = species;
        this.habitat = habitat;
        this.name = name;
        this.color = color;
        this.countryOrigin = countryOrigin;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", habitat='" + habitat + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", countryOrigin='" + countryOrigin + '\'' +
                '}';
    }

}
