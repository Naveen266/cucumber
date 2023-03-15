package Stepdefination;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EloginLocator {
	WebDriver driver2;

	public EloginLocator(WebDriver driver) {
		driver2=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy (xpath="//a[@class='ico-login']")
 public WebElement log;
	@FindBy (xpath="//input[@class='email']")
	public WebElement un;
	@FindBy (xpath="//input[@id='Password']")
	public WebElement pw1;
	@FindBy (xpath="//input[@type='checkbox']")
    public	WebElement check;
	@FindBy (xpath="//button[.='Log in']")
	public WebElement btn;
	
	//Desktop 
	@FindBy (xpath="(//a[@href='/computers'])[1]")
	public WebElement com;
	@FindBy (xpath="(//a[.='Desktops '])[1]")
	public WebElement desk;
	@FindBy (xpath="(//button[@type='button'])[1]")
	public WebElement cartbtn;
	
	@FindBy (xpath="//select[@id='product_attribute_2']")
	public WebElement ra;
    @FindBy (xpath="//input[@id='product_attribute_3_6']")
    public WebElement radio;
    @FindBy (xpath="//input[@id='product_attribute_5_12']")
    public WebElement checkbox;
    @FindBy (xpath="//button[.='Add to cart']")
    public WebElement btn2;
	public void ac() {
		Actions as=new Actions(driver2);
		as.moveToElement(com);
		as.build().perform();
	
	//as.build().perform();
	}
	
	//WebElement wt=driver2.findElement(By.xpath("//select[@class='valid']"));
	//electronics
	@FindBy (xpath="(//a[@href='/electronics'])[1]")
	public WebElement ec;
	@FindBy (xpath="(//a[@href='/cell-phones'])[3]")
	public WebElement cel;
	@FindBy (xpath="//select[@aria-label='Select product sort order']")
	public WebElement sel;
	@FindBy (xpath="(//a[@href='/htc-one-m8-android-l-50-lollipop'])[4]")
	public WebElement ct;
	//Books
	@FindBy (xpath="(//a[@href='/books'])[1]")
	public WebElement bk;
	@FindBy (xpath="(//button[@type='button'])[1]")
	public WebElement ca;
	//cart
	@FindBy (xpath="//span[.='Shopping cart']")
	public WebElement shoping;
	
	////Shiping the product
	
	
	public void t()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver2;
		js.executeScript("window.scrollBy(0,600)");
	}
////	public void elec()
////	{
////		Actions as=new Actions(driver2);
////		as.moveToElement(ec);
////		as.build().perform();
////	}
////	public void sort()
////	{
////		Select st=new Select(sel);
////		st.selectByValue("5");
//	}
//
}

