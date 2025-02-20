package Utilityfile;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Base_File {
	
	public static WebDriver driver;
	
	public static void Browser_Launch(WebDriver driver, String url) {
		driver.get(url);
	}
	public static void Enter_Data(WebElement Target, String value) {
		Target.sendKeys(value);
	}
	public static void Maximize(WebDriver driver) { 
		driver.manage().window().maximize();
	}
	public static void Minimize(WebDriver driver) {
		driver.manage().window().minimize();
	}
	public static void Backward_tab(WebDriver driver) {
		driver.navigate().back();
	}
	public static void Forward_tab(WebDriver driver) {
		driver.navigate().forward();
	}
	public static void Refresh_tab(WebDriver driver) {
		driver.navigate().refresh();
	}
	public static void Title(WebDriver driver) {
		driver.getTitle();
	}
	public static void Currenturl(WebDriver driver) {
		driver.getCurrentUrl();
	}
	public static void Pagesource(WebDriver driver) {
		driver.getPageSource();
	}
	
	public static void TO_String (WebDriver driver) {
		driver.toString();
	}
	public static void Close(WebDriver driver) {
		driver.close();	
	}
	public static void FullScreen(WebDriver driver) {
		driver.manage().window().fullscreen();
	}
	
	public static void js_sendkeys(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=''", element);    
	}  
	public static void js_Click(WebDriver driver, WebElement webElement) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", webElement);
	}
	public static void Click(WebElement element ) {
		element.click();
	}
	public static void Ac_Click(WebDriver driver, WebElement target) {
		Actions ac = new Actions(driver);
		ac.click(target).build().perform();
	}
	public static void D_click(WebDriver driver,WebElement target) {
		Actions ac = new Actions(driver);
		ac.doubleClick(target).build().perform();
	}
	public static void D_Anddrop(WebDriver driver,WebElement target,WebElement Source ) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(Source, target).build().perform();
	}
	public static void C_AndHold(WebDriver driver , WebElement target) {
		Actions ac = new Actions(driver);
		ac.clickAndHold(target).build().perform();
	}
	public static void T_Release(WebDriver driver, WebElement target) {
		Actions ac = new Actions(driver);
		ac.release(target).build().perform();
	}
	public static void Hover(WebDriver driver, WebElement target) {
		Actions ac= new Actions(driver);
		ac.moveToElement(target).build().perform();
	}
	public static void Rightclick(WebDriver driver , WebElement target) {
		Actions ac = new Actions(driver);
		ac.contextClick(target).build().perform();
	}
	public static void getText(WebDriver driver) {
		Alert gt=driver.switchTo().alert();
		gt.getText();
	}
	public static void accept(WebDriver driver) {
		Alert ac= driver.switchTo().alert();
		ac.accept();
	}
	
	public static void implicit(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public static void Takescreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver; 
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
	}
	

}
