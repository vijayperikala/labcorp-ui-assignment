package com.labcorp.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.labcorp.data.Data;
import com.labcorp.utils.References;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		References.driver = driver;
		References.driver.get(Data.LABCORP_URL);
	}
	
	@After
	public void tearOff()
	{
		References.driver.quit();
	}

}
