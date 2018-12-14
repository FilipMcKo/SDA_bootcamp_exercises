import java.util.Scanner;

public class Zad12 {

    static void pascalTriangle(int n) {
        int[][] pascal = new int[n][n];
        pascal[0][0] = 1;
        if (n > 1) {
            pascal[1][0] = 1;
            pascal[1][1] = 1;
        }

        for (int i = 2; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == i) pascal[i][j] = 1;
                else pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(pascal[n - 1][i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ktory wiersz trójkąta Pascala podać: ");
        int n = scanner.nextInt();
        pascalTriangle(n);

    }
}
