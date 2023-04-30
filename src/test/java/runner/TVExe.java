package runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import basepackage.Baseclass;
import flipCartLocaters.TVInput;

public class TVExe {
	
	

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
	TVInput.button.click();
	t.appliances.click();
	t.Tvbutton.click();
	t.tv.click();
	t.oneplus.click(); 
	}

}
