package Zad8;

public class Franc extends Money {
    public Franc(double amount) {
        super(amount);
    }

    public void add(Franc franc){
        this.amount+=franc.amount;
    }

    public void add(Money money, Exchange exchange) {
        if (this.getClass() == money.getClass())
            this.amount += money.amount;
        else
            this.amount += money.amount*exchange.dollarToFrancRatio();
    }

}
