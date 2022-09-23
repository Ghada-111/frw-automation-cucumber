package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.e2etests.automation.page_objects.AuthentificationPage;
import com.e2etests.automation.page_objects.RegisterPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	
	public WebDriver driver;
	private RegisterPage registerPage;
	public RegisterStepDefinition() {
		this.registerPage = new RegisterPage();
 }

	@When("je clique sur Register")
	public void jeCliqueSurRegister() {
		registerPage.clickOnRegister();
	}

	@When("Je saisie first Name {string}")
	public void jeSaisieFirstName( String name) {
		registerPage.fillFirstName(name);
	}

	@When("Je saisie Last Name {string}")
	public void jeSaisieLastName(String lastName) {
		registerPage.fillLastName(lastName);
	}

	@When("Je saisie phone {string}")
	public void jeSaisiePhone(String number) {
		registerPage.fillPhoneNumber(number);
	}

	@When("Je saisie Email {string}")
	public void jeSaisieEmail(String emailAdress) {
		registerPage.fillEmailAdress(emailAdress);
	}

	@When("Je saisie Adress {string}")
	public void jeSaisieAdress(String Adress) {
		registerPage.fillAdress(Adress);
	}

	@When("Je saisie city {string}")
	public void jeSaisieCity(String city) {
		registerPage.fillCityField(city);
		
	}

	@When("Je saisie State {string}")
	public void jeSaisieState(String province) {
		registerPage.fillProvinceField(province);

	}

	@When("Je saisie postal code {string}")
	public void jeSaisiePostalCode(String code) {
		registerPage.fillPostalCodeField(code);
	}

	@When("Je selectionnne Tunisie")
	public void jeSelectionnneTunisie() {
		registerPage.Select();

	}

	@When("Je saisie userName {string}")
	public void jeSaisieUserName(String name) {
		registerPage.filluserName(name);

	}

	@When("Je saisie  password {string}")
	public void jeSaisiePassword(String password) {
		registerPage.fillPassword(password);

	}

	@When("je saisie confirm password {string}")
	public void jeSaisieConfirmPassword(String confirmPassword) {
		registerPage.fillConfirmPassword(confirmPassword);

	}

	@When("Je clique sur le boutton envoyer")
	public void jeCliqueSurLeBouttonEnvoyer() {
		registerPage.clickOnbtnSubmit();

	}

	/*@Then("je verifie lenregistrement {string}")
	public void jeVerifieLenregistrement(String string) {
		String message = RegisterPage.welcomeMessage.getText();
		Assert.assertEquals(text, message);

	}*/

}
