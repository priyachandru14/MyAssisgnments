package week4.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceCustomer {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		 
		ChromeDriver driver=new ChromeDriver();		 
		driver.get("https://login.salesforce.com/");		 
		driver.manage().window().maximize();				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password#123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//button[@onclick='goAhead()']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.switchTo().window(list.get(0));
		driver.quit();
		
		

	}

}
