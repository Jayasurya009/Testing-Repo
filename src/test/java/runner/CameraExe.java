package runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import basepackage.Baseclass;
import flipCartLocaters.CameraInput;
import flipCartLocaters.TVInput;

public class CameraExe {

	

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
	public void Camera() {
	CameraInput c = new CameraInput();
	CameraInput.button.click();
    Baseclass.jays(CameraInput.Electronic);
	c.Acc.click();
	c.dslr.click();
	c.camera.click();
	
	}
}
