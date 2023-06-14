package myCarHelpline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchNewCar {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycarhelpline.com/");
		
		driver.manage().window().maximize();
		
		WebElement dropdown =driver.findElement(By.xpath("//select[@onchange='showModelNewCar(this.value)']"));
		
		Select selectDD = new Select(dropdown);
		selectDD.selectByValue("1");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='newcar-right']:nth-child(4)")).click();
		WebElement modelDrop = driver.findElement(By.cssSelector("div[class='newcar-right']:nth-child(4)"));
		Select selectModel = new Select(modelDrop);
		selectModel.selectByIndex(4);
	}

}
