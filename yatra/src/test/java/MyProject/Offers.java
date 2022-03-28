package MyProject;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Offers {
	WebDriver wd;
  @Test(priority=1)
  public void f() {
	  
	  WebElement Offers=wd.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/ul[1]/li[3]/a[1]"));
	  Offers.click();
	 WebElement view1=wd.findElement(By.xpath("//body/div[1]/div[1]/section[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]/span[1]/span[3]/span[1]"));
	  view1.click();
	  String win=wd.getWindowHandle();
	  WebElement view2=wd.findElement(By.xpath("//body/div[1]/div[1]/section[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]/span[1]/span[3]/span[1]"));
	  view2.click();
	  String win1=wd.getWindowHandle();
	  WebElement view3=wd.findElement(By.xpath("//body/div[1]/div[1]/section[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]/span[1]/span[3]/span[1]"));
	  view3.click();
	 
  }
  @Test(priority=2)
  public void view1() {
	  String win3=wd.getWindowHandle();
	  WebElement view4=wd.findElement(By.xpath("//body/div[1]/div[1]/section[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/span[1]/span[1]/span[3]/span[1]"));
	  view4.click();
	
	  
	  
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
