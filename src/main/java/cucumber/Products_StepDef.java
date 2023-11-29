package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import se.distansakademin.Products.Product;
import se.distansakademin.Products.ProductManager;

public class Products_StepDef {
	
	ProductManager productManager = new ProductManager();
	Product product1 = new Product("Orange", 9);
	Product product2 = new Product("Apple", 6);
	
	
	
	@Given("the user is on the Online-Shop menu,")
	public void theUserIsOnTheOnlineShopMenu() {
		
		System.out.println("Main Menu:");
		System.out.println("1. Log In");
		System.out.println("2. Register");
		System.out.println("3. Browse Products");
		System.out.println("4. Exit");
		System.out.print("Enter your choice: ");
		
	}
	
	@When("the user chose browse products in the menu,")
	public void theUserChoseBrowseProductsInTheMenu() {
		
		System.out.println("3. Browse Products");
		
	}
	
	@Then("the user should be able to se a list of products.")
	public void theUserShouldBeAbleToSeAListOfProducts() {
		
		productManager.addProduct(product1);
		productManager.addProduct(product2);
		productManager.viewAllProducts();
		
		Assertions.assertEquals(2, productManager.getProductList().size());
		
		
	}
	
	
	@Given("the user sees the list of products,")
	public void theUserSeesTheListOfProducts() {
		
		System.out.println("1. Orange, 9");
		System.out.println("2. Apple, 6");
		
	}
	
	@When("the user select a specific product,")
	public void theUserSelectASpecificProduct() {
		
		int choice = 2;
	}
	
	@Then("the user should be able to see detailed information about the product.")
	public void theUserShouldBeAbleToSeeDetailedInformationAboutTheProduct() {
		
		String expected = "Product{productName='Apple', price=6}";
		String actual = product2.toString();
		
		Assertions.assertEquals(expected, actual);
		
	}
}
	
	
	

