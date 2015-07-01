package Spaiderr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Spaiderrdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
		{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.shophive.com/apple/mac?p=1");
		driver.manage().window().maximize();
		java.util.List<WebElement>
		driver1;findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();
		java.util.List<WebElement>
		driver2;findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click();
		java.util.List<WebElement>
		driver3;findElement(By.xpath("html/body/div[1]/div/section/div/article/div[3]/p[2]/span/a[1]")).click();
		java.util.List<WebElement>
		driver4;findElement(By.xpath("html/body/div[1]/div/section/div/article/div[3]/p[3]/span/a[1]")).click();
		java.util.List<WebElement>
		driver5;findElement(By.xpath("html/body/div[1]/div/section/div/article/div[3]/p[4]/span/a[1]")).click();
		driver.findElement(By.id("cpar1")).sendKeys("10");
		driver.findElement(By.id("cpar2")).sendKeys("50");
		   driver.close();   

	
	}

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

	}


