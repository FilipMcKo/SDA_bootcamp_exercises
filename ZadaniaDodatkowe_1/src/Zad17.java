import java.util.Arrays;

public class Zad17 {

    static int howManyDuplicates(int[] a){
        Arrays.sort(a);
        int howMany = 0;
        if(a[0] == a[1]) howMany++;
        for(int i = 2; i<a.length; i++){
            if(a[i]==a[i-1]&&a[i]!=a[i-2]) howMany++;
        }
        return howMany;
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,6,1,6,9,3,3,4,5};
        int[] c = {1,2,3,3,4,4,4,5};
        System.out.println(howManyDuplicates(a));
        System.out.println(howManyDuplicates(b));
        System.out.println(howManyDuplicates(c));

    }
}
