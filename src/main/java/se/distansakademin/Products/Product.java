package se.distansakademin.Products;

public class Product {
	
	String productName;
	int price;
	
	
	public Product(String productName, int price) {
		
		this.productName = productName;
		this.price = price;
	}
	
	public String getProductName() {
		
		return productName;
	}
	
	public void setProductName(String productName) {
		
		this.productName = productName;
	}
	
	public int getPrice() {
		
		return price;
	}
	
	public void setPrice(int price) {
		
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return "Product{" +
				"productName='" + productName + '\'' +
				", price=" + price +
				'}';
	}
}
