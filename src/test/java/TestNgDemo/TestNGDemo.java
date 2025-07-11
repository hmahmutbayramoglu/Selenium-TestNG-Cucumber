package TestNgDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 

public class TestNGDemo {

	private WebDriver driver;
	
	
	//@BeforeTest
	//@BeforeClass
	@BeforeMethod 
	public void setup() {
		   WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    System.out.println("Driver setup çalıştı");
	}
	
	//@AfterTest
	//@AfterClass
	@AfterMethod
	public void teardown() {
		   if (driver != null) {
		        driver.quit();
		        System.out.println("Driver kapandı");
		    }
	}
	
	@Test(groups = {"GroupA"})
	public void Test1() {
		if (driver == null) {
		    throw new IllegalStateException("Driver başlatılmamış!");
		}

		driver.get("https://www.google.com.tr");
		System.out.println("Test 1");
	}
	
	@Test(groups = {"GroupB"}, priority = 1) // priority test sıralama default=0
	public void Test2() {
		driver.get("https://www.google.com.tr");
		System.out.println("Test 2");
	}
	
	@Test(groups = {"GroupA", "GroupB"})
	public void Test3() {
		driver.get("https://www.google.com.tr");
		System.out.println("Test 3");
	}
	
	@Test(groups = "failedTests", priority = 1)
	public void Test4() {
		driver.get("https://www.google.com.tr");
		System.out.println("Test 4");
	}
	
	
	
	
	@Test(groups = "successfulTests", enabled = false)
	public void successMailSend() {
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com.tr");
		System.out.println("Success Mail Sender Test");
		//driver.close();
	}
	
	@Test(groups = "failedTests")
	public void unSuccessMailSend() {
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com.tr");
		System.out.println("Unsuccess Mail Sender Test");
		//driver.close();
	}
	
}
