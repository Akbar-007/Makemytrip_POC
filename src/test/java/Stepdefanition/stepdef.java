package Stepdefanition;

import org.openqa.selenium.WebDriver;

import Testrunner.testrun;
import Utilityfile.Base_File;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjmodel.Bookingseats;
import pageobjmodel.Home_Page;
import pageobjmodel.completeBookings;




public class stepdef extends Base_File {

	public static WebDriver driver = testrun.driver;
	
	Home_Page home = new Home_Page(driver);
	Bookingseats book = new Bookingseats(driver);
	completeBookings complete = new completeBookings(driver);
	
	@Given("User Launch the Make My trip application")
	public void user_launch_the_make_my_trip_application() {
		home.login();	
	}

	@When("user select source and destination")
	public void user_select_source_and_destination() {
		home.busespickupplace();
	}

	@When("user pick the date and search the buses")
	public void user_pick_the_date_and_search_the_buses() {
		home.dropandpickupdate();
	}

	@When("user filter the bus seats")
	public void user_filter_the_bus_seats() {
		book.seatselection();
	}

	@When("user select the cheapest bus and select seats")
	public void user_select_the_cheapest_bus_and_select_seats() {
		book.selectCheapestSeat();
		book.finaselection();
	}

	@When("user enter the traveller details and confirm the booking")
	public void user_enter_the_traveller_details_and_confirm_the_booking() {
		complete.completebooking();
	}

   
}
