package br.com.java.entities;

public abstract class Birds {

    private String name;
    private String color;
    private String countryOrigin;

    public Birds(){

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
        return "Bird{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", countryOrigin='" + countryOrigin + '\'' +
                '}';
    }

    public abstract Integer qtdBirds(Integer qtdNewBirds);

}
