import java.util.Random;
import java.util.Scanner;

public class Zad9 {

    static boolean missed(int a, int b){
        if(a==b) return false;
        return true;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int randNumber = rand.nextInt((10)+1);

        System.out.println("Zgadnij cyfrę od 1 do 10: ");
        int userNumber = sc.nextInt();

        while(missed(randNumber, userNumber)){
            System.out.println("Pudło. Jeszcze raz: ");
            userNumber = sc.nextInt();
        }

        System.out.println("Trafiony zatopiony!");
    }
}
