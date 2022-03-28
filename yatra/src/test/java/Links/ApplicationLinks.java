package Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplicationLinks {
	WebDriver wd;
	  @Test(priority=1)
	  public void f() {
		  
		  WebElement villas=wd.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]"));
		  villas.click();
		  String win=wd.getWindowHandle();
		  WebElement sarchevillas=wd.findElement(By.id("BE_hotel_htsearch_btn"));
		  sarchevillas.click();
		  
		  
	  }
	  @Test(priority=2)
	  public void holidays()
	  {
		  String win1=wd.getWindowHandle();
		WebElement hol=wd.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/span[1]"));
		hol.click();
		  
	  }
	  @Test(priority=3)
	  public void hotels()
	  {
		  String win1=wd.getWindowHandle();
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
	  @Test(priority=4)
	  public void  Adventureholidays()
	  {
	  
	  
		  
	  }
	  @Test(priority=5)
	  public void Bus()
	  
	  {
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

