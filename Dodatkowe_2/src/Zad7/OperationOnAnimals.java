package Zad7;

public class OperationOnAnimals {

    public static void main(String[] args) {
        Human human = new Human(2, "Homo Sapiens");
        Animal goldFish = new GoldFish(5, "Zlociutka");

        Animal[] animals = {human, goldFish};

        for(Animal obj : animals){
            System.out.println(obj.toString());
        }
    }
}
