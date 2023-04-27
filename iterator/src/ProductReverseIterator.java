public class ProductReverseIterator implements ProductIterator {
    private final ProductsListCollection products;
    private int index;

    public ProductReverseIterator(ProductsListCollection products) {
        this.products = products;
        index = 0;
    }

    @Override
    public Product getNext() {
        Product product = products.getProducts().get(index);
        index++;
        return product;
    }

    @Override
    public boolean hasNext() {
        return products.getProducts().size() >= index + 1;
    }
}