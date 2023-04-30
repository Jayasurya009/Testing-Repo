package executionPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;
import flipCartLocaters.CameraInput;
import flipCartLocaters.TVInput;

public class Execution extends Baseclass {
	


	public Execution() {
		PageFactory.initElements(driver, this);
	}

	
	@Before
	public void BL() {
	Baseclass.browserLaunch();
	Baseclass.loadUrl("https://www.flipkart.com/");
	}
	
	@After
	public void CL() {
		Baseclass.closeBrowser();
	}
	
	
	@Test
	public void TV() {
	
     TVInput t = new TVInput();
	t.button.click();
	t.appliances.click();
	t.Tvbutton.click();
	t.tv.click();
	t.oneplus.click(); 
	
	}
	
	@Test
	public void Camera() {
	CameraInput c = new CameraInput();
	CameraInput.button.click();
    Baseclass.jays(CameraInput.Electronic);
	c.Acc.click();
	c.dslr.click();
	c.camera.click();
	
	}
	
/*	FlightInput f = new FlightInput();
	f.button.click();
	f.travel.click();
	f.From.sendKeys("chennai");
	f.To.sendKeys("bangalore");
	f.On.click();;  */
	
	

	}


