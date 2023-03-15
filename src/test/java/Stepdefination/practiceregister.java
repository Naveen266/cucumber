package Stepdefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class practiceregister {
	public WebDriver driver;
	   @Given("^user lanuch the comm browser$")
	    public void user_lanuch_the_comm_browser() throws Throwable {
		 WebDriverManager.edgedriver().setup();
		   driver=new EdgeDriver();
		   driver.get("https://demo.nopcommerce.com/");
		   
	       
	    }

	    @When("^user enter (.+) (.+) (.+) (.+) (.+) (.+)$")
	    public void user_enter(String fname, String lname, String email, String cmpny, String password, String confpw) throws Throwable {
	    	registerlocators cm=new registerlocators(driver);
	    	WebDriverWait wt =new WebDriverWait(driver, Duration.ofSeconds(5));
	    	driver.manage().window().maximize();
	    	cm.rg.click();
	    	cm.gb.click();
	    	cm.firstname.sendKeys(fname);
	    	cm.lastname.sendKeys(lname);
	    	cm.day.click();
	    	cm.Date();
	    	cm.email.sendKeys(email);
	    	cm.cmpy.sendKeys(cmpny);
	    	cm.password.sendKeys(password);
	    	cm.confirmpw.sendKeys(confpw);
	    	cm.botton.click();
	    }

	    @Then("^I verify the (.+) in step$")
	    public void i_verify_the_in_step(String status) throws Throwable {
	    	System.out.println(driver.getTitle());
	    	String str=driver.getTitle();
	    	String str2="nopCommerce demo store. Register";
	    	if(str.equals(str2))
	    	{
	    		System.out.println("registered success");
	    	}
	    	else
	    	{
	    		System.out.println("Reg not created");
	    	}
	    Assert.assertEquals("nopCommerce demo store. Register", driver.getTitle());
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	    driver.quit();
	    			
	    }
}

	    			
	    			