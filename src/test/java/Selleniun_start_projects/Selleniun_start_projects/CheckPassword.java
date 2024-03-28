package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckPassword {
	static WebDriver  browser;

	@Before
	public void setup() {

		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String url="https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html";
		browser.get(url);
	}

	@Test
	public void CheckCorrectPassword() {
		 browser.findElement(By.name("characters")).sendKeys("Reema12");
		 browser.findElement(By.name("validate")).click();
		 String expectedResult = "Valid Value";
		 String result= browser.findElements(By.name("validation_message")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	@Test
	public void CheckCorrectPasswordWithChar() {
		 browser.findElement(By.name("characters")).sendKeys("Lyla*35");
		 browser.findElement(By.name("validate")).click();
		 String expectedResult = "Valid Value";
		 String result= browser.findElements(By.name("validation_message")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	@Test
	public void CheckShortPassword() {
		browser.findElement(By.name("characters")).sendKeys("reema");
		 browser.findElement(By.name("validate")).click();
		 String expectedResult = "Invalid Value";
		 String result= browser.findElements(By.name("validation_message")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	@Test
	public void CheckLongPassword() {
		browser.findElement(By.name("characters")).sendKeys("mhameedreema123");
		 browser.findElement(By.name("validate")).click();
		 String expectedResult = "Invalid Value";
		 String result= browser.findElements(By.name("validation_message")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	@Test
	public void CheckShortPasswordWithChar() {
		browser.findElement(By.name("characters")).sendKeys("Rima#12");
		 browser.findElement(By.name("validate")).click();
		 String expectedResult = "Invalid Value";
		 String result= browser.findElements(By.name("validation_message")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	@Test
	public void CheckLongPasswordWithChar() {
		browser.findElement(By.name("characters")).sendKeys("MBijkdRima!t4");
		 browser.findElement(By.name("validate")).click();
		 String expectedResult = "Invalid Value";
		 String result= browser.findElements(By.name("validation_message")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	@Test
	public void CheckPasswordWithChar3() {
		browser.findElement(By.name("characters")).sendKeys("Inval)3");
		 browser.findElement(By.name("validate")).click();
		 String expectedResult = "Invalid Value";
		 String result= browser.findElements(By.name("validation_message")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	
}