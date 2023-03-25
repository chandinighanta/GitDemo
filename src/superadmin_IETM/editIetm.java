package superadmin_IETM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class editIetm {
	WebDriver driver;
	@BeforeTest
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91812\\Downloads\\chromedriver_106\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}

	@Test
	public void TestID_01() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://ietm.codeandpixels.net/#/");
		driver.findElement(By.id("user_name")).sendKeys("superadmin");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("CNPSP");
		driver.findElement(By.id("snbtn")).click();
		Reporter.log("All modules are displayed");
		
	}
	@Test
	public void TestID_02() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' EDIT IETM ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='General Information']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Manuals']")).click();	
		Reporter.log("All contents are displayed");
	}
 
	@Test
public void TestID_03() throws InterruptedException {
	driver.findElement(By.xpath("//button[@title='Next Topic']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@title='Previous Topic']")).click();
	Reporter.log("prev and Next buttons are clickable");
    }

	@Test
 public void TestID_04() throws InterruptedException {
	   driver.findElement(By.id("button-basic")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//button[@title='Help']")).click();
	   Reporter.log("home and help button are clickable");
	}
	   

	@Test
 public void TestID_05() throws InterruptedException {
		driver.findElement(By.xpath("//button[@title='History Navigation, Back']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa fa-arrow-right']")).click();
		Reporter.log("backward and forward are clickable");
	}
	
	@Test
	 public void TestID_06() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Drawings']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Glossary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='IETM Content']")).click();
		Reporter.log("all contents are clickable");
		
	}
	@Test
	 public void TestID_07() throws AWTException {
		driver.findElement(By.id("fullscreen-trigger")).click();
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ESCAPE);
		rb.keyRelease(KeyEvent.VK_ESCAPE);
		Reporter.log("Fullscreen  action is verified");
	}
	
	@Test
	 public void TestID_08() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Add New Page']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("title")).sendKeys("new page");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@title='Add new Related Content']")).click();
		
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.id("content_name0")), " Test Update").build().perform();
		Thread.sleep(2000); 
		WebElement dropdown = driver.findElement(By.id("content_type0"));
		Select s = new Select (dropdown);
		s.selectByVisibleText("IETM Core");
		JavascriptExecutor je = (JavascriptExecutor) driver;
		 je.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[name='op_access']")).click();
	    Thread.sleep(2000); 
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Reporter.log("New page added successfully");
		}
	
	@Test
	 public void TestID_09() throws InterruptedException {
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//i[@class='lni lni-search']")).click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("modules");
		Reporter.log("search action is successful");
		
	}
	@Test
	 public void TestID_10() throws InterruptedException {
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//button[@title='Logout']")).click();
		//Thread.sleep(5000); 
		//driver.findElement(By.xpath("(//button[@class='close'])[1]")).click();
		//(enabled=false)
		Reporter.log("Logout is clickable");
     }
	//button[normalize-space()='NO']
}
