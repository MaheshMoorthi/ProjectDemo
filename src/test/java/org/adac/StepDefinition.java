package org.adac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

WebDriver driver;
	

	@Given("user is on adactin Home Page")
	public void user_is_on_adactin_Home_Page() {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://adactinhotelapp.com/");
	
	}
	@When("user enters the valid username and password")
	public void user_enters_the_valid_username_and_password() {
	    
		WebElement txtUsrName = driver.findElement(By.id("username"));
		txtUsrName.sendKeys("Maneeet patel");
		WebElement txtPassWord = driver.findElement(By.id("password"));
	txtPassWord.sendKeys("greenstechie");	
	}

	@Then("user should click on the login button")
	public void user_should_click_on_the_login_button() {
	   WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}


	

}
