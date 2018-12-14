import java.util.Arrays;

public class Zad14 {

    static int[] biggestSubset(int[] a) {
        int[][] array = new int[a.length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                array[i][j] = Integer.MIN_VALUE;
            }
        }

        for (int i = 0; i < a.length; i++) {
            array[i][i] = a[i];
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                array[i][j] = array[i][j - 1] + a[j];
            }
        }
        int n = 0;
        int m = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(array[i][j]>max){
                    max = array[i][j];
                    n=i;
                    m=j;
                }
            }
        }

        int sizeOfSubset = m - n + 1;
        int[] subSet = new int[sizeOfSubset];

        for(int i = 0; i<sizeOfSubset; i++){
            subSet[i] = a[n];
            n++;
        }

        return subSet;
    }


    public static void main(String[] args) {

        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(Arrays.toString(biggestSubset(a)));
    }
}
