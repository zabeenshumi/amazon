package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class AmazonPageObject {
	
	WebDriver driver;
  public AmazonPageObject(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	  
  }
	
 @FindBy (xpath= "(//a[@class='nav-a'])[4]")
  private WebElement TodayDeals;
public WebElement getTodayDeals() {
	return TodayDeals;
} 
  
@FindBy (xpath= "(//span[@class='a-label a-checkbox-label'])[11]")
private WebElement  CellPhone;
public WebElement getCellPhone() {
	return CellPhone;
}
  
  
@FindBy (xpath= "(//a[@class='a-link-normal'])[76]")
private WebElement sale;
public WebElement getsale() {
	return sale;
}  
  
  
  
  
  
  
  
  
  
}
