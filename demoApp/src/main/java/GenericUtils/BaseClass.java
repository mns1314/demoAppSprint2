package GenericUtils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	WebDriver driver;
	
	@BeforeClass()
	public void bc(){
		
		String browser="chrome";
		String url="https://demoapps.qspiders.com/?scenario=1";
		
		if(browser.equals("chrome")){
			driver=new ChromeDriver();
		}
		 else if(browser.equals("firefox")){
			driver=new FirefoxDriver();
	}
		 else if(browser.equals("edge")){
			driver=new EdgeDriver();
      }
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
   }
	@AfterClass()
	
	
}
