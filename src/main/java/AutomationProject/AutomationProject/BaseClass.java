package AutomationProject.AutomationProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
  public static void main(String[] args) {
	  
//	  System.setProperty("webdriver.chrome.driver","C:\\Automation\\TestingWorkplace\\Automation\\BrowsersDriver\\chromedriver.exe");
//  WebDriver driver  = new ChromeDriver();
	  
	// Set the driver path
	  System.setProperty("webdriver.edge.driver", "C:\\Automation\\TestingWorkplace\\Automation\\BrowsersDriver\\msedgedriver.exe");

	  // Start Edge Session
	  WebDriver driver = new EdgeDriver();

	  
	  
	  
    driver.get("https://parabank.parasoft.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("auto4890");
WebElement pass =	driver.findElement(By.xpath("//input[@name='password']"));
pass.sendKeys("abcd");
System.out.println(pass.getAttribute("value"));
pass.sendKeys(Keys.CONTROL+"a");
pass.clear();


List<WebElement> EL = driver.findElements(By.xpath("//a"));
System.out.println(EL.size());
	
	// driver.findElement(By.xpath("//input[@value='Log In']")).click();
    System.out.println("completed");
   // driver.close();
  }
}
