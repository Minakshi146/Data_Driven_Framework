import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        // Automatically set up the correct version of chromedriver
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      
try {
driver.get("https://www.amazon.in");
WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
dropDown.click();

Select s=new Select(dropDown);
List<WebElement>options=s.getOptions();

List<String> actual= new ArrayList<>();
for(WebElement option:options) {
//Get unique elements from dropdown list
actual.add(option.getText());
}

List<String> expected= new ArrayList<>();
expected.add("Baby");
expected.add("Beauty");
expected.add("Books");

ArrayList<String> matched=new ArrayList<>();
List<String> unmatched= new ArrayList<>();
for(String exp:expected) {
	 if(actual.contains(exp)) {
		 matched.add(exp);
	 }
	 else {
		 unmatched.add(exp);
	 }
}
System.out.println("Matched elements are: "+matched);
System.out.println("Matched elements are: "+matched.size());
System.out.println("Unmatched elements are: "+unmatched.size());
}
catch(WebDriverException e) {
	System.out.println(e.getMessage());
}

finally {
	driver.close();
}
	}

}
