package Stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registerlocators {
	WebDriver driver;

	public registerlocators(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (xpath="//a[@href='/register?returnUrl=%2F']")
public 	WebElement rg;
@FindBy (xpath="//input[@id='gender-male']")
public WebElement gb;
@FindBy (xpath="//input[@id='FirstName']")
public WebElement firstname;
@FindBy (xpath="//input[@id='LastName']")
public WebElement lastname;
@FindBy (xpath="//select[@name='DateOfBirthDay']")
public WebElement day;
@FindBy (xpath="//select[@name='DateOfBirthMonth']")
public WebElement month;
@FindBy (xpath="//select[@name='DateOfBirthYear']")
public WebElement year;
@FindBy (xpath="//input[@name='Email']")
public WebElement email;
@FindBy (xpath="//input[@id='Company']")
public WebElement cmpy;
@FindBy (xpath="(//input[@type='password'])[1]")
public WebElement password;
@FindBy (xpath="(//input[@type='password'])[2]")
public WebElement confirmpw;
@FindBy (xpath="//button[.='Register']")
public WebElement botton;
@FindBy (xpath="//div[@class='result']")
public WebElement txt;

public void res() {
	txt.getText();
}


public void Date()
{
	Select dropdown=new Select(day);
	dropdown.selectByValue("25");
	Select dp=new Select(month);
	dp.selectByIndex(3);
	Select mn=new Select(year);
}


}
