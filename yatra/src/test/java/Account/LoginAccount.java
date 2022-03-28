package Account;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

@Test
public class LoginAccount {
	WebDriver wd;
  public void f() throws IOException {

	  wd.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		 
		  
		  File f=new File("E:\\MyFinalPr\\yatra\\InputData\\Book1.xlsx");
		  FileInputStream fis=new FileInputStream(f);
		  XSSFWorkbook wk=new XSSFWorkbook(fis);
		  XSSFSheet sh=wk.getSheet("Sheet1");
		  int size=sh.getLastRowNum();
		 
		  for (int i=1;i<=size;i++)
		  {
			  String u=sh.getRow(i).getCell(0).toString();
			  String p=sh.getRow(i).getCell(1).toString();
			  System.out.println(u+"  |  "+p);
			  WebElement MyAccount=wd.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/ul[1]/li[1]/a[1]"));
			  MyAccount.click();
			  WebElement login=wd.findElement(By.xpath("//a[@id='signInBtn']"));
			  login.click();
			  WebElement Input=wd.findElement(By.id("login-input"));
			  Input.sendKeys(u);
			  wd.findElement(By.id("login-continue-btn")).click();
			  WebElement password=wd.findElement(By.id("login-password"));
			  password.sendKeys(p);
			  WebElement login21=wd.findElement(By.xpath("//button[@id='login-submit-btn']"));
			  login21.click();
			  
			 
			  
			  
			 
			  
			  
			  
			  try {
		           WebElement ganesh=wd.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/ul[1]/li[1]/a[1]"));
		           ganesh.click();
		           WebElement logout=wd.findElement(By.xpath("//a[@id='logOut']"));
		           logout.click();
				  Thread.sleep(3000);
			  }
			  catch(Exception e) {
				  System.out.println(u+  "Invalied  UserName /password");
			  }
		  }
		  
		  
  
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
