package Testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilityfile.Base_File;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\Feature\\make.feature",
                 glue="Stepdefanition",
                 monochrome=true,
                 dryRun =false,
                 plugin = {"pretty" ,"html: make my trip.html"}
                 )

public class testrun extends Base_File {
	public static WebDriver driver;
	
	@BeforeClass
	public static void start() {
		Hello
		driver = new ChromeDriver();
		Maximize(driver);
	}
	
	@AfterClass
	public static void end() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

	
}
