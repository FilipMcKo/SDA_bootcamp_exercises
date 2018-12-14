package Zad8;

public class OperationOnMoney {

    public static void main(String[] args) {
        {
            System.out.println(new Money(5).equals(new Money(5))); //true
            System.out.println(new Money(5).equals(new Money(6)));  //false

            System.out.println(new Dollar(5).equals(new Franc(5))); //false
            System.out.println(new Franc(5).equals(new Dollar(5))); //false

            System.out.println(new Franc(5).equals(new Franc(6))); //false
            System.out.println(new Dollar(5).equals(new Dollar(5))); //true
        }

        { Dollar dollar = new Dollar(5);
        System.out.println(dollar.getAmount());
        dollar.add(new Dollar(6));
        System.out.println(dollar.getAmount());}

        {Dollar dollar1 = new Dollar(3);
        Exchange exchange = new Exchange(0.5, 2);
        Franc franc = exchange.dollarToFranc(dollar1);
        System.out.println(franc.getAmount());
        Dollar dollar2 = exchange.francToDollar(franc);
        System.out.println(dollar2.getAmount());}

        Dollar dollar = new Dollar(3);
        Franc franc = new Franc(2);
        dollar.add(franc,new Exchange(0.5,2));
        System.out.println(dollar.getAmount());

        System.out.println(dollar.getClass().getDeclaredFields());


    }


}
