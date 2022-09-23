package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.e2etests.automation.page_objects.AuthentificationPage;
import com.e2etests.automation.utils.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {
	public WebDriver driver;
	private AuthentificationPage authentificationPage;
	public AuthentificationStepDefinition() {
		this.authentificationPage = new AuthentificationPage();
 }

	
	@Given("Je me connecte sur l'application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		authentificationPage.goToUrl();

	}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String name) {
		authentificationPage.fillUserName(name);
	}

	@When("Je saisie le password {string}")
	public void jeSaisieLePassword(String passwordText) {
		authentificationPage.fillPassword(passwordText);
	}

	@When("Je clique sur le boutton submit")
	public void jeCliqueSurLeBouttonSubmit() {
		authentificationPage.clickOnBtnSubmit();

	}

	@Then("Je me redirige vers la page Home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String message = AuthentificationPage.welcomeMessage.getText();
		Assert.assertEquals(text, message);
	}

}
