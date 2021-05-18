package atividade2;

public class Product {
	public int productId; 
    public double quantityInStock; 
    public double price;
    public String productName;
    public String brand;
	
	@Override
	public String toString() {
        return "Id: " + productId + "\n" + "Nome: " + productName + "\n" + "Marca: " + brand + "\n" + "Quantidade: " + quantityInStock + "\n" + "Preço: " + price + "\n"; 
    }
	
}
