package admin_IETM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ManageUserActivity {
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
		driver.findElement(By.xpath("//a[text()=' MANAGE USER ACTIVITY']")).click();
		//Thread.sleep(2000);
		Reporter.log("User Activity button is able to clickable");
	}
	@Test
	public void TestID_03() {
		driver.findElement(By.cssSelector("button[title='Modules']")).click();
		Reporter.log("modules dropdown is clickable");
	}
	@Test
	public void TestID_04() {
		driver.findElement(By.cssSelector("button[title='Help']")).click();
		Reporter.log("hep dropdown is clickable");
	}
	@Test
	public void TestID_05() throws InterruptedException {
		driver.findElement(By.xpath("//a[@data-dt-idx='next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-dt-idx='previous']")).click();
		Reporter.log("prev and next button is clickable");
	}
	@Test
	public void TestID_06() throws InterruptedException {
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("user");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='search']")).clear();
		Reporter.log("search text box is able to enter text");
	}
	@Test
	public void TestID_07() {
		//driver.findElement(by)
	}
}
