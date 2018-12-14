import java.util.Arrays;

public class Zad13 {

    static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) { //i teraz jeżeli macież a będzie miałą mniej wierszy i kolumn niż b to dodawanie się uda a nie powinno
                c[i][j] = a[i][j] + b[i][j];        //więc muszę powtórzyć te pentle dla b.length zeby wygenerował się ewentualny wyjątek
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        return c;
    }

    static double[][] subtractMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }

        return c;
    }

    static double[][] multiplyMatrix(double[][] a, double[][] b) throws IndexOutOfBoundsException {
        if(a[0].length!=b.length) throw new IndexOutOfBoundsException("Złe wymiary tablic");
        double[][] c = new double[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int n = 0; n < b.length; n++) {
                    c[i][j] += a[i][n] * b[n][j];
                }
            }
        }


        return c;
    }

    static double[][] multiplyMatrix(double[][] a, double number){
        for(int i = 0 ; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                a[i][j]*=number;
            }
        }

        return a;
    }

    //tego ostatniego już szkoda czasu robić


    public static void main(String[] args) {

        double[][] a = {{2.4, 5.2}, {1.1, 2.0}};
        double[][] b = {{1.0, -5.2}, {9.9, 0}};
        double[][] c = {{-2, -3, 1}, {-1, 4, 0}};
        double[][] d = {{-2, -1, 2}, {3, 0, 1}, {2, 2, -1}};


        try {
            System.out.println("Po dodaniu: " + Arrays.deepToString(addMatrix(a, b)));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tablice muszą być jednakowych rozmiarów");
        }

        try {
            System.out.println("Po odjęciu: " + Arrays.deepToString(subtractMatrix(a, b)));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tablice muszą być jednakowych rozmiarów");
        }

        System.out.println("Po pomnożeniu: " + Arrays.deepToString(multiplyMatrix(c, d)));
        System.out.println("Po pomnożeniu przez skalar: " + Arrays.deepToString(multiplyMatrix(c,2)));



    }
}
