package Order;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private List<OrderDetail> lineItems;

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = new ArrayList<>();
    }

    public void addLineItem(Product product, int quantity) {
        if (lineItems.size() < 20) {
            lineItems.add(new OrderDetail(product, quantity));
        } else {
            System.out.println("Khong the them san pham");
        }
    }

    public double calcTotalCharge() {
    	double totalCharge = 0;
        return totalCharge;
    }

    @Override
    public String toString() {
        return "Order [orderID=" + orderID + ", orderDate=" + orderDate + ", lineItems=" + lineItems + "]";
    }
}