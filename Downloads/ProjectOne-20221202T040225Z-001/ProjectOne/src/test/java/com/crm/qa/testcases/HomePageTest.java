package com.crm.qa.testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;

public class HomePageTest extends TestBase {
	HomePage hm;
	WebDriver driver;

	

	@BeforeTest()
	public void setUp() {
		System.out.println("Driver 1:-- " + driver);
		initlization();
		hm = new HomePage();
	}

	@Test(priority = 2)
	public void VerifyTitleTest() {
		System.out.println("Driver in VerifyTitle Test 2:---" + driver);
		 hm.validateHomePageTitle();
		//Assert.assertEquals(title, "Home | Medusa Gatsby Starter");
	}

//	@Test(enabled = false)
//	public void productSectionTest() {
//		boolean flag = hm.verifyProductSectionIsAvailable();
//		assertTrue(flag);
//
//	}
//
//	@Test(enabled = false)
//	public void currencySectionTest() {
//		boolean flag = hm.verifyCurrencySectionIsAvailable();
//		assertTrue(flag);
//	}
//
//	@Test(enabled = false)
//	public void spainEURtest() {
//
//		boolean flag = hm.verifySpainEURisSelectable();
//		assertTrue(flag);
//	}
//
//	@Test(enabled = false)
//	public void accountSectionTest() {
//		boolean flag = hm.verifyaccountSectionElementIsAvailable();
//		assertTrue(flag);
//	}
//
//	@Test(priority = 3)
//	public void tearDown() {
//		System.out.println("Driver in TearDown:--" + driver);
//		driver.quit();
//	}

}