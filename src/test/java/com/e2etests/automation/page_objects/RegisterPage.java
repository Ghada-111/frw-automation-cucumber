package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegisterPage {
	private ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='REGISTER']")
	public static WebElement register;
	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement fisrtname;
	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastname;
	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phone;
	@FindBy(how = How.ID, using = "userName")
	public static WebElement email;
	@FindBy(how = How.NAME, using = "address1")
	public static WebElement adress;
	@FindBy(how = How.NAME, using = "city")
	public static WebElement cityField;
	@FindBy(how = How.NAME, using = "state")
	public static WebElement provinceField;
	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postal;
	@FindBy(how = How.NAME, using = "country")
	public static WebElement countrySelect;
	@FindBy(how = How.ID, using = "email")
	public static WebElement username;
	@FindBy(how = How.NAME, using = "password")
	public static WebElement passwordField;
	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPasswordField;
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement submitBtn;

	public RegisterPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	public void goToUrl() {
		Setup.driver.get(configFileReader.getProperties("home.url"));
	}
	
	public void clickOnRegister() {
		register.click();
	}

	public void fillFirstName(String name) {
		fisrtname.sendKeys(name);
	}

	public void fillLastName(String lastName) {
		lastname.sendKeys(lastName);
	}

	public void fillPhoneNumber(String number) {
		phone.sendKeys(number);
	}

	public void fillEmailAdress(String emailAdress) {
		email.sendKeys(emailAdress);
	}

	public void fillAdress(String Adress) {
		adress.sendKeys(Adress);
	}
	
	public void fillCityField(String city) {
		cityField.sendKeys(city);
	}

	public void fillProvinceField(String province) {
		provinceField.sendKeys(province);
	}

	public void fillPostalCodeField(String postalCode) {
		postal.sendKeys(postalCode);
	}

	public void Select () {
		Select se = new Select(countrySelect);
		se.selectByValue("TUNISIA");
	}
	
	public void filluserName(String name) {
		username.sendKeys(name);
	}

	public void fillPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void fillConfirmPassword(String confirmPassword) {
		confirmPasswordField.sendKeys(confirmPassword);
	}

	public void clickOnbtnSubmit() {
		submitBtn.click();
	}

}
