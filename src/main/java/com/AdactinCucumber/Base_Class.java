package com.AdactinCucumber;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	public static WebDriver driver;
	//browser launch
	public static WebDriver browserLaunch(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\eclipse-workspace\\SeleniumProjects\\driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\admin\\eclipse-workspace\\SeleniumProjects\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();


		} else if (browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\admin\\Documents\\Custom Office Templates\\SeleniumProject\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();


		}else {
			System.out.println("Invalid Statement");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	//GETURL
	public static void getURL(String URL) {

		driver.get(URL);
		
	}

	//navigate to

	public static void navigateto(String url) {
		driver.navigate().to(url);
	}
	public static void navigateBack() {
		driver.navigate().back();
	}
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
	public static void navigateForward() {
		driver.navigate().forward();
	}


	//Implicity Wait
	public static void implicitywait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);	
	}

	// Explicity Wait
	public static void explicitywait(WebElement element, int Sec) {
		WebDriverWait wait = new WebDriverWait(driver, Sec);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	//Get PageSource
	public static void pageSource() {
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	}
	//GetCurrentURL
	public static void getCurrentURL() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	//Get Title
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	//GetText
	public static void getText(WebElement element) {

		String text = element.getText();
		
		System.out.println(text);
	}

	public static void getAttribute(WebElement element, String attributename) {
		String attribute = element.getAttribute(attributename);
		System.out.println(attribute);
	}
	public static void isselected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}
	public static void isenabled(WebElement element){
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}

	public static void isdisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);

	}

	public static void sendText(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void clickElement(WebElement element){
		element.click();

	}
	public static void selectValues(WebElement element, int index, String value, String select) 
	{
		if(select.equalsIgnoreCase("visible")) {
			Select s = new Select(element);	
			s.selectByVisibleText(value);

		}else if (select.equalsIgnoreCase("index"))
		{
			Select s = new Select(element);
			s.selectByIndex(index);
		}else if(select.equalsIgnoreCase("value")) {
			Select s = new Select(element);
			s.selectByValue(value);
		}
	}
	public static void getoptionall(WebElement element)
	{
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
	}


	public static void getfirstselect(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());


	}

	public static void ismultipleselect(WebElement element) 
	{
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

	}


	public static void ismultipledeselect(WebElement element, int index, String value, String select ) {

		if(select.equalsIgnoreCase("devisible")) {
			Select s = new Select(element);	
			s.deselectByVisibleText(value);

		}else if (select.equalsIgnoreCase("deindex"))
		{
			Select s = new Select(element);
			s.deselectByIndex(index);
		}else if(select.equalsIgnoreCase("devalue")) {
			Select s = new Select(element);
			s.deselectByValue(value);
		}

	}
	public static void Alertfunction(WebElement element, String options) {
		Alert alert1 = driver.switchTo().alert();
		if (options.equalsIgnoreCase("accept")) {

			alert1.accept();
		} else if(options.equalsIgnoreCase("dismiss")) {
			alert1.dismiss();

		}else if(options.equalsIgnoreCase("text")) {
			String text = alert1.getText();
			System.out.println(text);
		}

	}
	public static void mouseAllevent(WebElement element, String action ) {
		Actions act = new Actions(driver);
		if (action.equalsIgnoreCase("click")) {
			act.click(element).build().perform();	
		}else if (action.equalsIgnoreCase("right click")) {
			act.contextClick(element).build().perform();	
		}else if (action.equalsIgnoreCase("double click")) {
			act.doubleClick(element).build().perform();	
		}else if (action.equalsIgnoreCase("move")) {
			act.moveToElement(element).build().perform();
		}else if (action.equalsIgnoreCase("click and hold")) {
			act.clickAndHold(element).build().perform();
		}


	}
	public static void takeScreenshotMethod(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(filename+".png");
		FileUtils.copyFile(source, destination);
	}


	public static void close()
	{
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}

	//checkbox
	public static void checkBox(WebElement element) {
		element.click();

	}

	//frames
	public static void frameselement (WebElement element) 
	
	{

		driver.switchTo().frame(element);
		
	}
	
	public static void framesindex (int index) {
	driver.switchTo().frame(index);
	}
	public static void mainframe() {
		driver.switchTo().defaultContent();
	}

	//scroll up and down

	public static void scrollup(WebElement element, String option)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		if (option.equalsIgnoreCase("view")) {
			js.executeScript("arguments[0].scrollIntoView()", element);
		} else if (option.equalsIgnoreCase("pixel")) {
			js.executeScript("window.scrollBy(0,1000)");

		}
	}

	public static void windowHandles(String type, String destination) {
		if (type.equalsIgnoreCase("singlewindow")) {
			String windowHandle = driver.getWindowHandle();
			//System.out.println(windowHandle);
			driver.switchTo().window(windowHandle);

		}  else if (type.equalsIgnoreCase("multiplewindow")) {
			Set<String> windowHandles = driver.getWindowHandles();
			for (String all : windowHandles) {
				String title = driver.switchTo().window(all).getTitle();
				System.out.println(title);

			}
			String title = destination;
			for (String all : windowHandles) {
				if(driver.switchTo().window(all).getTitle().equalsIgnoreCase(title)){
					break;
				}
			}

		}
	}

	public static void robotAction(WebElement element, String option) throws AWTException {
		Robot r = new Robot();
		if(option.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		else if (option.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);

		}else if (option.equalsIgnoreCase("Enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

		}

	}	

	
	
	
	public static void clearMethod(WebElement element) {
		element.clear();
		
	}
}







