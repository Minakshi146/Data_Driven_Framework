import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BBC_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();

	        WebDriver driver=new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      
//try {
	        driver.get("https://www.bbc.com");
	        WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
	        home.click();
	}

}
