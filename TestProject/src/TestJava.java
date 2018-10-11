import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestJava {

	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		driver.get ("http://qacrm.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='authentication_username']")).sendKeys("heather");
		driver.findElement(By.xpath(".//*[@id='authentication_password']")).sendKeys("heather");
		driver.findElement(By.xpath(".//*[@id='authentication_remember_me']")).click();
		driver.findElement(By.xpath(".//*[@id='new_authentication']/div[4]/input")).click();
		driver.findElement(By.xpath(".//*[@id='welcome']/a[4]")).click();
		
		
				

	}

}
