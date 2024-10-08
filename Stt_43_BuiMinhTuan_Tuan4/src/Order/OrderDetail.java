package Order;

public class OrderDetail {
	private Product product;
    private int quantity;

    public OrderDetail(Product product, int quantity) {
        this.setProduct(product);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetail [product=" + getProduct() + ", quantity=" + quantity + "]";
    }

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
