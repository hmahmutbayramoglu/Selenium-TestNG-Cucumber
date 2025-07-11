package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class DemoSelenium {
 
	
	
	public void DemoQaDemo1() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driverManager = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driverManager, Duration.ofSeconds(5));
		driverManager.manage().window().maximize();
		driverManager.get("https://demoqa.com/");

		// Sayfa yüklendikten sonra ilk butonun görünmesini bekle
		WebElement elementCategoryButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.cssSelector("div[class='category-cards'] div:nth-child(1) div:nth-child(1) div:nth-child(1)")
		));
		elementCategoryButton.click();
		
		WebElement webTableButton = driverManager.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']"));
		webTableButton.click();
		
		WebElement formAddButton = driverManager.findElement(By.id("addNewRecordButton"));
		formAddButton.click();
		
		
		WebElement formInputFirstName = wait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("//input[@id='firstName']")
			));
		WebElement formInputLastName = driverManager.findElement(By.id("lastName"));
		WebElement formInputEmailAddress = driverManager.findElement(By.id("userEmail"));
		WebElement formInputAge = driverManager.findElement(By.id("age"));
		WebElement formInputSalary = driverManager.findElement(By.id("salary"));
		WebElement formInputDepartment = driverManager.findElement(By.id("department"));
		WebElement formSubmitButton = driverManager.findElement(By.xpath("//button[@id='submit']"));

		
		formInputFirstName.click();
		formInputFirstName.sendKeys("Mahmut Hüseyin");
		formInputFirstName.sendKeys(Keys.TAB);
		
		formInputLastName.sendKeys("Bayramoğlu");
		formInputLastName.sendKeys(Keys.TAB);
		
		formInputEmailAddress.sendKeys("mhuseyinbayramoglu@gmail.com");
		formInputEmailAddress.sendKeys(Keys.TAB);
		
		formInputAge.sendKeys("22");
		formInputAge.sendKeys(Keys.TAB);
		
		formInputSalary.sendKeys("145000");
		formInputSalary.sendKeys(Keys.TAB);
		
		formInputDepartment.sendKeys("Full Stack Developer");
		formInputDepartment.sendKeys(Keys.TAB);
		
		formSubmitButton.click();
		
		
		
	}
	
	
}
