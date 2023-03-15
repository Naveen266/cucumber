package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginMain {
	WebDriver driver;
	 @Given("^user lanuch the ecommerse login page$")
	    public void user_lanuch_the_ecommerse_login_page() throws Throwable {
		 WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		 driver.get("https://demo.nopcommerce.com/");
		 
	    }

	    @When("^user enter the username(.+) password(.+)$")
	    public void user_enter_the_username_password(String un, String pw) throws Throwable {
	    	EloginLocator lc=new EloginLocator(driver);
	    	WebDriverWait wt=new WebDriverWait(driver, java.time.Duration.ofSeconds(5));
	    	lc.log.click();
	    	lc.un.sendKeys(un);
	    	lc.pw1.sendKeys(pw);
	    	lc.check.click();
	    	lc.btn.click();
	    }

	    @Then("^userverify th login page.$")
	    public void userverify_the_login_page() throws Throwable {
	        //System.out.println(driver.getTitle());
	    }
	    @Then("userverify the login page")
	    public void userverify_the_login_page1()
	    {
	    //	driver.quit();
	    }
	    @When("User eneter the un {string} pw {string}")
	    public void user_eneter_the_un_pw(String string, String string2) {
	    	EloginLocator lc=new EloginLocator(driver);
	    	
	    	lc.log.click();
	    	lc.un.sendKeys(string);
	    	lc.pw1.sendKeys(string2);
	    	lc.check.click();
	    	lc.btn.click();
	    }

	    @When("enter the detail")
	    public void enter_the_detail() throws InterruptedException {
	    	EloginLocator lc=new EloginLocator(driver);
	    	WebDriverWait wt=new WebDriverWait(driver, java.time.Duration.ofSeconds(5));
//Electronic
//	    	lc.elec();
//	    	lc.ec.click();
//	    	lc.cel.click();
//	    	//lc.sort();
//	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//	    	lc.t();
//	    	lc.ct.click();
// Books
	    	driver.manage().window().maximize();
	    	lc.bk.click();
	    	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(4));
	    	lc.t();
	    	lc.ca.click();
	 
	    
	    	
	    	//Desktop
	    	//	    	lc.ac();
//	    	lc.desk.click();
//	    	lc.cartbtn.click();
//	    	//lc.ra.click();
//	    	//lc.ram();
//	    	lc.radio.click();
//	    	lc.checkbox.click();
//	    	lc.btn2.click();
	        
	    }

	    @Then("verif it is in cart")
	    public void verif_it_is_in_cart() {
	driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
	WebElement tx=driver.findElement(By.xpath("//a[@class='product-name']"));
	System.out.println(tx.getText());
	        Assert.assertEquals("Fahrenheit 451 by Ray Bradbury", tx.getText());
	        driver.quit();
	        
	        
	    }
	    
	   //shipping the order
	    @When("^enter city (.+) ads (.+) pin (.+) mob (.+)$")
	    public void enter_city_ads_pin_mob(String city, String address, String pincode, String phone) throws Throwable {
	    	EshipLocator sh=new EshipLocator(driver);
	    	sh.sh1.click();
	    	sh.check.click();
	    System.out.println("checkbox is "+sh.check.isSelected());
	    sh.ch.click();
	    	   sh.country.click();
	    sh.sel();
 sh.city.sendKeys(city);
	    sh.adrs.sendKeys(address);
	    sh.zip.sendKeys(pincode);
    sh.mob.sendKeys(phone);
	    
	   sh.btn.click();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofMillis(3));
	  //  driver.manage().window().maximize();
	  //  driver.switchTo().alert().accept();
	    Thread.sleep(4000);
	    	
	    sh.btn2.click();
	    
	    sh.btn3.click();
	    sh.btn4.click();
	    sh.btn5.click();
	    
	    //sh.btn6.click();


	    }
	    @Then("^verify its placed$")
	    public void verify_its_placed() throws Throwable {
	    	WebElement wt=driver.findElement(By.xpath("//strong[.='Your order has been successfully processed!']"));
	     System.out.println(wt.getText());
	     Assert.assertEquals(wt.getText(), "Your order has been successfully processed!");
	     System.out.println(driver.findElement(By.xpath("//strong[.='Order number: 1032']")).getText());
	     driver.findElement(By.xpath("//button[.='Continue']")).click();
	    }

	    
	    
	    	
	    
}
