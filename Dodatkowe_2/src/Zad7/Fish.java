package Zad7;

public abstract class Fish extends Animal{
    int size;

    @Override
    public String toString() {
        return "Fish{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
