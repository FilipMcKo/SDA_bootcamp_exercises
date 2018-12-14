import java.util.ArrayList;
import java.util.Collections;

public class Zad19 {

    static ArrayList<Integer> difference(ArrayList<Integer> a, ArrayList<Integer> b) {
        Collections.sort(a);
        Collections.sort(b);
        ArrayList<Integer> c = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i) == b.get(j)) {
                    a.remove(i--);
                    b.remove(j--);
                    break;
                }
            }
        }

        c.addAll(a);
        c.addAll(b);
        Collections.sort(c);

        return c;
    }

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(4);
        a.add(3);
        a.add(3);
        a.add(2);
        a.add(3);
        a.add(1);
        b.add(3);
        b.add(3);
        b.add(2);
        b.add(5);

        System.out.println((difference(a, b)).toString());

    }
}
