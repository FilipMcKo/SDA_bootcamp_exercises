public class Zad3 {

    static boolean checkIfPrimary(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static void primaryGenerator(int n) {
        int count = 0;
        int nrCandidate = 2;

        while (count < n) {
            if (checkIfPrimary(nrCandidate)) {
                System.out.println(nrCandidate);
                nrCandidate++;
                count++;
            } else nrCandidate++;
        }

    }

    public static void main(String[] args) {

        primaryGenerator(3);

    }
}
