package com.demo.dvla;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GovUkLandingPageTest {
	
	WebDriver driver = new FirefoxDriver();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		driver.navigate().to("https://www.gov.uk");
		
	}

	@After
	public void tearDown() throws Exception {
	}


}
