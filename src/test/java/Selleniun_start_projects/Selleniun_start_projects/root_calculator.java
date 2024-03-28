package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class root_calculator {
	 static WebDriver  browser;
	
	 @Before
		public void setup() {

			System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");
			browser = new FirefoxDriver();
			browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			String url="https://www.calculatorsoup.com/calculators/algebra/quadratic-formula-calculator.php";
			browser.get(url);
		}
	
	 @Test
		public void Tests1() {
			browser.findElement(By.name("a")).sendKeys("2");
			browser.findElement(By.name("b")).sendKeys("0");
			browser.findElement(By.name("c")).sendKeys("0");
		    browser.findElement(By.id("calculateButton")).click();
			String expectedResult = "one real root";
			String result= browser.findElements(By.id("calculatorAnswer")).toString();
			assertNotEquals(result ,expectedResult);
			browser.close(); 
			
	 }
	 @Test
		public void Tests2() {
			browser.findElement(By.name("a")).sendKeys("2");
			browser.findElement(By.name("b")).sendKeys("5");
			browser.findElement(By.name("c")).sendKeys("6");
		    browser.findElement(By.id("calculateButton")).click();
			String expectedResult = "two complex roots.";
			String result= browser.findElements(By.id("calculatorAnswer")).toString();
			assertNotEquals(result ,expectedResult);
			browser.close(); 
			
	 }
	 @Test
		public void Tests3() {
			browser.findElement(By.name("a")).sendKeys("2");
			browser.findElement(By.name("b")).sendKeys("2");
			browser.findElement(By.name("c")).sendKeys("2");
		    browser.findElement(By.id("calculateButton")).click();
			String expectedResult = "two complex roots.";
			String result= browser.findElements(By.id("calculatorAnswer")).toString();
			assertNotEquals(result ,expectedResult);
			browser.close(); 
			
	 }
	 
	 @Test
		public void Tests4() {
			browser.findElement(By.name("a")).sendKeys("5");
			browser.findElement(By.name("b")).sendKeys("10");
			browser.findElement(By.name("c")).sendKeys("2");
		    browser.findElement(By.id("calculateButton")).click();
			String expectedResult = "two real roots";
			String result= browser.findElements(By.id("calculatorAnswer")).toString();
			assertNotEquals(result ,expectedResult);
			browser.close(); 	
	 }
	 @Test
		public void Tests5() {
			browser.findElement(By.name("a")).sendKeys("0");
			browser.findElement(By.name("b")).sendKeys("15");
			browser.findElement(By.name("c")).sendKeys("3");
		    browser.findElement(By.id("calculateButton")).click();
			String expectedResult = "a cannot be 0";
			String result= browser.findElements(By.id("calculatorAnswer")).toString();
			assertNotEquals(result ,expectedResult);
			browser.close(); 	
	 }
}
