package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commoncode.AmazonCode;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobject.AmazonPageObject;

public class AmazonSteps  {

	WebDriver driver;
	AmazonPageObject td;
	
	
	@Given("User on the Amazon Home page")
	public void user_on_the_Amazon_Home_page() {
		
		
		  driver=AmazonCode.getbrwser("chrome", driver);
		
		 driver.get(AmazonCode.getURL()); 
		  td=PageFactory.initElements(driver,
		  AmazonPageObject.class);
		 
	 }

	@When("User click on Today's Deals")
	public void user_click_on_Today_s_Deals() {
	td.getTodayDeals().click();
	  
	}

	@When("click on cell phones box")
	public void click_on_cell_phones_box() {
	td.getCellPhone().click();    
	}

	@When("click on {int}% off box")
	public void click_on_off_box(Integer int1) {
	td.getsale().click();  
	}

	@Then("User able to see the item lists successfully")
	public void user_able_to_see_the_item_lists_successfully() {
	    
	}

}
