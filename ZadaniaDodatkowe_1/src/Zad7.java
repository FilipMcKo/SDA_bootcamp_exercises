import java.util.Scanner;

public class Zad7 {

    static int sumOfDigits(int a){
        int sum = 0;
        while(a>0){
            sum+=a%10;
            a/=10;
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int number = sc.nextInt();

        System.out.println("Suma cyfr: " + sumOfDigits(number));


    }
}
