import java.util.Scanner;

public class Zad8 {

    static void toHours(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds - hours * 3600) / 60;
        seconds = seconds - hours * 3600 - minutes * 60;

        if(hours<10) System.out.print("0" + hours + ":");
        else System.out.print(hours + ":");
        if(minutes<10) System.out.print("0" + minutes + ":");
        else System.out.print(minutes + ":");
        if(seconds<10) System.out.print("0" + seconds);
        else System.out.print(seconds);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj ilość sekund: ");
        int seconds = sc.nextInt();
        toHours(seconds);

    }
}
