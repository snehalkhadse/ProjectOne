package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignInPage extends TestBase {

	// Page Factory -OR

	@FindBy(xpath = "//button[@id='headlessui-menu-button-2']")
	WebElement account;

	@FindBy(xpath = "//a[@id='headlessui-menu-item-14']")
	WebElement SignInPopUp;

	@FindBy(name = "email")
	WebElement usernam;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//*[@id=\\\"gatsby-focus-wrapper\\\"]/div/main/div/div[2]/div/form/button")
	WebElement signInButton;

	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/main/div/div[1]/img")
	WebElement logoElement;

	@FindBy(xpath = "//span[normalize-space()='This field is required']")
	WebElement mandatoryFieldMsgElement;

	// Intializing the Page Object
	public SignInPage() {
		PageFactory.initElements(driver, this);

	}

	// Actions
	public String validateSignUpPageTitle() {
		account.click();
		SignInPopUp.click();
		return driver.getTitle();
	}

	public boolean validateImage() {
		return logoElement.isDisplayed();
	}

	public void SignIn(String em, String pwd) throws IOException {
		account.click();
		SignInPopUp.click();

		usernam.sendKeys(em);

		password.sendKeys(pwd);

		signInButton.click();

	}

	public boolean SignInWithoutPassword(String em) throws IOException {
		account.click();
		SignInPopUp.click();

		usernam.sendKeys(em);

		signInButton.click();

		return mandatoryFieldMsgElement.isDisplayed();

	}

	public String ValidateMandatoryFieldText(String em) throws IOException {
		account.click();
		SignInPopUp.click();

		usernam.sendKeys(em);

		signInButton.click();

		return mandatoryFieldMsgElement.getText();

	}

}
