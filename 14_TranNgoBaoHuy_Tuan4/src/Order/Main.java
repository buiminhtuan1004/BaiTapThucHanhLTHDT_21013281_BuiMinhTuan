package Order;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Product product1 = new Product("P1", 10.0);
	        Product product2 = new Product("P2", 20.0);

	        Order order = new Order(1, LocalDate.now());
	        order.addLineItem(product1, 3);
	        order.addLineItem(product2, 2);

	        System.out.println(order);
	        System.out.println("Total Charge: " + order.calcTotalCharge());
	}

}
