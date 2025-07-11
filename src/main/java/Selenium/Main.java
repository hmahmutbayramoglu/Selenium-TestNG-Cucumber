package Selenium;

 
import java.sql.DriverManager;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Main {

	public static void main(String[] args) {


		
		/*
		WebDriverManager.chromedriver().setup();
		WebDriver driverManager = new ChromeDriver();
		driverManager.manage().window().maximize();
		
		driverManager.get("https://google.com/");
		
		//timeouts
		driverManager.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS); // sayfanın yüklenmesini bekler.
		driverManager.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS); // yapılan işlemi bekler.
	
		//window
		driverManager.manage().window().maximize();
		driverManager.manage().window().minimize();
		
		int x = driverManager.manage().window().getPosition().getX(); // pencerenin x üzerindeki konumu
		int y = driverManager.manage().window().getPosition().getY(); // pencerenin y üzerindeki konumu
		
		driverManager.get("urladresi"); // url açtırma
		
		String CurrentUrlName= driverManager.getCurrentUrl();// url getirir
		String titleString = driverManager.getTitle(); // title getirir
		String pageSource = driverManager.getPageSource(); // kaynak kod geitirir
		
		// Navigate
		
		driverManager.navigate().back(); // geri git
		driverManager.navigate().forward(); // ileri git
		driverManager.navigate().refresh(); // sayfayı yenile
		
		try { 
			Thread.sleep(5000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		driverManager.quit();
		*/
		
		/*
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://eurotechbilisim.com.tr/iletisim.html");
		WebElement element1 = driver.findElement(By.id(""));
		WebElement element2 = driver.findElement(By.cssSelector(""));
		WebElement element3 = driver.findElement(By.xpath(""));
		WebElement element4 = driver.findElement(By.name("firstname"));
		WebElement element5 = driver.findElement(By.linkText(""));
		WebElement element6 = driver.findElement(By.className(""));
		
		
		element1.click();
		element1.sendKeys("mhuseyinbayramoglu@gmail.com"); // elemanın içine yazı yazma
		*/
		/*
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://eurotechbilisim.com.tr/iletisim.html");
		
		WebElement firstNameTxt = driver.findElement(By.name("firstname"));
		WebElement lastNameTxt = driver.findElement(By.name("lastname"));
		WebElement emailTxt = driver.findElement(By.name("email"));
	//	WebElement sendMessageButton = driver.findElement(By.xpath("//button[text()='Gönder']"));
		 

		firstNameTxt.click();
		firstNameTxt.sendKeys("Mahmut Hüseyin");
		
		lastNameTxt.click();
		lastNameTxt.sendKeys("Bayramoğlu");
		
		emailTxt.click();
		emailTxt.sendKeys("mhuseyinbayramoglu@gmail.com");
		
	
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement sendMessageButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Gönder']")));
		sendMessageButton.click();
		//driver.manage().timeouts().getImplicitWaitTimeout();
		*/
		
		/*
		    WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get("https://eurotechbilisim.com.tr/iletisim.html");

	        // Doğru name attributeleri ile input'lara ulaş
	        WebElement firstNameTxt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
	        WebElement lastNameTxt = driver.findElement(By.name("lastname")); // küçük harf
	        WebElement emailTxt = driver.findElement(By.name("_replyto"));    // doğru name
	        WebElement messageTxt = driver.findElement(By.name("message"));   // mesaj alanı
	        WebElement sendMessageButton = driver.findElement(By.xpath("//button[text()='Gönder']"));
	        
	        // Formu doldur
	        firstNameTxt.sendKeys("Mahmut Hüseyin");
	        lastNameTxt.sendKeys("Bayramoğlu");
	        emailTxt.sendKeys("mhuseyinbayramoglu@gmail.com");
	        messageTxt.sendKeys("Merhaba! Bu bir test mesajıdır.");

	        // Butona tıkla
	        sendMessageButton.click();

	        // Sonuç sayfasının yüklenmesini bekle (Formspree yönlendirmesi)
	        wait.until(ExpectedConditions.urlContains("formspree.io"));
	        System.out.println("Form başarıyla gönderildi.");
	        
	        //javascript kodu çalıştırma
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("window.scrollBy(0,550)","");
	         
	        driver.quit();
	        */

	        // scroll down java selenium

 
			//DemoSelenium demoSelenium = new DemoSelenium(); 
			//demoSelenium.DemoQaDemo1();

		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}