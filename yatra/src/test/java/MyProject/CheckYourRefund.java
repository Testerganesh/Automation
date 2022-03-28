package MyProject;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class CheckYourRefund {
	WebDriver wd;
	
	/*Click on the flights and checYourReFund 
	 * Click on the checYourRefund and next
	 * click the  cabCollections and page should be open 
	 * enter the all the text filed vale is woking or not
	 * 
	 * 
	 */
  @Test(priority=1)
  public void f() {
	  
	  
	  WebElement flights=wd.findElement(By.xpath("//a[@id='booking_engine_flights']"));
	  flights.click();
	  WebElement Check=wd.findElement(By.id("BE_flight_flsearch_btn"));
	  Check.click();
	  WebElement clickPric=wd.findElement(By.xpath("//body/section[@id='Flight-APP']/section[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[7]/span[1]"));
	  clickPric.click();
	  
	  
  }
  @Test (priority=2)
  public void Price()
  {
	String win=wd.getWindowHandle() ;
	  WebElement clickPric1=wd.findElement(By.xpath("//body/section[@id='Flight-APP']/section[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[7]/span[1]"));
	  clickPric1.click();
	 WebElement Step=wd.findElement(By.xpath("//body/section[@id='Flight-APP']/section[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/label[2]/p[1]"));
	 
	 
	 Select select = new Select(Step); 
	 select.selectByValue("1");
 WebElement Time =wd.findElement(By.xpath("//body/section[@id='Flight-APP']/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/label[1]/p[2]"));
	 Time.click();
	 WebElement Appley=wd.findElement(By.xpath("//body/section[@id='Flight-APP']/section[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/input[1]"));
      Appley.click();
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	   wd=new ChromeDriver();
	  wd.manage().window().maximize();
	  wd.get("https://www.yatra.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
