package Ca1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class que1 {
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize() ;
		
		String title=driver.getTitle();
		System.out.print(title);
		String exptit="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(title,exptit);
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("9025317201");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("dinesh@1910");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("mano&1234");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("smartphones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)","");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"quantity_4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
		
		


  }
}