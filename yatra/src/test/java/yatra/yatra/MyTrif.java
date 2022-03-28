package yatra.yatra;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MyTrif {
	WebDriver wd;
	/*
	 * Click on flights  and Select the one way
	 * Click on swape the my flight in bangalore to chennai
	 * Click on date  and slecet next month date
	 */
  @Test
  public void f() {
	  WebElement flights=wd.findElement(By.xpath("//a[@id='booking_engine_flights']"));
	  flights.click();
	  WebElement OneWay=wd.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
	  OneWay.click();
	  WebElement swap=wd.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]/i[1]"));
	  swap.click();
	  WebElement dep=wd.findElement(By.id("BE_flight_origin_city"));
	  dep.clear();
	  dep.sendKeys("Chennai");
	  dep.submit();
	  WebElement goin=wd.findElement(By.id("BE_flight_arrival_city"));
	  goin.clear();
	  goin.sendKeys("bangalore");
	  goin.submit();
	  
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
