package MyProject;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class More {
	WebDriver wd;
  @Test
  public void f() {
	  WebElement more =wd.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[7]/span[1]"));
	  more.click();
	  WebElement cabs=wd.findElement(By.xpath("//a[@id='booking_engine_cabs']"));
	  cabs.click();
	  WebElement offers=wd.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[2]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]"));
	  offers.click();
	  WebElement ecash=wd.findElement(By.xpath("//tbody/tr[1]/th[2]/a[1]"));
	  ecash.click();
	  
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
	  wd.close();
  }

}
