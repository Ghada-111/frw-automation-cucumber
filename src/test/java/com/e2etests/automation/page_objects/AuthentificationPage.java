package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AuthentificationPage {

	private ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.NAME, using = "userName")
	public static WebElement username;
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnsubmit;
	@FindBy(how = How.TAG_NAME, using = "h3")
	public static WebElement welcomeMessage;

	public AuthentificationPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	/* creation des methodes */
	public void goToUrl() {
		Setup.driver.get(configFileReader.getProperties("home.url"));
	}
	public void fillUserName(String name) {
		username.sendKeys(name);
	}

	public void fillPassword(String passwordText) {
		password.sendKeys(passwordText);
	}

	public void clickOnBtnSubmit() {
		btnsubmit.click();
	}

}
