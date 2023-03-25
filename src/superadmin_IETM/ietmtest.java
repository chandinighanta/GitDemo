package superadmin_IETM;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ietmtest {

  public static WebDriver driver;

	@Test
	public void TestCase_01() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91812\\Downloads\\chromedriver_106\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test	
	public void ietmLogin() throws InterruptedException
	{	
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91812\\Downloads\\chromedriver\\chromedriver.exe");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://ietm.codeandpixels.net/#/");
		driver.manage().window().maximize();
		//input[placeholder='Enter username']
	    driver.findElement(By.id("user_name")).sendKeys("superadmin");
		driver.findElement(By.cssSelector("input[placeholder='Enter password']")).sendKeys("CNPSP");
		driver.findElement(By.id("snbtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()=' EDIT IETM ']")).click();
		
    	// driver.findElement(By.className("btn")).click();
    	 
		 Thread.sleep(2000); 
		driver.findElement(By.cssSelector("div[title='General Information']")).click();
		
		 Thread.sleep(2000); 
		 Actions a = new Actions(driver);
	     a.moveToElement(driver.findElement(By.xpath("//i[@class='fa fa-desktop']"))).build().perform();
   
    	   Thread.sleep(2000); 
		driver.findElement(By.cssSelector("a[title='Add New Page']")).click();
		driver.findElement(By.name("title")).sendKeys("TEST PAGE");
     
    	   Thread.sleep(2000); 
    	   
		driver.findElement(By.cssSelector("i[title='Add new Related Content']")).click();
		Thread.sleep(2000);
	   // Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.id("content_name0")), "Test Update").build().perform();
		 Thread.sleep(2000); 
		WebElement dropdown = driver.findElement(By.id("content_type0"));
		Select s = new Select (dropdown);
		s.selectByVisibleText("IETM Core");
		 Thread.sleep(2000); 
		JavascriptExecutor je = (JavascriptExecutor) driver;
		 je.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		//check box
	    driver.findElement(By.cssSelector("input[name='op_access']")).click();
	    Thread.sleep(2000); 
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.close();
       }
		

}
