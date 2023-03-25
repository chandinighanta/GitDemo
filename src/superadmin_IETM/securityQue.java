package superadmin_IETM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class securityQue {
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
	public void TestID_02() {
		driver.findElement(By.xpath("//a[text()='SECURITY QUESTIONS']")).click();
		Reporter.log("module is clickable");
	}
	
	@Test
	public void TestID_03() throws InterruptedException {
		driver.findElement(By.id("qustion1")).sendKeys("cnp");
		Thread.sleep(1000);
		driver.findElement(By.id("qustion1")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("ans1")).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.id("ans1")).clear();
		Reporter.log("que 1 and ans 1 text box are clickable");
	}
	@Test
	public void TestID_04() throws InterruptedException {
		driver.findElement(By.id("qustion2")).sendKeys("cnp");
		Thread.sleep(1000);
		driver.findElement(By.id("qustion2")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("ans2")).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.id("ans2")).clear();
		Reporter.log("que 2 and ans 2 text box are clickable");
	}
	@Test(enabled=false)
	public void TestID_08() throws InterruptedException {
		driver.findElement(By.id("qustion1")).sendKeys("cnp");
		Thread.sleep(1000);
		driver.findElement(By.id("qustion1")).clear();
		driver.findElement(By.id("qustion2")).sendKeys("cnp");
		Thread.sleep(1000);
		driver.findElement(By.id("qustion2")).clear();
		Reporter.log("question text box can be cleared");
		
	}
	@Test(enabled=false)
	public void TestID_05() {
		driver.findElement(By.id("forgotsubmit")).click();
		System.out.println(driver.findElement(By.xpath("//div[@role='alert']")).getText());
		Reporter.log("submit and text is printed");
	}
	
	@Test
	public void TestID_06() throws InterruptedException {
		driver.findElement(By.cssSelector("i[class='fa fa-desktop']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("i[class='lni lni-question-circle']")).click();
		Reporter.log("modules and help dropdown are clickable");	
	}
	@Test
	public void TestID_07() throws InterruptedException {
		driver.findElement(By.cssSelector("i[class='lni lni-home']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='SECURITY QUESTIONS']")).click();
		Reporter.log("home button is clickable");
	}
	
	@Test
	public void TestID_09() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[title='Logout']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' NO']"));
		Reporter.log("logout is clickable");	
	}
	@Test
	public void TestID_10() {
		driver.close();
		Reporter.log("close the browser");
	}
}

