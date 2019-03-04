package myPackageElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClassFE {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Users/Academy QE/Downloads/geckodriver-v0.24.0-win64/geckodriver.exe");

		//Create a new instance of Firefox Browser
				WebDriver driver = new FirefoxDriver();
				
				
				//Maximize the Browser window
				driver.manage().window().maximize();
				
				System.out.println("Step 1");

				//Open URL in Firefox browser
				driver.get("http://demo.guru99.com/test/login.html");
				
				//DIFFERENT ways to find the title in the page
				
				if(driver.findElement(By.id("site-name")).isDisplayed()) {
					System.out.println("Element is displayed");
				} else {
					System.out.println("Element is not displayed");
				}
				
				
				/*driver.findElement(By.xpath("//div[@id='site-name']"));
				driver.findElement(By.className("site-name"));
				driver.findElement(By.partialLinkText("Demo"));
				driver.findElement(By.linkText("Demo Site"));
				*/
				
				System.out.println("Step 2");
				
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("correodeprueba@test.com");
				driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("password123");
				driver.findElement(By.id("SubmitLogin")).click();
				
				System.out.println("Step 3");
								
				if(driver.findElement(By.xpath("//*[contains(text(),'Successfully Logged in...')]")).isDisplayed()) {
					System.out.println("Element is displayed");
				} else {
					System.out.println("Element is not displayed");
				}
				
				/*
				System.out.println("Step 2");
				
				driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
				
				if(driver.findElement(By.id("hplogo")).isDisplayed()) {
					System.out.println("Element is displayed");
				} else {
					System.out.println("Element is not displayed");
				}
				
				System.out.println("Step 3");
				
				driver.close();
			*/
	}

}
