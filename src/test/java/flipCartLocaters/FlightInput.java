package flipCartLocaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class FlightInput extends Baseclass {


	public FlightInput() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()=\"✕\"]")
	public static  WebElement button;
	
	@FindBy(xpath = "//div[text()=\"Travel\"]")
	public WebElement travel;
	
	@FindBy(name="0-departcity")
	public static WebElement From;
	
	@FindBy(name="0-arrivalcity")
	public static WebElement To;
	
	@FindBy(xpath = "//label[text()='Depart On']")
	public static WebElement On;
	
	@FindBy(xpath = "//span[text()=\"SEARCH\"]")
	public WebElement search;
	
	public static void actions() {
		
		Actions a = new Actions(driver);
		a.click(From).build().perform();
		a.click(To).build().perform();
		a.sendKeys(On, "05-March").click().build().perform();
		
		}

}
