package encapsulationExercises.pr_04_EE;

/**
 * Created by typer on 10/26/16.
 */
public class Product {
    private String product;
    private double price;

    public Product(String product, double price) {
        setProduct(product);
        setPrice(price);
    }

    public void setProduct(String product) {
        if (product.isEmpty() || product.trim().length() <= 0){
            throw new IllegalArgumentException("Name cannot be empty");
        }else{
            this.product = product;
        }
    }

    public void setPrice(double price) {
        if (price < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }else{
            this.price = price;
        }
    }

    public String getProduct() {
        return this.product;
    }

    public double getPrice() {
        return this.price;
    }
}
