import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zad10 {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj pierwszy wyraz: ");
        String word1 = sc.nextLine();
        System.out.println();
        System.out.print("Podaj drugi wyraz: ");
        String word2 = sc.nextLine();

        System.out.println("Czy to anagramy? " + ifAnagram(word1, word2));
        //ifAnagram(word1, word2);
    }

    private static boolean ifAnagram(String word1, String word2) {

        char[] word1Arr = word1.toCharArray();
        char[] word2Arr = word2.toCharArray();
        Arrays.sort(word1Arr);
        Arrays.sort(word2Arr);

        if(word1.length()!=word2.length()) return false;

        for(int i = 0; i<word1.length(); i++){
            if(word1Arr[i]!=word2Arr[i]) return false;
        }

        return true;

    }
}
