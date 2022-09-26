package com.uk.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class StepDefination {
	WebDriver driver;
	@Given("User able to open chrome browser")
	public void user_able_to_open_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		
	    
	}
	@Given("User able to enter URL {string}")
	public void user_able_to_enter_url(String URL) {
		driver.get(URL);
		
		
	
	    
	
	}
	@When("User able to click Sign-in button")
	public void user_able_to_click_sign_in_button() {
		driver.findElement(By.xpath("(//span[@class='c-PJLV c-PJLV-ieaSTiH-css'])[3]")).click();
	    
	
	}
	@When("User able to enter valid userName {string}")
	public void user_able_to_enter_valid_user_name(String userName) {
		driver.findElement(By.id("email")).sendKeys("hasanmurad4201@gmail.com");
	    
	
	}
	@When("User able to enter valid password {string}")
	public void user_able_to_enter_valid_password(String password) {
		driver.findElement(By.id("password")).sendKeys("Murad123");
	    
	
	}
	@When("User able to click on the login button")
	public void user_able_to_click_on_the_login_button() {
		driver.findElement(By.xpath("(//*[@aria-live='polite'])[3]")).click();
	    
	
	}
	@Then("User able to varify the information on grid")
	public void user_able_to_varify_the_information_on_grid() {
	    
	
	}

}
