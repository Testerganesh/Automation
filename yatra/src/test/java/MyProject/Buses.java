package MyProject;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

@Test(priority=0)
public class Buses {
	WebDriver wd;
  public void f() {
	  WebElement Buse=wd.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]/span[1]"));
	  Buse.click();
	  WebElement searchBuse=wd.findElement(By.xpath("//input[@id='BE_bus_search_btn']"));
	  searchBuse.click();
	  WebElement From=wd.findElement(By.xpath("//body/div[@id='busDesktop']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	  From.clear();
	 From.sendKeys("Chennai");
	  From.submit();
	  WebElement To=wd.findElement(By.xpath("//body/div[@id='busDesktop']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	  To.clear();
	 To.sendKeys("Bangalore");
	  To.click();
	  WebElement Finbuse=wd.findElement(By.xpath("//body/div[@id='busDesktop']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/button[1]/div[1]"));
	  Finbuse.click();
  
  
  }
  @Test(priority=1)
  public void Buses() {
	  String win=wd.getWindowHandle();
	  WebElement SakthiTR=wd.findElement(By.xpath("//body/div[@id='busDesktop']/div[1]/div[6]/div[3]/div[1]/div[6]/button[1]/div[1]"));
	  SakthiTR.click();
	  WebElement upperDeck=wd.findElement(By.linkText(" Upper Deck"));
  upperDeck.click();
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
