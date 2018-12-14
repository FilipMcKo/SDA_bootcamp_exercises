package Zad8;

public class Exchange {

    private double dToFRatio;
    private double fToDRatio;

    public Exchange(double dToFRatio, double fToDRatio) {
        this.dToFRatio = dToFRatio;
        this.fToDRatio = fToDRatio;
    }

    public double dollarToFrancRatio() {
        return dToFRatio;
    }

    public double francToDollarRatio() {
        return fToDRatio;
    }

    public Franc dollarToFranc(Dollar dollar){
        return new Franc(fToDRatio*dollar.getAmount());
    }

    public Dollar francToDollar(Franc franc){
        return new Dollar(dToFRatio*franc.getAmount());
    }

}
