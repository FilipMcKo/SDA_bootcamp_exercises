import java.util.Scanner;

public class Zad2 {

    public static int check(int[] arr){
        int count = 0;
        for(int i:arr){
            if(i%3==0&&i%2!=0) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Podaj wartości w tablicy: ");
        for (int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Ilość liczb podzielnych przez 3 lecz niepodzielnych przez 2: " + check(array));

    }
}
