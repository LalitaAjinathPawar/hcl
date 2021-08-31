package KSRTC.BusBooking;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HCLItimesheet {
	  @Test
	  public void MyHCL() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Chrome driver\\chromedriver.exe");
	      WebDriver driver =new ChromeDriver();
			      driver.get("https://login.microsoftonline.com/189de737-c93a-4f5a-8b68-6f4ca9941912/wsfed?wa=wsignin1.0&wtrealm=https%3a%2f%2fwww.myhcl.com%2fbprhome%2fDefault.aspx&wctx=rm%3d0%26id%3dpassive%26ru%3d%252fbprhome%252fDefault.aspx&wct=2021-08-11T06%3a29%3a58Z&wreply=https%3a%2f%2fwww.myhcl.com%2fbprhome%2fDefault.aspx");
			      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			      driver.manage().window().maximize();
			      
			      driver.findElement(By.xpath("//input[@type='email']")).sendKeys("lalitaajinath.pawar@hcl.com");
			      driver.findElement(By.id("idSIButton9")).click();
			      
			      driver.findElement(By.cssSelector("input[type='password']")).sendKeys("N!t!N@5%5yS");
			      driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div/div/input")).click();
			      Thread.sleep(8000);
			      
			      driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[1]/div/div/div/div/div/div/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div[2]/input")).click();
			      System.out.println("Logged in Successfully");
			      
			      WebElement Search=driver.findElement(By.xpath("//input[@id='txtSearch']"));
			      Search.click();
			      Search.sendKeys("itime (Time Sheet Management system)");
			      driver.findElement(By.xpath("/html/body/ul/li/table/tbody/tr/td/a")).click();
			      Thread.sleep(6000);
			      
			      WebElement TimeEnter=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div[4]/div[1]/div/div/div/div[2]/div/div[1]/span[2]/div[2]/div/div/div/div/div/div[3]/div/div/div/div/input"));
			      TimeEnter.sendKeys("09:00");
			      System.out.println("Time Entered Successfully");
			      
			      JavascriptExecutor js=(JavascriptExecutor)driver;
			      js.executeScript("window.scrollBy(300,800)","");
			      driver.findElement(By.id("le_apply")).click();
			      System.out.println("Time Entry Saved Successfully");
			    
			      driver.quit();
			  } 
	}



