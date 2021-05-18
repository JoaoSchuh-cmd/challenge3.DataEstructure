package atividade2;

import java.util.ArrayList;
import java.util.List;

public class Order extends Object {
	
	private int orderId;
	private int orderDate;
	private double totalValue, discountValue, totalProcuctsValue;
	private List<Product> products = new ArrayList();
	
	void addProduct(Product p) {
		products.add(p);
		updateTotalValue();
	};
	
	void removeProduct(long id) {
		findById(id);
		Product prod = findById(id);
		products.remove(prod);
//		products.remove(findById(id));
		updateTotalValue();
	};
	
	void updateQuantity(Product p, double newQuantity) {
		Product productToUpdate = findById(p.productId);
		productToUpdate.quantityInStock = newQuantity;
		products.add(findIndexById(p.productId), productToUpdate);
		updateTotalValue();
	};
	
	public Product findById(long id) {
		for(Product p:products) {
			if (p.productId == id) {
				return p;
			}
		}
		return null;
	};
	
	public Product findByName(String name) {
		for(Product p:products) {
			if (p.productName.equalsIgnoreCase(name)) {
				return p;
			}
		}
		return null;
	};
	
	public int findIndexById(long id) {
		for (int i = 0; i < products.size(); i++) {
			Product p = products.get(i);
			if(p.productId == id) {
				return i;
			}
		}
		return -1;
	};
	
	private void updateTotalValue() {
		double total = 0;
		for (Product p : products) {
			total += p.price;
		}
		totalValue = total;
	}
}
