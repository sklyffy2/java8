import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Product> numbers = new ArrayList<>();
        numbers.add(new Product(10));
        numbers.add(new Product(9));
        numbers.add(new Product(12));
        List<String> str = numbers
                .stream()
                .filter(product -> product.getPrice() < 0)
                .map(product -> Integer.toString(product.getPrice()))
                .collect(Collectors.toList());

        List<Product> t = numbers
                .stream()
                .filter(product -> product.getPrice() < 0)
                .collect(Collectors.toList());
        Optional<Product> productWithZero = numbers
                .stream()
                .filter(product -> product.getPrice() < 0)
                .findFirst();
        productWithZero.ifPresent(System.out::println);
        boolean io = productWithZero.isPresent();
        System.out.println(productWithZero);
        Product p = productWithZero.orElse(new Product(10));
        System.out.println(p);
//boolean anyMatch = numbers
  //      .stream()
  //      .anyMatch(product -> product.getPrice()<0);
//System.out.println(anyMatch);
    }
}
