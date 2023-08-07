//Abstract creator class that contains the factory method
public abstract class Creator {

    public Product orderProduct() {
        Product product = createProduct();
        product.provideService();
        return product;
    }
    //The following is the factory method
    public abstract Product createProduct();
}
