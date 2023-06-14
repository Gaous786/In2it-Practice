package shopingSite;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StandAloneTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("gaous.tester5@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		

	}

}
