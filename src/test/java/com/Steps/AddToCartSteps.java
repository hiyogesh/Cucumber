package com.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Drivers.DriverInstance;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartSteps extends DriverInstance{


	@Given("user should be login by {string} and {string}")
	public void userShouldBeLoginByAnd(String name, String password) {

		driver.findElement(By.xpath("//button[@mattooltip=\"Login\"]")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='mat-input-0']")));
		
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base']")).click();
	}

	@Given("user search the book {string}")
	public void userSearchTheBook(String book) {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='search']")));
		driver.findElement(By.xpath("//input[@aria-label='search']")).sendKeys(book);
		driver.findElement(By.xpath("//span[@class='mdc-list-item__primary-text']")).click();

	}

	@When("user Add to Cart")
	public void userAddToCart() {
		driver.findElement(By.xpath("//button[@class='mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-']")).click();

	}

	@Then("user get the updated badge")
	public void userGetTheUpdatedBadge() {
		String badge=driver.findElement(By.xpath("//span[@id='mat-badge-content-0']")).getText();
		System.out.println(badge);
	}

}
