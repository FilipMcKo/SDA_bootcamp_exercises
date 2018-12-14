package Zad7;

public class Human extends Mammal {

    public Human(int nrOfLegs, String name) {
        this.name = name;
        this.nrOfLegs = nrOfLegs;

    }

    @Override
    public String toString() {
        return "Human{" +
                "nrOfLegs=" + nrOfLegs +
                ", name='" + name + '\'' +
                '}';
    }
}
