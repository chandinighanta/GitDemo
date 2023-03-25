package admin_IETM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ManageBookmarks {
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
		driver.findElement(By.xpath("//a[text()=' MANAGE BOOKMARKS ']")).click();
		Reporter.log("module is clickable");
	}
	@Test
	public void TestID_03() throws InterruptedException {
		driver.findElement(By.cssSelector("select[name='tbllistid_length']")).sendKeys("25");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[name='tbllistid_length']")).sendKeys("1");
	}
	@Test
	public void TestID_04() throws InterruptedException {
		driver.findElement(By.xpath("//a[@data-dt-idx='next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-dt-idx='previous']")).click();
		Reporter.log("prev and next button are clickable");
	}
	@Test
	public void TestID_05() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ci");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='search']")).clear();
		Thread.sleep(2000);
		Reporter.log("search button is clickable");
	}
	@Test
	public void TestID_06() throws InterruptedException {
		driver.findElement(By.cssSelector("button[title='Modules']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[title='Help']")).click();
		Reporter.log("modules and help dropdown are clcikable");
	}
	@Test
	public void TestID_07() throws InterruptedException { 
		driver.findElement(By.xpath("//span[text()='circuit tests']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Okay']")).click();
		Reporter.log("name and link button are clickable");
	}
	@Test
	public void TestID_08() throws InterruptedException {
		driver.findElement(By.cssSelector("button[title='History Navigation, Back']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[title='History Navigation, Forward']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Okay']")).click();
		Reporter.log("fwd and backward navigation is clickable");
	}
}
