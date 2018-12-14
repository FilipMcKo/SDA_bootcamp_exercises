package Zad7;

public class GoldFish extends Fish {

    public GoldFish(int size, String name) {
        this.name = name;
        this.size = size;
    }


    @Override
    public String toString() {
        return "GoldFish{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
