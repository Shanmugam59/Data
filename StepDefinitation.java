package org.stepdefinitation;

import org.openqa.selenium.WebElement;
import org.testing.BaseClass;
import org.testing.Loginpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitation extends BaseClass {
	Loginpojo L;

	@Given("user have to enter facebook login through chrome")
	public void user_have_to_enter_facebook_login_through_chrome() {
		ChromeBrowser();
		launchurl("https://en-gb.facebook.com/");
		MaxWindow();

	}

	@When("user have enter {string} and {string}")
	public void user_have_enter_and(String string, String string2) {
		L = new Loginpojo();
		WebElement txtmail = L.getTxtmail();
		filltextbox(txtmail, string);
		WebElement txtpass = L.getTxtpass();
		filltextbox(txtpass, string2);
	}

	@When("user have to click login button")
	public void user_have_to_click_login_button() {
		Loginpojo p = new Loginpojo();
		WebElement login = p.getLogin();
		login.click();
	}

	@Then("user have to reach invalid credential page")
	public void user_have_to_reach_invalid_credential_page() {
		System.out.println("Invalid details");

	}

}
