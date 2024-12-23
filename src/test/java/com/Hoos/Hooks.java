package com.Hoos;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Drivers.DriverInstance;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks extends DriverInstance{
//	@BeforeStep
//	public void beforeStep(Scenario scen) {
//		byte[] Screenshot=driver.getScreenshotAs(OutputType.BYTES);
//		scen.attach(Screenshot, "image/png", "Before Step Execute");
//
//	}
	@Before
	public void startUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bookcart.azurewebsites.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@After
	public void end(Scenario scen) {
		boolean res=scen.isFailed();
		System.out.println("Test Failed: "+res);
		if(res) {
			byte[] Screenshot=driver.getScreenshotAs(OutputType.BYTES);
			scen.attach(Screenshot, "image/png", "Failed Scenario screenshort");
		}
		
		driver.quit();

	}

}
