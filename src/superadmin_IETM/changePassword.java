package superadmin_IETM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class changePassword {
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
	public void TestID_02() {
		driver.findElement(By.xpath("//a[text()=' CHANGE PASSWORD']")).click();
		driver.findElement(By.id("oldpassword")).sendKeys("abcd");
		driver.findElement(By.id("newpwd")).sendKeys("1234");
		driver.findElement(By.id("retypepwd")).sendKeys("1234");
		driver.findElement(By.id("Changepwd")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='Invalid Old Password']")).getText());	
		Reporter.log("all password text boxes are clickable");
	}
	@Test(enabled=false)
	public void TestID_03() throws InterruptedException {
		driver.findElement(By.cssSelector("button[title='Modules']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[title='Help']")).click();
		Reporter.log("dropdown button are clickable");
	}
	@Test(enabled=false)
	public void TestID_04() throws InterruptedException {
		
		driver.findElement(By.cssSelector("button[title='History Navigation, Back']")).click();
     	Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=' CHANGE PASSWORD']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[title='Home']")).click();
		Reporter.log("home and back navigation button are clickable");
	}
	@Test(enabled=false)
	public void TestID_05() throws InterruptedException {
		driver.findElement(By.cssSelector("button[title='Logout']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' NO']")).click();
		Reporter.log("logout button is clickable");
	}
}
