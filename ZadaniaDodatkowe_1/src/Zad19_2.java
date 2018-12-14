import java.util.Arrays;

import static java.util.Arrays.sort;

public class Zad19_2 {

    static Integer[] difference(Integer[] a, Integer[] b) {

        sort(a);
        sort(b);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    a[i]= null;
                    b[j] =null;
                    break;
                }
            }
        }
        int sizeOfC =0;
        int indexOfC=0;
        for (int i = 0; i<a.length; i++) if(a[i]!=null) sizeOfC++;
        for (int i = 0; i<b.length; i++) if(b[i]!=null) sizeOfC++;

        Integer[]c = new Integer[sizeOfC];
        for (int i = 0; i<a.length; i++) if(a[i]!=null) {
            c[indexOfC++]=a[i];
        }
        for (int i = 0; i<b.length; i++) if(b[i]!=null) {
            c[indexOfC++]=b[i];
        }
        sort(c);
        return c;
    }

    public static void main(String[] args) {
        Integer[] a = {2, 6, 3, 1, 1, 2};
        Integer[] b = {6, 1, 1, 1, 9, 2};

        System.out.println(Arrays.toString(difference(a,b)));

    }
}
