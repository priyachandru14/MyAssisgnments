package week4.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();		 
	ChromeDriver driver=new ChromeDriver();		 
	driver.get("https://www.leafground.com/menu.xhtml");
	driver.manage().window().maximize(); 				
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement shipment = driver.findElement(By.xpath("//span[text()='Shipments']"));
	WebElement tracker = driver.findElement(By.xpath("//span[text()='Tracker']"));
	WebElement orders = driver.findElement(By.xpath("//span[text()='Orders']"));
	WebElement back = driver.findElement(By.xpath("//span[text()='Back']"));
	Actions act=new Actions(driver);
	act.click(shipment).perform();
	act.dragAndDrop(shipment, tracker).perform();
	act.moveToElement(tracker).contextClick(tracker).perform();
	act.dragAndDrop(tracker,orders).perform();
	act.moveToElement(orders).click(orders).perform();
	act.click(back).perform();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
