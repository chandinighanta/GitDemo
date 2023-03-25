package admin_IETM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditIetm {
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
	public void TestID_02() {
		 driver.findElement(By.xpath("//a[text()=' ENTER IETM ']")).click();
		 Reporter.log("module is clickable");
	}
	@Test
	public void TestID_03() throws InterruptedException {
		driver.findElement(By.cssSelector("i[class='fa fa-desktop']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[title='Electric Water Pumps']")).click();
		Reporter.log("Modules dropdown and modules are clickable");
	}
	@Test
	public void TestID_04() throws InterruptedException {
	driver.findElement(By.xpath("//button[@title='Help']"))	.click();
	driver.findElement(By.xpath("//a[text()='About IETM']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div[class='modal fade in show'] button[type='button']")).click();
	Reporter.log("help dropdown and menus are clickable");
	
	}
	@Test(enabled=false)
	public void TestID_05() throws InterruptedException {
		driver.findElement(By.cssSelector("i[class='fa fa-arrow-left']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("i[class='fa fa-arrow-right']")).click();
		Reporter.log("backward and forward navigation is clickable");
	}
	@Test(enabled=false)
	public void TestID_06() throws InterruptedException {
		driver.findElement(By.cssSelector("button[title='Home']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()=' ENTER IETM ']")).click();
		driver.findElement(By.cssSelector("div[title='General Information']")).click();
		Reporter.log("home is clickable");
	}
	@Test(enabled=false)
	public void TestID_07() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Manuals']")).click();
		driver.findElement(By.xpath("//a[text()='Drawings']")).click();
		driver.findElement(By.xpath("//a[text()='Glossary']")).click();
		Reporter.log("all the menus are clickable");
		
	}
	@Test(enabled=false)
	public void TestID_08() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Glossary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='alphabet']//li[6]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("tbllistid_next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tbllistid_previous")).click();
		Reporter.log("prev and next button is clickable");
	}
	@Test(enabled=false)
	public void TestID_09() {
		driver.findElement(By.xpath("//a[text()='IETM Content']")).click();
		driver.findElement(By.cssSelector("button[title='Zoom']")).click();
		Reporter.log("zoom action is clickable");	
	}
	@Test(enabled=false)
	public void TestID_10() throws AWTException {
		driver.findElement(By.id("fullscreen-trigger")).click();
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ESCAPE);
		rb.keyRelease(KeyEvent.VK_ESCAPE);
		Reporter.log("full screen action is clickable");	
	}
	@Test(enabled=false)
	public void TestID_11() throws InterruptedException {
		driver.findElement(By.cssSelector("i[class='lni lni-search']")).click();//input[@placeholder='Search here ...']
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("hi");
		driver.findElement(By.xpath("//input[@placeholder='Search here ...']")).sendKeys("hi");
		Reporter.log("search box is clickable and can enter text");
	}
	@Test(enabled=false)
	public void TestID_12() throws InterruptedException {
		driver.findElement(By.cssSelector("i[class='fa fa-arrow-left']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[title='Bookmark this Page']")).click();
		Thread.sleep(1000);
	    driver.findElement(By.cssSelector("div[role='document'] button[type='button']")).click();
	    Reporter.log("bookmark is clickable");
	}
	@Test(enabled=false)
	public void TestID_13() throws InterruptedException {
		driver.findElement(By.cssSelector("button[title='Next Topic']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Okay']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[title='Previous Topic']")).click();	
		Reporter.log("prev and next button is clickable");
	}
	@Test
	public void TestID_14() throws InterruptedException {
		driver.findElement(By.cssSelector("button[title='Notes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[aria-label='Close']")).click();
		Reporter.log("Add notes is clickable");
	}
	@Test
	public void TestID_15() throws InterruptedException {
		driver.findElement(By.xpath("//button[@title='Feedback to Administrator']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		Reporter.log("Feedback to Administrator is clickable");	
	}
	@Test
	public void TestID_16() throws InterruptedException {
		driver.findElement(By.id("localsearch")).sendKeys("work");
		Thread.sleep(1000);
		driver.findElement(By.id("localsearch")).clear();
		Reporter.log("search box is clickable");
	}
	@Test(enabled=false)
	public void TestID_17() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='toggle-btn'][1]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//i[@title='Open Menu']")).click();
	}
	@Test
	public void TestID_18() throws InterruptedException {
		driver.findElement(By.cssSelector("button[title='Logout']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-footer justify-content-center']//button[text()='YES']"));
		Reporter.log("Logout action is accesable");
	}
}
