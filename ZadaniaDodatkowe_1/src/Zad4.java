import java.util.Scanner;

public class Zad4 {

    static boolean isPalindrome(Integer n){
        int nLength = n.toString().length();
        for(int i = 0; i<(nLength/2); i++){
            if(n.toString().charAt(i)!=n.toString().charAt(nLength-1-i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number: ");
        Integer n = sc.nextInt();
        System.out.println("The number is palindrome(?): " + isPalindrome(n));

    }
}
