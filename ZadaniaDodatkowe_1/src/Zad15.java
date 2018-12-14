public class Zad15 {

    static int doesntMatch(int[] a) {
        boolean allEven;
        int wrongNr=0;

        if ((a[0] % 2 == 0 && a[1] == 0) || (a[0] % 2 == 0 && a[2] % 2 == 0) || (a[1] % 2 == 0 && a[2] % 2 == 0))
            allEven = true;
        else allEven = false;

        if(allEven){
            for(int i = 0; i<a.length; i++){
                if(a[i]%2!=0) wrongNr = a[i];
            }
        }
        else{
            for(int i = 0; i<a.length; i++){
                if(a[i]%2==0) wrongNr = a[i];
            }
        }


    return wrongNr;
    }

    public static void main(String[] args) {

        int[] a = {2, 4, 0, 100, 4, 11, 2602, 36};
        int[] b = {160, 3, 1719, 19, 11, 13, -21};

        System.out.println(doesntMatch(a));
        System.out.println(doesntMatch(b));

    }
}
