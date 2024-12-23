package com.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Drivers.DriverInstance;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class loginSteps extends DriverInstance{
	@Given("User Click on the Login Link")
	public void userClickOnTheLoginLink() {
	    driver.findElement(By.xpath("//button[@mattooltip=\"Login\"]")).click();
	    
	}

	@When("User click on the login button")
	public void userClickOnTheLoginButton() {
		driver.findElement(By.xpath("//button[@class='mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base']")).click();
	}
	@Then("Login should be Success")
	public void loginShouldBeSuccess() throws InterruptedException {
		Thread.sleep(2000);
	    String res=driver.findElement(By.xpath("//a[@aria-haspopup='menu']")).getText();
	System.out.println(res);
	}

	@When("Login should be Fail")
	public void loginShouldBeFail() throws InterruptedException {
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//mat-error[@id='mat-mdc-error-0']")).getText();
	    Assert.assertEquals(text, "Username or Password is incorrect.");
	    System.out.println(text);
	}
	@Given("User Enter the user name {string}")
	public void userEnterTheUserName(String name) {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='mat-input-0']")));
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(name);
	}
	@Given("User Enter the Password {string}")
	public void userEnterThePassword(String password) {

		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(password);
	   
	}
	

}
