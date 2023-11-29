package se.distansakademin.Products;

import java.util.ArrayList;
import java.util.List;

public class ProductManager implements IProductManager {
	
	List<Product> productList = new ArrayList();
	
	
	@Override
	public void removeProduct(String productName) {
		
		for (Product product : productList) {
			if (product.getProductName().equals(productName)) {
				productList.remove(product);
				break;
			}
		}
	}
	
	@Override
	public void addProduct(Product product) {
		
		if (!productExists(product)) {
			productList.add(product);
		}
	}
	
	
	@Override
	public void viewAllProducts() {
		for (Product product : productList) {
			System.out.println(product);  // Assuming the Product class has a meaningful toString() method
		}
	}
	
	@Override
	public boolean productExists(Product product) {
		
		for (Product existingProduct : productList) {
			if (existingProduct.getProductName().equals(product.getProductName())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public List<Product> getProductList() {
		
		return productList;
	}
}
