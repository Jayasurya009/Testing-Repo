package basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass  {
	
	public static WebDriver driver;
	
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(Options);
		driver.manage().window().maximize();

	}

	public static void loadUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(20));

	}

	public static String getUrl() {
		return driver.getCurrentUrl();
	}
	
	public static WebElement jays(WebElement val) {
		Actions a = new Actions(driver);
		a.moveToElement(val).build().perform();
		return val;
	}
	
	public static WebElement findEleById(String Id ) {
		return driver.findElement(By.id(Id));
	}
	
	public static WebElement findbyName(String Name) {
		return driver.findElement(By.id(Name));
	}
	
	public static WebElement byXpath(String Str) {
		return driver.findElement(By.xpath(Str));
		
	}
	
	public static WebElement sendkeys(WebElement send , String str) {
		send.sendKeys(str);
		return send;
	}
	
	public static void textBox(By by,String str) {
		driver.findElement(by).sendKeys(str);
	}
	
	
	
/*	public static void Wait() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(20));
		wait.until(ExpectedConditions.visibilityOfAllElements(elements);
	}     */ 

	//public static WebElement getElement(String locator) {
//		return driver.findElement(By.xpath(locator));
	//}
	//
	//public static WebElement getElementByID(String id) {
//		return driver.findElement(By.id(id));
	//}

	public static String excelReadCell(int rowNumber, int columnNumber) throws IOException{
		File file = new File("C:\\Users\\JAYASURYA\\Desktop\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wk = new XSSFWorkbook(fis);

		Sheet sheet = wk.getSheet("Sheet3");
		Row row = sheet.getRow(rowNumber);
		Cell cell = row.getCell(columnNumber);

		String value = cell.getStringCellValue();

		return value;
	}


	public static void closeBrowser() {
		driver.quit();;
	}



	
}
