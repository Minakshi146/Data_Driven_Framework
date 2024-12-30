import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Flipkart_testScenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        try {
            // Step 1: Open Flipkart website
            driver.get("https://www.flipkart.com");

            // Step 2: Close the login popup (optional but usually appears on the homepage)
            try {
                WebElement closeButton = driver.findElement(By.xpath("//button[text()='✕']"));
                closeButton.click();
            }
            catch(Exception e)
            {               // If the popup doesn't appear, proceed with the next steps
                System.out.println("Login popup not displayed.");
            }

            // Step 3: Locate the "Electronics" dropdown and hover over it
            driver.manage().window().maximize();
            Thread.sleep(3000);
            
           WebElement electronicDropdown=driver.findElement(By.xpath("//div[@aria-label='Electronics']"));
           electronicDropdown.click(); 

            // Wait for the sub-menu to appear
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Gaming')]")));

            // Step 4: Click on the "Gaming" category under Electronics
            WebElement gamingCategory = driver.findElement(By.xpath("//a[contains(text(), 'Gaming')]"));
            gamingCategory.click();

            // Step 5: Wait for the page to load and click on the "Remote Control" option
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Remote Control')]")));

            WebElement remoteControlOption = driver.findElement(By.xpath("//a[contains(text(), 'Remote Control')]"));
            remoteControlOption.click();

            // Optionally, you can wait here to observe the result
            Thread.sleep(5000); // Wait for 5 seconds to observe the result (remove in production)

        } catch (WebDriverException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Step 6: Close the browser
     //       driver.quit();
     
	}
	}
}
