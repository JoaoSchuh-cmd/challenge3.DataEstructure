package atividade2;

public class Activity2Main {
	public static void main(String[] args) {
		Product product = new Product();
		
		Order order = new Order();
		order.addProduct(product);
		order.updateQuantity(product, 25.0);
	}
}
