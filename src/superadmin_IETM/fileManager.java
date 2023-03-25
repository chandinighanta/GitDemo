package superadmin_IETM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileManager {
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
		driver.findElement(By.cssSelector("a[href='#/home/filemanager']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='Add Folder']")).click();
		driver.findElement(By.id("newfolder_name")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='justify-content-center'] button[type='button']")).click();
		Reporter.log("Add folder is accessable");
	}
	@Test
	public void TestID_03() throws InterruptedException {
		driver.findElement(By.xpath("//button[@title='Upload File']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='image']")).click();
		driver.findElement(By.cssSelector("div[class='justify-content-center'] button[type='button']")).click();
		Reporter.log("Upload file is accessable");
	}
	@Test 
	public void TestID_04() throws InterruptedException {
		driver.findElement(By.xpath("//button[@title='Modules']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='Help']")).click();
		Reporter.log("modules and help dropdowns are clickable");
	}
	@Test 
	public void TestID_05() throws InterruptedException {
		driver.findElement(By.xpath("(//td[@class='sorting_1'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[title='Back One Level']")).click();
		Reporter.log("folder names and back one level are clickable");
	}
	@Test 
	public void TestID_06() throws InterruptedException {
		driver.findElement(By.id("tbllistid_next")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("tbllistid_previous")).click();
		Thread.sleep(1000);
		Reporter.log("prev and next buttons clickable");
	}
	
	
}
