package Zad8;

public class Dollar extends Money {
    public Dollar(double amount) {
        super(amount);
    }

    public void add(Dollar dollar){
        this.amount+=dollar.amount;
    }


    public void add(Money money, Exchange exchange) {
        if (this.getClass() == money.getClass())
            this.amount += money.amount;
        else
            this.amount += money.amount*exchange.francToDollarRatio();
    }
}
