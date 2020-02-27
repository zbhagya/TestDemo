package Women;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class OnlineRegstration {
	WebDriver driver;
	Object_Repository obj=new Object_Repository();

	@Test(priority=0)
	public void registeration() {

		driver.findElement(obj.signinbutton).click();
		WebElement emailAdd=driver.findElement(obj.emailaddress);
		emailAdd.sendKeys("test1712@gmail.com");

		JavaScriptExecutor js= (JavaScriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,500)");

		driver.findElement(obj.create_account);
		driver.findElement(obj.gender).click();
		driver.findElement(obj.firstName).sendKeys("Bhagyashree");
		driver.findElement(obj.lastName).sendKeys("Zaware");
		driver.findElement(obj.email).isDisplayed();
		driver.findElement(obj.password).sendKeys("welcome@123");

		Select selectDate=new Select(driver.findElement(obj.selectdate));
		selectDate.selectByVisibleText("17");

		Select selectMonth=new Select(driver.findElement(obj.selectMonth));
		selectMonth.selectByVisibleText("May");

		Select selectYear=new Select(driver.findElement(obj.selectYear));
		selectYear.selectByVisibleText("2002");


		driver.findElement(obj.fname).sendKeys("Bhagyashree");
		driver.findElement(obj.lname).sendKeys("Zaware");

		driver.findElement(obj.address).sendKeys("Nerul West Navi Mumbai ");
		driver.findElement(obj.city).sendKeys("Mumbai");

		Select selectState=new Select(driver.findElement(obj.state));
		selectState.selectByVisibleText("Alaska");

		driver.findElement(obj.postal_code).sendKeys("40070");
		driver.findElement(obj.country).sendKeys("United States");

		driver.findElement(obj.mobilePhone).sendKeys("886353197");

		driver.findElement(obj.register).click();
	}

	@Test(priority=1)
	public void login() {

		driver.findElement(obj.loginemail).sendKeys("");
		driver.findElement(obj.loginpwd).sendKeys("");
		driver.findElement(obj.loginbtn).click();

		JavaScriptExecutor js= (JavaScriptExecutor)driver;
		// js.executeScript("window.scrollBy(0,500)");

	}

	@Test(priority=2)
	public void addItems(){

		driver.findElement(obj.selectwomen).click();
		// js.executeScript("window.scrollBy(0,300)");

		driver.findElement(obj.selecttops).click();
		// js.executeScript("window.scrollBy(0,300)");

		driver.findElement(obj.selecttopimage).click();
		// js.executeScript("window.scrollBy(0,300)");
		System.out.println("Successfully added items to cart");

		Set<String> IDs=driver.getWindowHandles();
		Iterator<String> it=IDs.iterator();
		String parentwindow=it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());

		driver.findElement(obj.quickview).click();
		driver.findElement(obj.additems).click();
		List<WebElement> items=driver.findElements(obj.additems);

		for(WebElement i:items) {
			System.out.println("Number of items added in cart: " +i);

		}

		driver.findElement(obj.addcart).click();
		WebElement getquantity=driver.findElement(By.xpath("//*[@id=\"layer_cart_product_quantity\"]"));
		String getcount=getquantity.getText();
		System.out.println(getcount);
		
		driver.findElement(obj.proceed).click();
		System.out.println("Your shopping cart contains: 2 Products");		
	}

	@BeforeTest
	public void beforetest() {
		String exePath = "E:\\RajaIMPDownloads\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}

	@AfterTest
	public void aftertest() {
		driver.quit();
		System.out.println("Test Completed Successfully");
	}

}
