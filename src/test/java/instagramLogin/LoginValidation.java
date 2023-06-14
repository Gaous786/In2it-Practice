package instagramLogin;
import java.time.Duration;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidation {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter username..");
		String userName = sc1.nextLine();
		
		System.out.println("Please enter password..");
		String pass = sc1.nextLine();
		
		//Test 1
		
		if(pass.length()>=6)
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.instagram.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
			
			
			//isDisable
			WebElement btnDis = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
			System.out.println(btnDis.isEnabled());
			
			//WebElement btnEnable = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
			//System.out.println(btnEnable.isEnabled());
			
			System.out.println("...");
			//Assert
			
			driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
			String errorMessage = driver.findElement(By.cssSelector("div[class='_ab2z']")).getText();
			System.out.println(errorMessage);
			
			driver.close();
		}
		else
		{
			System.out.println("Please check your password length");
		}
				
	}

}
