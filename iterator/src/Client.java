import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Product p1 = new Product("TV", 2000.0);
        Product p2 = new Product("Geladeira", 4000.0);
        ProductsCollection productsCollection = new ProductsListCollection(Arrays.asList(p1, p2));
        ProductIterator productIterator = productsCollection.createIterator();

        while (productIterator.hasNext()) {
            System.out.println(productIterator.getNext());
        }
    }
}