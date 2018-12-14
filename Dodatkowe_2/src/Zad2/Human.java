package Zad2;

public class Human {
    int age;
    int height;
    int weight;
    String gender;
    String name;

    public Human(int age, int height, int weight, String gender, String name) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
