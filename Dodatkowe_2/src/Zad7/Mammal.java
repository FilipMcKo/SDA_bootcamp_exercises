package Zad7;

public abstract class Mammal extends Animal {
    int nrOfLegs;

    @Override
    public String toString() {
        return "Mammal{" +
                "nrOfLegs=" + nrOfLegs +
                ", name='" + name + '\'' +
                '}';
    }
}
