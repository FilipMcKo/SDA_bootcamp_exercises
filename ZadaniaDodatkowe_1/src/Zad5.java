import java.util.Scanner;

public class Zad5 {

    static void pierwiastki(int a, int b, int c) {
        if (a == 0) System.out.println("To nie jest równanie kwadratowe.");
        else {
            double delta = b * b - 4 * a * c;
            double rootOfDelta = Math.sqrt(delta);
            double x1 = (double) (-b - rootOfDelta) / (2 * a);
            double x2 = (double) (-b + rootOfDelta) / (2 * a);
            double x = (double) (-b) / (2 * a);
            if (delta > 0) {
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0)
                System.out.println("x = " + x);
            else
                System.out.println("Delta jest mniejsza od zera. Brak pierwiastków.");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wpsółczynniki a, b i c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        pierwiastki(a, b, c);


    }
}
