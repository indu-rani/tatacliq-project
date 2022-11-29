package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_definition {
	String url="https://www.tatacliq.com/";
	WebDriver driver;
	
	@Given("I should go to the footer section in home page")
	public void i_should_go_to_the_footer_section_in_home_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		   Thread.sleep(5000);
		   driver=new ChromeDriver();
		   driver.get(url);
		   //Thread.sleep(5000);
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			js.executeScript("window.scroll(0,900)");
		 
	}
	@And("click on twitter icon")
	public void click_on_twitter_icon() throws InterruptedException {
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@href='https://twitter.com/tatacliq']")).click();
	}
	@Then("user should be redirected to the tatacliq twitter page")
	public void user_should_be_redirected_to_the_tatacliq_twitter_page() {
	    
	}


}
