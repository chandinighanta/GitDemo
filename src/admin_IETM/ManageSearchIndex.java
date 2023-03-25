package admin_IETM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ManageSearchIndex {
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
		driver.findElement(By.xpath("//a[text()=' MANAGE SEARCH INDEX']")).click();
		Reporter.log("module is displayed");
		
	}
	@Test
	public void TestID_03() {
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Reporter.log("Add button is clickable");
	}
	@Test
	public void TestID_04() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='m_name']")).sendKeys("drawing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='m_name']")).clear();
		Reporter.log("Search key word text box is clickable");
	}
	@Test
	public void TestID_05() throws InterruptedException {
		driver.findElement(By.xpath("//textarea[@name='suggestions']")).sendKeys("hi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='suggestions']")).clear();
		Reporter.log("suggestions text box is clickable");
	}
	
	@Test
	public void TestID_06() {
		driver.findElement(By.xpath("//div[@id='box1']//button[@type='button'][text()='×']"));
		Reporter.log("close button in add user is clickable");
	}
	@Test
	public void TestID_08() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[data-dt-idx='next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[data-dt-idx='next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-dt-idx='previous']")).click();
		Reporter.log("prev and next button is clickable");
	}
	@Test
	public void TestID_07() throws InterruptedException {
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("ietm");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='search']")).clear();
		Reporter.log("search box is clickable");
	}
	
	@Test
	public void TestID_09() {
		driver.findElement(By.cssSelector("select[name='tbllistid_length']")).sendKeys("25");
	}
}
