package com.crm.qa.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/main/div/div[2]/div[1]")
	WebElement featuredSection;

	@FindBy(xpath = "//span[normalize-space()='Browse all products']")
	WebElement browseAllProdcut;

	@FindBy(xpath = "//a[normalize-space()='Collections']")
	WebElement collectionElement;

	@FindBy(xpath = "//a[normalize-space()='Products']")
	WebElement productSection;

	@FindBy(xpath = "//button[@id='headlessui-menu-button-1']")
	WebElement CurrencySection;

	@FindBy(xpath = "//button[@id='headlessui-menu-item-71']")
	WebElement spainEUR;

	@FindBy(xpath = "//button[@id='headlessui-menu-button-2']")
	WebElement accountSectionElement;

	// Intializing the Page Object
	public HomePage() {

		super();
		PageFactory.initElements(driver, this);

	}

	// Actions
	public void validateHomePageTitle() {
	
		System.out.println("Driver in HomePage:-" + driver);

		//assertEquals(driver.getTitle(),"ASD");
		}

	public boolean verifyProductSectionIsAvailable() {

		return productSection.isDisplayed();

	}

	public boolean verifyCurrencySectionIsAvailable() {

		return CurrencySection.isDisplayed();

	}

	public boolean verifySpainEURisSelectable() {
		CurrencySection.click();
		spainEUR.click();

		return spainEUR.isSelected();
	}

	public boolean verifyaccountSectionElementIsAvailable() {
		return accountSectionElement.isDisplayed();
	}
}
