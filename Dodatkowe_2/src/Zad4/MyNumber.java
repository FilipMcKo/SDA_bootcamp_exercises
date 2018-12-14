package Zad4;

public class MyNumber {
    int number;

    public MyNumber(int x) {
        this.number = x;
    }

    public boolean isOdd() {
        if (this.number % 2 != 0) return true;
        return false;
    }

    public boolean isEven() {
        if (this.number % 2 == 0) return true;
        return false;
    }

    public double sqrt(){
        return Math.sqrt(this.number);
    }

    public double pow(MyNumber x){
        return Math.pow(this.number, x.number);
    }

    public int add(MyNumber x){
        return (this.number + x.number);
    }

    public int subtract(MyNumber x){
        return (this.number-x.number);
    }

}
