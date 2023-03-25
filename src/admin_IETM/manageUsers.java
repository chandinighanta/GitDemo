package admin_IETM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class manageUsers {
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
		driver.findElement(By.xpath("//a[text()=' MANAGE USERS']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Modules']")).click();
	    Reporter.log("modules dropdown is clickable");
	}
	@Test
	public void TestID_03() {
		driver.findElement(By.xpath("//button[@title='Help']")).click();
		Reporter.log("help dropdown is clickable");
		}
	@Test
	public void TestID_04() throws InterruptedException {
		driver.findElement(By.cssSelector("a[data-dt-idx='next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[data-dt-idx='previous']")).click();
		Reporter.log("prev and next button is clickable");
	}	
	
	@Test
	public void TestID_05() throws InterruptedException {
		driver.findElement(By.cssSelector("input[placeholder='By: ID No, User Name']")).sendKeys("11");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='By: ID No, User Name']")).clear();
		Reporter.log("search text box is clickable");
	}
	@Test
	public void TestID_06() throws InterruptedException {
		driver.findElement(By.cssSelector("select[name='tbllistid_length']")).sendKeys("25");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("select[name='tbllistid_length']")).sendKeys("1");
		Reporter.log("show entries dropdown is clickable");
	}
	@Test
	public void TestID_07() {
		driver.findElement(By.cssSelector("button[class='manage-adduser']")).click();
		Reporter.log("add user button is clickable");
	}
	@Test
	public void TestID_08() throws InterruptedException {
		driver.findElement(By.id("employee_id")).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.id("employee_id")).clear();
		Reporter.log("ID text box is clickable");
	}
	@Test
	public void TestID_09() throws InterruptedException {
		driver.findElement(By.id("user_name")).sendKeys("abcd");
		Thread.sleep(1000);
		driver.findElement(By.id("user_name")).clear();
		Reporter.log("Username textbox is clickable");
	}
	@Test
	public void TestID_10() throws InterruptedException {
		driver.findElement(By.id("user_password")).sendKeys("a1233");
		Thread.sleep(1000);
		driver.findElement(By.id("user_password")).clear();
		Reporter.log("password textbox is clickable");
	}
	@Test
	public void TestID_11() {
		driver.findElement(By.xpath("//div[@role='document']//button[@type='button'][text()='×']")).click();
		Reporter.log("add user dailogue box is closed");
	}
	@Test
	public void TestID_12() throws InterruptedException {
		driver.findElement(By.xpath("//button[@title='Logout']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' NO']")).click();
	}
}
