import java.util.ArrayList;
import java.util.List;

public class ProductsListCollection implements ProductsCollection {
    private List<Product> products;

    public ProductsListCollection(List<Product> products) {
        this.products = products;
    }

    @Override
    public ProductIterator createIterator() {
        return new ProductReverseIterator(this);
    }

    public List<Product> getProducts() {
        return products;
    }
}
