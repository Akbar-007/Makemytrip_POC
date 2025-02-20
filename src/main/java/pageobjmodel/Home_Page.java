package pageobjmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilityfile.Base_File;

public class Home_Page extends Base_File{
	@FindBy(xpath ="//span[@class='commonModal__close']") private WebElement popupcancel;
	@FindBy(xpath = "(//a[@class='headerIcons makeFlex hrtlCenter column'])[5]") private WebElement clickBuses;
	
	@FindBy(xpath = "//input[@id='fromCity']") private WebElement clickfromloca;
	@FindBy(xpath = "//input[@title='From']") private  WebElement enterdata;
	@FindBy(xpath = "//span[text()='Chennai, Tamil Nadu']") private WebElement fromlocation;
	
	@FindBy(xpath ="//input[@placeholder='To']")private WebElement toenterloco;
	@FindBy(xpath = "(//span[text()='Bangalore, Karnataka'])") private WebElement Tolocation;
	
	@FindBy(xpath = "(//div[@class='DayPicker-Day'])[1]") private WebElement pickupdate;
	@FindBy(xpath = "//button[@id='search_button']") private WebElement clicksearchbutton;
	
	
	public WebDriver driver;
	public Home_Page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	public void login() {
		System.out.println("Lets Start");
		Browser_Launch(driver, "https://www.makemytrip.com/");
		 implicit(driver);
		   Click(getPopupcancel());
	}
	public void busespickupplace() {
		 Click(getClickBuses());
		 Click(getClickfromloca());
		   Click(getEnterdata());
		   Click(getFromlocation());
	}
	public void dropandpickupdate() {
		 Click(getToenterloco());
		   Click(getTolocation());
		   Click(getPickupdate());
		   Click(getClicksearchbutton()); 
		System.out.println("Home page Done"+"atata");
	}
	
	public WebElement getPopupcancel() {
		return popupcancel;
	}
	public WebElement getClickBuses() {
		return clickBuses;
	}

	public WebElement getClickfromloca() {
		return clickfromloca;
	}

	public WebElement getEnterdata() {
		return enterdata;
	}

	public WebElement getToenterloco() {
		return toenterloco;
	}
	public WebElement getFromlocation() {
		return fromlocation;
	}
	public WebElement getTolocation() {
		return Tolocation;
	}
	public WebElement getPickupdate() {
		return pickupdate;
	}
	public WebElement getClicksearchbutton() {
		return clicksearchbutton;
	}
	

}
