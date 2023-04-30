package flipCartLocaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class CameraInput extends Baseclass {
	
	public CameraInput() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()=\"✕\"]")
	public static  WebElement button;

	@FindBy(xpath = "//div[text()=\"Electronics\"]")
	public static WebElement Electronic;
	
	@FindBy(xpath = "//a[text()=\"Cameras & Accessories\"]")
	public WebElement Acc;
	
	@FindBy(xpath = "//a[text()=\"DSLR & Mirrorless\"]")
	public WebElement dslr;
	
	@FindBy (xpath = "//div[text()='Canon EOS 3000D DSLR Camera 1 Camera Body, 18 - 55 mm Lens']")
	public WebElement camera;
	
/*	public static void actions() {
		
	Actions a = new Actions(driver);
	a.moveToElement(Electronic).build().perform();
	
	}    */
	
	
}
