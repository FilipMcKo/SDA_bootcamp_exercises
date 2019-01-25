import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Bread", 3.23),
                new Product("Milk", 1.45),
                new Product("Eggs", 7.43),
                new Product("TV", 2299.99),
                new Product("Water", 0.99),
                new Product("Artificial apple", 9.99),
                new Product("Artificial banana", 13.99),
                new Product("Potatos", 15.55),
                new Product("Gum", 0.15),
                new Product("alabama", 10.10)
                ,new Product("bag", 10.0)
                ,new Product("snow", 20.0)
                ,new Product("ice", 20.0));

        List<ProductBD> productsBD = Arrays.asList(
                new ProductBD("Bread", 3.23),
                new ProductBD("Milk", 1.45),
                new ProductBD("Eggs", 7.43),
                new ProductBD("TV", 2299.99),
                new ProductBD("Water", 0.99),
                new ProductBD("Artificial apple", 9.99),
                new ProductBD("Artificial banana", 13.99),
                new ProductBD("Potatos", 15.55),
                new ProductBD("Gum", 0.15),
                new ProductBD("alabama", 10.10)
                ,new ProductBD("bag", 10.0)
                ,new ProductBD("snow", 20.0)
                ,new ProductBD("ice", 20.0)
        );

        System.out.println("Lowest price: " + Streams.lowestPrice(products));
        System.out.println("Summed prices: " + Streams.priceSum(products));
        System.out.println("Summed pricesBD: " + Streams.priceSumBD(productsBD));
        System.out.println("Products starting with 'a': " + Streams.aOnly(products));
        System.out.println("Price between 10 and 20: " + Streams.priceRange(products));
        System.out.println("PriceBD between 10 and 20: " + Streams.priceRangeBD(productsBD));
        System.out.println("Sorted by price: " + Streams.sort(products));
        System.out.println("Sorted by priceBD: " + Streams.sortBD(productsBD));
    }
}
