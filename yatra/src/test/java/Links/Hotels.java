package Links;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Hotels {
	ChromeDriver wd;
  @Test
  public void f() {
	  WebElement ho=wd.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]"));
	  ho.click();
	  WebElement Search=wd.findElement(By.id("BE_hotel_htsearch_btn"));
	  Search.click();
	  WebElement modifers=wd.findElement(By.xpath("//body/div[@id='bongo-hotel-wrapper']/section[@id='wrapper']/div[1]/div[1]/div[1]/div[5]/ul[1]/li[1]/p[1]/span[1]"));
	  modifers.click();
	  WebElement modifers1=wd.findElement(By.id("modifyCity"));
	  modifers1.clear();
	  modifers1.sendKeys("Chennai");
	  modifers1.submit();
	  WebElement FromDate=wd.findElement(By.xpath("//body/div[@id='bongo-hotel-wrapper']/div[1]/div[1]/form[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/i[1]"));
	  FromDate.click();
	  
	  WebElement  returnDate=wd.findElement(By.xpath("//body/div[@id='bongo-hotel-wrapper']/div[1]/div[1]/form[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[1]/i[1]"));
	  returnDate.click();
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
