package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TraingleClassification_exe1 {
	static WebDriver  browser;

	@Before
	public void setup() {

		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String url="https://testpages.eviltester.com/styled/apps/triangle/triangle001.html";
		browser.get(url);
	}

	@Test
	public void CheckEquilateralTraingle() {
		browser.findElement(By.name("side1")).sendKeys("3");
		browser.findElement(By.name("side2")).sendKeys("3");
		browser.findElement(By.name("side3")).sendKeys("3");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedResult = "equilateral";
		String result= browser.findElements(By.id("triangle-type")).toString();
		assertNotEquals(result ,expectedResult);
		browser.close();
	}
	@Test
	public void CheckIsoscelesTraingle() {
		browser.findElement(By.name("side1")).sendKeys("5");
		browser.findElement(By.name("side2")).sendKeys("5");
		browser.findElement(By.name("side3")).sendKeys("7");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedResult = "isoscales";
		String result= browser.findElements(By.id("triangle-type")).toString();
		assertNotEquals(result ,expectedResult);
		browser.close();
	}
	@Test
	public void CheckScaleneTraingle() {
		browser.findElement(By.name("side1")).sendKeys("3");
		browser.findElement(By.name("side2")).sendKeys("4");
		browser.findElement(By.name("side3")).sendKeys("5");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedResult = "scalene";
		String result= browser.findElements(By.id("triangle-type")).toString();
		assertNotEquals(result ,expectedResult);
		browser.close();
	}
	@Test
	public void CheckEquilateralTraingle2() {
		browser.findElement(By.name("side1")).sendKeys("5");
		browser.findElement(By.name("side2")).sendKeys("5");
		browser.findElement(By.name("side3")).sendKeys("5");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedResult = "equilateral";
		String result= browser.findElements(By.id("triangle-type")).toString();
		assertNotEquals(result ,expectedResult);
		browser.close();
	}
	@Test
	public void CheckIsoscelesTraingle2() {
		browser.findElement(By.name("side1")).sendKeys("5");
		browser.findElement(By.name("side2")).sendKeys("7");
		browser.findElement(By.name("side3")).sendKeys("7");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedResult = "isoscales";
		String result= browser.findElements(By.id("triangle-type")).toString();
		assertNotEquals(result ,expectedResult);
		browser.close();
	}
	@Test
	public void CheckScaleneTraingle2() {
		browser.findElement(By.name("side1")).sendKeys("7");
		browser.findElement(By.name("side2")).sendKeys("8");
		browser.findElement(By.name("side3")).sendKeys("9");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedResult = "scalene";
		String result= browser.findElements(By.id("triangle-type")).toString();
		assertNotEquals(result ,expectedResult);
		browser.close();
	}
	
	
}
