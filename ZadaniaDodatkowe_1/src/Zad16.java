import java.util.Scanner;

public class Zad16 {

    private static int fibonacci(int n) {
        int f[] = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj który wyraz ciągu F. chcesz zobaczyć: ");
        int n = scanner.nextInt();

        System.out.println(fibonacci(n));

    }


}
