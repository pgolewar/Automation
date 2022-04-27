package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AutomationProject.AutomationProject.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	
	WebDriver driver;
	
	@Given("^user is on login page of parabank$")
	 public void user_is_on_login_page_of_parabank(){
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\TestingWorkplace\\Automation\\BrowsersDriver\\chromedriver.exe");
		   this.driver  = new ChromeDriver();
		  
	
	 }
	@When("^title of login page$")
	public void title_of_login_page()
	{
		String page_title =driver.getTitle();
		// Assert.assertEquals("ParaBank | Welcome | Online Banking",page_title);
		    driver.get("https://parabank.parasoft.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		 	
		
	}
	
	@Then("^user Enter the username and password$")
	public void user_Enter_the_username_and_password(){
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("auto4890");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("auto1234");
	 }
	
	 @Then("^user click on login button$")
	 public void user_clicks_on_login_button() {
	 driver.findElement(By.xpath("//input[@value='Log In']")).click();
	 }
	 

	 
	 @Then("^close the browser$")
	 public void close_the_browser()
	 {
		 driver.close();
	 }

}
