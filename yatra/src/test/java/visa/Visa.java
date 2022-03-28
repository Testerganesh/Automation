package visa;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Visa {
	WebDriver wd;
  @Test
  public void f() {
	  WebElement visa=wd.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]/span[1]"));
	  visa.click();
	  WebElement mobile=wd.findElement(By.xpath("//input[@id='email']"));
	  mobile.sendKeys("ganesanm12498@gmail.com");
	  WebElement name=wd.findElement(By.xpath("//input[@id='name']"));
	  name.sendKeys("ganesan");
	  
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
