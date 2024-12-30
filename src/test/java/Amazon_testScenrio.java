
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Amazon_testScenrio {

	public static void main(String[] args) {


		        // Automatically set up the correct version of chromedriver
		        WebDriverManager.chromedriver().setup();

		        WebDriver driver=new ChromeDriver();
		      //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		      
	  try {
		        driver.get("https://www.amazon.in");
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		       // driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		  
		        driver.manage().window().maximize();
		        
		        //To click on All button
		        WebElement   Dropdownbutton=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		     Dropdownbutton.click();
		     
		     //To get list under All
		     Select s=new Select(Dropdownbutton);
		     List<WebElement>options=s.getOptions();
		     
		     //Create arraylist to store actual list elements
		     List<String> actualOptions = new ArrayList<>();
		     for(WebElement option:options) {
		    	 actualOptions.add(option.getText());
		     } 
		     
		     //Create arraylist to store expected list elements
		     List<String> expectedOptions=new ArrayList<>();
		     expectedOptions.add("All Categories");
	            expectedOptions.add("Alexa Skills");
	            expectedOptions.add("Amazon Fresh");
	            expectedOptions.add("Amazon Pantry");
	            expectedOptions.add("Appliances");
	            expectedOptions.add("Apps & Games");
	            expectedOptions.add("Baby");
	            expectedOptions.add("Beauty");
	            expectedOptions.add("Books");
	            expectedOptions.add("Car & Motorbike");
	            expectedOptions.add("Clothing & Accessories");
	            expectedOptions.add("Computers");
	            expectedOptions.add("Electronics");
	            expectedOptions.add("Entertainment");
	            expectedOptions.add("Gourmet Food");
	            expectedOptions.add("Health & Personal Care");
	            expectedOptions.add("Home & Kitchen");
	            expectedOptions.add("Industrial & Scientific");
	            expectedOptions.add("Luggage & Bags");
	            expectedOptions.add("Movies & TV Shows");
	            expectedOptions.add("Musical Instruments");
	            expectedOptions.add("Office Products");
	            expectedOptions.add("Pets Supplies");
	            expectedOptions.add("Prime Video");
	            expectedOptions.add("Renewed");
	            expectedOptions.add("Shoes & Handbags");
	            expectedOptions.add("Software");
	            expectedOptions.add("Sports, Fitness & Outdoors");
	            expectedOptions.add("Toys & Games");
	            expectedOptions.add("Video Games");
	            
	            
	            //verify if actualOption match with expectedOption
	            if(actualOptions.containsAll(expectedOptions) && expectedOptions.containsAll(actualOptions))
	            {
	            System.out.println("All options are expected");	
	            }
	            else {
	            	System.out.println("All options are not as expected");
	            }
	            
	  }          
	catch (WebDriverException e) {
		
		System.out.println("Error is: "+e.getMessage());
	            	
	            }
	  finally {
		 // driver.close();
	  		}
		    }
		}
