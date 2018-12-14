import java.util.Scanner;
public class Zad11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj koszt instalacji gazowej: ");
        double installationCost = scanner.nextDouble();
        System.out.print("Podaj spalanie na 100km w litrach: ");
        double litersPer100k = scanner.nextDouble();
        System.out.print("Podaj uśrednioną cenę benzyny za litr: ");
        double averageGasolinePrice = scanner.nextDouble();
        System.out.print("Podaj uśrednioną cenę gazu za litr: ");
        double averageLpgPrice = scanner.nextDouble();

        System.out.println("Montaż instalacji gazowej zwróci się po przejechaniu " + returnOfInvestment(installationCost,litersPer100k,averageGasolinePrice,averageLpgPrice));


    }

    private static double returnOfInvestment(double installationCost, double litersPer100k, double averageGasolinePrice, double averageLpgPrice) {

        double kilometers;
        double litersPer100kLpg = litersPer100k + 2;
        double costOf100kGasoline = litersPer100k*averageGasolinePrice;
        double costOf100kLpg = litersPer100kLpg*averageLpgPrice;
        double moneySavedPer100k= costOf100kGasoline-costOf100kLpg;
        kilometers = installationCost*100/moneySavedPer100k;

        return kilometers;
    }
}
