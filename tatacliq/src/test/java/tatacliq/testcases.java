package tatacliq;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcases {
	 String address="https://www.tatacliq.com/";
	  WebDriver driver;
	  ExtentHtmlReporter htmlReporter;
		ExtentReports extent;
		ExtentTest test;
	 @BeforeTest
	 public void beforetest() throws InterruptedException {
		 htmlReporter = new ExtentHtmlReporter("extent.html");
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.get(address);
			driver.manage().window().maximize();
			String beforelogin=driver.getCurrentUrl();
			System.out.println(beforelogin);
			Thread.sleep(3000);
	 }
	 @Test(priority=0)
		public void Testcase1() throws InterruptedException {
		 test = extent.createTest("Scrolldown to the Footer page");
		 Thread.sleep(5000);
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			js.executeScript("window.scroll(0,900)");
			test.pass("user is in the Footer section");
		 
	 }
	 @Test(priority=1)
		public void Testcase2() throws InterruptedException {
		 test = extent.createTest("Click on the About us");
		 //Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@class='DesktopFooter__linkHeader']")).click();
		 driver.findElement(By.linkText("About Us")).click();
		 driver.navigate().back();
		 test.pass("user is redirected to the About Us page");
	 }
	 @Test(priority=2)
		public void Testcase3() throws InterruptedException {
		 test = extent.createTest("Click on the Careers");
		 Thread.sleep(1000);
		 //driver.findElement(By.xpath("//*[@class='DesktopFooter__linkHeader']")).click();
		 driver.findElement(By.linkText("Careers")).click();
		 driver.navigate().back();
		 test.pass("user is redirected to the Careers page");
	 }
	 @Test(priority=3)
	 public void Testcase4() throws InterruptedException {
		 test = extent.createTest("Click on the Sell With Us");
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("Sell With Us")).click();
		 driver.navigate().back();
		 test.pass("user is redirected to the Sell With Us page");
	 }
	 @Test(priority=4)
		public void Testcase5() throws InterruptedException {
		 test = extent.createTest("Verify the Appstore icon is clickable");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@class='Icon__image']")).click();
		 //driver.navigate().back();
		 test.pass("user is redirected to the Tatacliq Appstore page");
	 }
	 @Test(priority=5)
		public void Testcase6() throws InterruptedException {
		 test = extent.createTest("Verify the Facebook icon is clickable");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@href='https://www.facebook.com/TataCLiQ/']")).click();
		 //driver.navigate().back();
		 test.pass("user is redirected to the Tatacliq Facebook page");
	 }
  @Test(priority=6)
		public void Testcase7() throws InterruptedException {
		 test = extent.createTest("Verify the linkedin icon is clickable");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@href='https://in.linkedin.com/company/tatacliq']")).click();
		// driver.navigate().back();
		 test.pass("user is redirected to the Tatacliq linkedin  page");
	 }
	 @Test(priority=7)
		public void Testcase8() throws InterruptedException {
		 test = extent.createTest("Verify the instagram icon is clickable");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@href='https://www.instagram.com/tatacliq/']")).click();
		 //driver.navigate().back();
		 test.pass("user is redirected to the Tatacliq instagram  page");
	 }
	 @Test(priority=8)
		public void Testcase9() throws InterruptedException {
		 test = extent.createTest("Verify the youtube icon is clickable");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@href='https://www.youtube.com/channel/UCUwkaWqIcl9dYQccKkM0VRA']")).click();
		 //driver.navigate().back();
		 test.pass("user is redirected to the Tatacliq youtube  page");
		 extent.flush();
	 }
	 
}
			


