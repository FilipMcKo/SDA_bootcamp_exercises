package Zad3;

public class Rectangle {

    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public double area(){
        return sideA*sideB;
    }

    public int circumference(){
        return 2*sideB+2*sideA;
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(sideA,2)+Math.pow(sideB,2));
    }

}
