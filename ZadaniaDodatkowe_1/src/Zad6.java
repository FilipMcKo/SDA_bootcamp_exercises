import java.util.Scanner;

public class Zad6 {

    static String reverse(String word) {
        String drow = new String();
        for (int j = word.length() - 1; j >= 0; j--) {
            Character temp = word.charAt(j);
            String temp1 = temp.toString();
            drow = drow.concat(temp1);
        }

        return drow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String word = sc.nextLine();
        System.out.println("Odwrócono: " + reverse(word));


    }
}
