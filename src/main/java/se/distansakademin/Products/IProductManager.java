package se.distansakademin.Products;

import java.util.List;

public interface IProductManager {
	
	void removeProduct(String name);
	
	void addProduct(Product product);
	
	void viewAllProducts();
	
	boolean productExists(Product product);
	
	List<Product> getProductList();
	
}
