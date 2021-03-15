package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fbcreatenewuser {
	 WebDriver driver;
	 
	
	@Given("^user able to lanch fb page$")
	public void user_able_to_lanch_fb_page() throws Throwable {
		System.out.println("Lanching fb account");
	    // Write code here that turns the phrase above into concrete actions
	 System.setProperty("webdriver.chrome.drive", "C:\\chromeexe\\chrome89.chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.linkText("Create New Account")).click();
	 
	}

	@When("^click create newuser button$")
	public void click_create_newuser_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("^enter frist name$")
	public void enter_frist_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("^enter lastname$")
	public void enter_lastname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^enter emain$")
	public void enter_emain() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^enter password$")
	public void enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}



}
