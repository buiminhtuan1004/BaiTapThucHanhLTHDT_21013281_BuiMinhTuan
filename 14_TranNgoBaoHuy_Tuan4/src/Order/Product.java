package Order;

public class Product {
    private String productID;
    private double price;
    private String description;

    public Product(String productID, double price) {
        this.productID = productID;
        this.price = price;
    }

    public double calcTotalPrice(int quantity) {
        return quantity * price;
    }

    @Override
    public String toString() {
        return "Product [productID=" + productID + ", price=" + price + ", description=" + description + "]";
    }
}