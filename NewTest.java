package Pradeep_Static_Nonstatic_New;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	    driver.findElement(By.id("APjFqb")).clear();
	    driver.findElement(By.id("APjFqb")).sendKeys("flipkart");
	   driver.get("https://www.flipkart.com/");
	    driver.findElement(By.name("q")).click();
	    driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
	    driver.findElement(By.name("q")).clear();
	    driver.findElement(By.name("q")).sendKeys("samsung mobiles");
	    driver.findElement(By.cssSelector("._2rslOn")).submit();
	    driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div[9]/div/div/div/a/div[2]/div/div")).click();
	    driver.findElement(By.xpath("//li[@id='swatch-1-color']/a/div")).click();
	    driver.findElement(By.id("pincodeInputId")).click();
	    driver.findElement(By.id("pincodeInputId")).clear();
	    driver.findElement(By.id("pincodeInputId")).sendKeys("534202");
	    driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div[7]/div/div/div/div[2]/div/div[2]/div/span")).click();
	    driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div/div[2]/div/ul/li/button")).click();
	  }
  }
