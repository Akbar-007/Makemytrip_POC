package pageobjmodel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilityfile.Base_File;

public class Bookingseats extends Base_File{
	@FindBy(xpath = "(//div[@class='horiFilterBtn appendRight12 '])[1]") private WebElement clickAC;
	@FindBy(xpath = "//span[text()='Sleeper']") private WebElement clicksleeper;
	@FindBy(xpath = "((//span[@class='checkMarkInner']))[1]") private WebElement singleseat;
	@FindBy(xpath = "(//input[@id='Pick up point'])") private WebElement pickuppointsearchbar;
	@FindBy(xpath = "(//span[@class='checkmarkOuter'])[2]") private WebElement pickupkoyambedu;
	@FindBy(xpath = "//input[@id='Travel Operators']") private WebElement travelsearchbar;
	@FindBy(xpath = "//span[text()='RKK Travels']") private WebElement traveloperator;
	@FindBy(xpath = "//input[@id='Drop point']") private WebElement dropPointSearchBar;	
	@FindBy(xpath = "//span[text()='Silk Board']") private WebElement droppoind;
	@FindBy(xpath = "//li[contains(text(),'Cheapest')]") private WebElement clickcheapest;
	@FindBy(xpath = "//span[@id='price']") private List<WebElement> allprices;

	@FindBy(xpath = "//div[text()='Select Seats']") private WebElement Selectseat;
	//click seats in cheapest one 
	@FindBy(xpath ="//span[@class='listingSprite commonBigSeatIcon appendBottom4']") private WebElement clickseats;
	
	// click continue
	@FindBy(xpath = "//span[text()='Continue']") private WebElement clickcontinue;
	
	public WebDriver driver;
	public Bookingseats(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this );
	}
	
	public void seatselection() {
	   js_Click(driver,getClickAC());
       Click(getClicksleeper());
       Click(getSingleseat());
       Click(getPickuppointsearchbar());
       Click(getPickupkoyambedu());
       Click(getTravelsearchbar());
       Click(getTraveloperator());
       Click(getDropPointSearchBar());
       Click(getDroppoind());
       implicit(driver);
       js_Click(driver,getClickcheapest());
       
	}
//	   js_Click(driver,bks.getAllprices());
	
//	
//	 public void selectcheapestseat() {
//	   List<WebElement> price = getAllprices(allprices);
//	List<String> Pricedetails = new ArrayList<String>();
//		for(int i = 0; i<price.size(); i++) {
//			String PD = price.get(i).getText();
//			System.out.println("all price detils:"+PD);
//			Pricedetails.add(PD);
//			Collections.sort(Pricedetails);
//			System.out.println(price);
//			System.out.println();
//		}
//	 }
//	 
	public void selectCheapestSeat() {
	    List<WebElement> priceElements = getAllprices(allprices);
	    List<Integer> priceDetails = new ArrayList<Integer>();

	    for (WebElement priceElement : priceElements) {
	        String priceText = priceElement.getText().replaceAll("[^0-9]", ""); // Remove non-numeric characters
	        if (!priceText.isEmpty()) {
	            priceDetails.add(Integer.parseInt(priceText)); // Convert to integer
	        }
	    }

	    if (!priceDetails.isEmpty()) {
	        int minPrice = Collections.min(priceDetails); // Find the lowest price
	        System.out.println("Lowest price: " + minPrice);
	    } else {
	        System.out.println("No prices available.");
	    }
	    System.out.println(priceElements);
	    System.out.println(priceDetails);
	}
	 public void finaselection() {
		 js_Click(driver,getSelectseat());
		   js_Click(driver,getClickseats());
		   js_Click(driver,getClickcontinue());
	 }
	
	public void selectseats() {
		
	}
	public WebElement getClickAC() {
		return clickAC;
	}

	public WebElement getClicksleeper() {
		return clicksleeper;
	}

	public WebElement getSingleseat() {
		return singleseat;
	}

	public WebElement getPickuppointsearchbar() {
		return pickuppointsearchbar;
	}

	public WebElement getPickupkoyambedu() {
		return pickupkoyambedu;
	}
	
	public WebElement getTravelsearchbar() {
		return travelsearchbar;
	}


	public WebElement getTraveloperator() {
		return traveloperator;
	}
	
  
	public WebElement getDropPointSearchBar() {
		return dropPointSearchBar;
	}

	public WebElement getDroppoind() {
		return droppoind;
	}

	public List<WebElement> getAllprices(List<WebElement> allprices2) {
		return allprices;
	}

	public WebElement getClickcheapest() {
		return clickcheapest;
	}

	public WebElement getClickseats() {
		return clickseats;
	}

	

	public WebElement getClickcontinue() {
		return clickcontinue;
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelectseat() {
		return Selectseat;
	}
		
	
//	 for (int price : prices) {
//         if (price < cheapestPrice) {
//             cheapestPrice = price;
//         }
//     }

}
