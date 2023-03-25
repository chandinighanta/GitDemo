package superadmin_IETM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class manageRelatedContent {
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
		driver.findElement(By.xpath("//a[text()=' MANAGE RELATED CONTENT TYPES']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-plus-circle']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234");
		driver.findElement(By.xpath("(//button[@class='close'])[3]")).click();
		Reporter.log("Add content type is clickable");
	}
	@Test(enabled=false)
	public void TestID_06() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Previous']")).click();
		Thread.sleep(5000);
		Reporter.log("prev and next  button are clickable");		
	}
	
	@Test
	public void TestID_03() {
		driver.findElement(By.xpath("//select[@name='tbllistid_length']")).sendKeys("10");
		Reporter.log("dropdown entries is clickable");
	}
	
	@Test
	public void TestID_04() throws InterruptedException {
		driver.findElement(By.cssSelector("input[placeholder='By: Name']")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='By: Name']")).sendKeys("");
		Reporter.log("find by  is accesable");
	}
	
	@Test
	public void TestID_05() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Print']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='close']")).click();
		Reporter.log("print and print close button is clickable");	
	}
	
	@Test
	public void TestID_07() throws InterruptedException {
		driver.findElement(By.cssSelector("button[title='Modules']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[title='Help']")).click();
		Reporter.log("modules and help dropdown  button are clickable");	
	}
	@Test
	public void TestID_08() {
		driver.findElement(By.xpath("//a[text()='Version & Revision History']")).click();
		Reporter.log("options in help dropdown  button are clickable");
	}
	
	@Test
	public void TestID_09() {
		driver.findElement(By.xpath("//button[text()=' Add Log']")).click();
		driver.findElement(By.id("change_no")).sendKeys("hi");
		driver.findElement(By.xpath("//div[@class='modal fade in show']//button[@type='button']")).click();
		Reporter.log("add log and close are clickable");	
	}
	@Test
	public void TestID_10() {
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("3");
		Reporter.log("search box in revision history is clickable");
	}
	
	@Test
	public void TestID_11() throws InterruptedException {
		driver.findElement(By.cssSelector("i[class='fa fa-arrow-left']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("i[class='fa fa-arrow-right']")).click();
		Reporter.log("backward and forward navigation is clickable");
	}
	@Test
	public void TestID_12() {
		driver.findElement(By.cssSelector("button[title='Home']")).click();
		Reporter.log("home button is clickable");
	}
	
	@Test
	public void TestID_13() throws InterruptedException {
		driver.findElement(By.cssSelector("i[class='fa fa-power-off']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='YES']")).click();
		Reporter.log("logout is accesable");
	}
	
}
