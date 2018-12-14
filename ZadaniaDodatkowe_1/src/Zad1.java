public class Zad1 {

    public static void main(String[] args) {

        for(int i=20; i>=10; i--){
            System.out.println(i);
            System.out.println((int)(Math.pow(2,Math.abs(i-20))));
        }
    }
}
