package AutomationProject.AutomationProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
  public static void main(String[] args) {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Automation\\AutomationProject\\AutomationProject\\BrowsersDriver\\chromedriver.exe");
  WebDriver driver  = new ChromeDriver();
    driver.get("https://parabank.parasoft.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("auto4890");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("auto1234");
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
    System.out.println("completed");
    driver.close();
  }
}
