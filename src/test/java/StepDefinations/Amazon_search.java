package StepDefinations;

import io.cucumber.java.en.*;

public class Amazon_search 

{

	@Given("i have a search field on amazone page")
	public void i_have_a_search_field_on_amazone_page() 
	{
	
	
	}

	@When("i search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productname, Integer price) 
	
	{
		System.out.println(productname+price);
		
	}
	
	
	

	@Then("product with name {string} should be diplayed")
	public void product_with_name_should_be_diplayed(String productname) 
	{

System.out.println(productname);
}
	

}
