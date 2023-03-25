package superadmin_IETM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNG {
	WebDriver driver;

	@Test
	public void TestCase_01() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91812\\Downloads\\chromedriver_106\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test	
	public void ietmLogin() 
	{	
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91812\\Downloads\\chromedriver\\chromedriver.exe");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://ietm.codeandpixels.net/#/");
		driver.manage().window().maximize();
		//input[placeholder='Enter username']
	    driver.findElement(By.id("user_name")).sendKeys("superadmin");
		driver.findElement(By.cssSelector("input[placeholder='Enter password']")).sendKeys("CNPSP");
		driver.findElement(By.id("snbtn")).click();
		//Thread.sleep(2000);
		
	}
		
		@Test
		public void ieTm() throws InterruptedException {
			driver.findElement(By.xpath("//a[text()=' EDIT IETM ']")).click();
			Thread.sleep(1000); 
			driver.findElement(By.cssSelector("i[class='lni lni-question-circle']")).click();
			Thread.sleep(1000); 
		driver.findElement(By.cssSelector("div[title='General Information']")).click();
		//Thread.sleep(2000); 
	   //  Reporter.log("Login is successfull")
		//div[@title='General Information']//img[@class='card-img-top']
	}

	
}