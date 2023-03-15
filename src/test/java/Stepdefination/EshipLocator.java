package Stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EshipLocator {
	WebDriver driver;
	
	public EshipLocator(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//span[.='Shopping cart']")
	public WebElement sh1;
	@FindBy (xpath="//input[@name='termsofservice']")
    public WebElement check;
	@FindBy (xpath="//button[.=' Checkout ']")
	public WebElement ch;
	@FindBy (xpath="//select[@data-trigger='country-select']")
	public WebElement country;
	@FindBy (xpath="//input[@data-val-required='City is required']")
	public WebElement city;
	@FindBy (xpath="//input[@id='BillingNewAddress_Address1']")
	public WebElement adrs;
	@FindBy (xpath="//input[@name='BillingNewAddress.ZipPostalCode']")
	public WebElement zip;
	@FindBy (xpath="//input[@data-val-required='Phone is required']")
	public WebElement mob;
	@FindBy (xpath="(//button[@class='button-1 new-address-next-step-button'])")
	public WebElement btn;
	@FindBy (xpath="//button[contains(@class,'button-1 shipping-method-next-step-button')]")
	public WebElement btn2;
	@FindBy (xpath="//button[@class='button-1 payment-method-next-step-button']")
	public WebElement btn3;
	@FindBy (xpath="//button[@class='button-1 payment-info-next-step-button']")
	public WebElement btn4;
	@FindBy (xpath="//button[.='Confirm']")
	public WebElement btn5;
	@FindBy (xpath="//button[@onclick='Billing.save()']")
	public WebElement btn6;
	
	public void sel()
	{
		Select sl=new Select(country);
		sl.selectByVisibleText("India");
		
	}
}
