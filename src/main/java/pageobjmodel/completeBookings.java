package pageobjmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilityfile.Base_File;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class completeBookings extends Base_File{
	@FindBy(xpath = "//input[@id='fname']") private WebElement entername;
	@FindBy(xpath = "//input[@id='age']") private WebElement ennterage;
	@FindBy(xpath ="//div[text()='Male']" ) private WebElement clickgender;
	
	//contact details
	@FindBy(xpath = "//input[@id='contactEmail']") private WebElement entermail;
	@FindBy(xpath = "//input[@id='mobileNumber']") private WebElement mobilenumber;
	@FindBy(xpath = "//span[@class='checkboxWpr']") private WebElement pincodecheckbox;
	
	@FindBy(xpath = "//span[text()='Continue']") private WebElement finalcontinue;
    
	public WebDriver driver;
	public completeBookings(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
	public void completebooking() {
		 Enter_Data(getEntername(),"mohamed akbar");
		   Enter_Data(getEnnterage(), "25");
		   Click(getClickgender());
		   Enter_Data(getEntermail(),"a.mdakbar20@gmail.com");
		   Enter_Data(getMobilenumber(),"8012950127");
		   Click(getPincodecheckbox());
		   Click(getFinalcontinue());
	}
	
	public WebElement getEntername() {
		return entername;
	}

	public WebElement getEnnterage() {
		return ennterage;
	}

	public WebElement getClickgender() {
		return clickgender;
	}

	public WebElement getEntermail() {
		return entermail;
	}

	public WebElement getMobilenumber() {
		return mobilenumber;
	}

	public WebElement getPincodecheckbox() {
		return pincodecheckbox;
	}

	public WebElement getFinalcontinue() {
		return finalcontinue;
	}

	
}
