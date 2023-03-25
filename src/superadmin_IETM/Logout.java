package superadmin_IETM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logout {
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
		driver.findElement(By.id("user_name")).sendKeys("superadmin");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("CNPSP");
		driver.findElement(By.id("snbtn")).click();
		Reporter.log("All modules are displayed");	
	
}
	@Test
	public void TestID_02() throws InterruptedException {
		driver.findElement(By.cssSelector("a[data-toggle='modal']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' NO']")).click();
		Reporter.log("logout and NO button is clickable");
	}
	@Test
	public void TestID_03() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[data-toggle='modal']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='close'])[3]")).click();
		Reporter.log("close button in logout is clickable");
	}
	@Test
	public void TestID_04() {
		driver.findElement(By.cssSelector("a[data-toggle='modal']")).click();
		driver.findElement(By.xpath("//button[text()='YES']")).click();
		Reporter.log("logout and yes button is clickable");
	}
}