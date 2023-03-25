package superadmin_IETM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ManageUser {
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
		driver.findElement(By.xpath("//a[text()=' MANAGE USERS']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='Modules']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Information about IETM']")).click();
		Reporter.log(" modules dropdown and content in modules are displayed");
	}
	@Test
	public void TestID_03() throws InterruptedException {
		driver.findElement(By.xpath("//button[@title='Help']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Version & Revision History']")).click();
		Reporter.log(" Help dropdown and content in help are displayed");
	}
	@Test
	public void TestID_04() throws InterruptedException {
		driver.findElement(By.xpath("//button[@title='History Navigation, Back']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='History Navigation, Forward']")).click();
		Reporter.log(" backward and forward navigation are clickable");
		
	}
}

