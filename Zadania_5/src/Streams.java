import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams {

    public static Product lowestPrice(List<Product> products) {
        return products.stream().sorted((p1, p2) -> p1.getPrice().compareTo(p2.getPrice())).findFirst().get();
    }

    public static Double priceSum(List<Product> products) {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public static BigDecimal priceSumBD(List<ProductBD> productBD) {
        return productBD.stream().map(ProductBD::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static List<Product> aOnly(List<Product> products) {
        return products.stream().filter(p -> p.getName().toLowerCase().charAt(0) == 'a').collect(Collectors.toList());
    }

    public static List<Product> priceRange(List<Product> products) {
        return products.stream().filter(p -> (p.getPrice() >= 10 && p.getPrice() <= 20)).collect(Collectors.toList());
    }

    public static List<ProductBD> priceRangeBD(List<ProductBD> productBD) {
        return productBD.stream().filter(new Predicate<ProductBD>() {
            @Override
            public boolean test(ProductBD productBD) {
                if ((productBD.getPrice().compareTo(BigDecimal.TEN) == 0 || productBD.getPrice().compareTo(BigDecimal.TEN) == 1) &&
                        (productBD.getPrice().compareTo(BigDecimal.valueOf(20)) == 0 || productBD.getPrice().compareTo(BigDecimal.valueOf(20)) == -1))
                    return true;
                return false;
            }
        }).collect(Collectors.toList());
    }

    public static List<Product> sort(List<Product> products) {
        return products.stream().sorted((p1, p2) -> p1.getPrice().compareTo(p2.getPrice())).collect(Collectors.toList());
    }

    public static List<ProductBD> sortBD(List<ProductBD> productBD){
        return productBD.stream().sorted((p1,p2) -> p1.getPrice().compareTo(p2.getPrice())).collect(Collectors.toList());
    }

}
