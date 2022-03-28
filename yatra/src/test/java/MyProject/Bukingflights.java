package MyProject;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Bukingflights {
	WebDriver wd;
  @Test
  public void f() {
	  WebElement Flights=wd.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
	  Flights.click();
	  WebElement searcheFl=wd.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]"));
	  searcheFl.click();
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
