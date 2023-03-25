package admin_IETM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyHotspot {
	WebDriver driver;
	@BeforeTest
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91812\\Downloads\\chromedriver_win32 _108\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	@Test
	public void TestID_01() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://ietm.codeandpixels.net/#/");
		driver.findElement(By.cssSelector("input[placeholder='Enter username']")).sendKeys("administrator");
		driver.findElement(By.cssSelector("input[placeholder='Enter password']")).sendKeys("Admin_Ietm");
		driver.findElement(By.id("snbtn")).click();
		Reporter.log("All modules are displayed");
	}
	@Test
	public void TestID_02() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='MY HOTSPOTS ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='TEXXT HOT SPOT']")).click();
		Reporter.log("modules are clickable");
	}
	@Test
	public void TestID_03() throws InterruptedException {
		driver.findElement(By.cssSelector("i[class='fa fa-arrow-left']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-arrow-right']")).click();
		Reporter.log("backward and forward navigation is clickable");
	}
	@Test
	public void TestID_04() {
		
	}
}
