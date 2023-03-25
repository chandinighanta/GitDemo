package superadmin_IETM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class managemodules {
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
		driver.findElement(By.xpath("//a[text()=' MANAGE MODULES']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Home']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href='#/home/managemodules']")).click();
		Reporter.log("Modules and home button clickable");
	}
	
	@Test
	public void TestID_03() throws InterruptedException {
		driver.findElement(By.cssSelector("button[title='Modules']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='Help']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("tbllistid_length")).click();
		Reporter.log("Modules and help dropdown and show entrie are clickable");
	}
	
	@Test
	public void TestID_04() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Next']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Previous']")).click();
		Reporter.log("prev and next button are clickable");	
	}
	
	@Test
	public void TestID_05() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("module");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='close']")).click();
		Reporter.log("search and print button are clickable");	
	}
	@Test
	public void TestID_06() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()=' Add Module']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("info");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("12");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@class='close'])[3]")).click();
		Reporter.log("Add module button fields are clickable");	
	}
	
	@Test
	public void TestID_07() throws InterruptedException {
		driver.findElement(By.xpath("//button[@title='Help']")).click();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Version & Revision History']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("i[class='fa fa-arrow-left']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("i[class='fa fa-arrow-right']")).click();
		Reporter.log("Backward and forward navigations are clickable");
	}
	@Test
	public void TestID_08() throws InterruptedException {
		driver.findElement(By.cssSelector("i[class='fa fa-power-off']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click();
		Reporter.log("logout is accessable");
		
	}
}
