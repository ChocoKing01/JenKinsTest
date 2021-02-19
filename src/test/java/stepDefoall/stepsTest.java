package stepDefoall;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.*; 

//import io.cucumber.java.en.*;
//import cucumber.annotation.en.*;
public class stepsTest {

	WebDriver driver=null;
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\eclipse-workspace\\abcdefg\\src\\main\\resources\\chromedriver.exe");
		 driver = new ChromeDriver();  
		 driver.manage().window().maximize(); 
	}
	
	@Given("^User open the browser$")
public void user_open_the_browser() throws Throwable { 
	    
	   // String projectPath=System.getProperty("user.dir");          
	    //System.out.println("Project path is: " +projectPath); 
	    
	                System.out.println("passed");
	    
	}

	@Given("^user is open a page facebook\\.com$")
	public void user_is_open_a_page_facebook_com() throws Throwable {
		
		 driver.navigate().to("https://www.facebook.com/");
	     Thread.sleep(5000);
	     
	}

	@When("^user enters \"([^\"]*)\" and \"([^\\\"]*)\\\"$")
	public void user_enters_and(String abcdefghi, String Ab234we567) throws Throwable {
	   
		 driver.findElement(By.id("email")).sendKeys("abcdefghi");
	     Thread.sleep(5000);
	        
	     driver.findElement(By.id("pass")).sendKeys("Ab234we567");
	     Thread.sleep(5000);
	     
	}
	@When("^user clicks on login button$")
public void user_clicks_on_login_button() throws Throwable {
		
		driver.findElement(By.name("login")).click();
		
	}

	@Then("^user is navigate to the home page$")
public void user_is_navigate_to_the_home_page() throws Throwable {

		if(driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/"))
        {
            System.out.println("Test pass");
        }
        else
        {
            System.out.println("test fail");
        }
        driver.close();
       
	}  
}
