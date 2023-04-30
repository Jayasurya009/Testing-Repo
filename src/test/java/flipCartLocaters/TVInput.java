package flipCartLocaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class TVInput extends Baseclass {
	
	public TVInput() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//button[text()=\"✕\"]")
	public static  WebElement button;
	
	@FindBy(xpath = "//div[text()=\"Appliances\"]")
	public static WebElement appliances;
	
	@FindBy(xpath = "//span[text()=\"TVs & Appliances\"]")
	public static WebElement Tvbutton;
	
	@FindBy(xpath = "//a[text()=\"Television\"]")
	public static WebElement tv;
	
	@FindBy (xpath = "//div[@class=\"_2LURSF col col-4-12\"][2]")
	public static WebElement oneplus;
}
