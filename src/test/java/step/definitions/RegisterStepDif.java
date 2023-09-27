package step.definitions;

import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import page.objects.RegisterPage;
import utilities.Util;

public class RegisterStepDif extends Base {
	RegisterPage registerPage = new RegisterPage();

	@When("user click on Register option")
	public void user_click_on_register_option() {
		registerPage.clickOnRegister();
		logger.info("user click on register option");

	}

	@When("user fill the register form with below information")
	public void user_fill_the_register_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		/*
		 * the return type of cucumber datatable is either List<String,String>
		 * or it is List<map<string,string>>
		 */
		List<Map<String,String>> information=dataTable.asMaps(String.class,String.class);
		registerPage.enterFirstName(information.get(0).get("firstName"));
		registerPage.enterLastName(information.get(0).get("lastName"));
		registerPage.enterEmail(information.get(0).get("email"));
		registerPage.enterTelephone(information.get(0).get("telephone"));
		registerPage.enterPassword(information.get(0).get("password"));
		registerPage.enterConfirPassword(information.get(0).get("passwordConfirm"));
		registerPage.selectSubscribe(information.get(0).get("subscribe"));
		logger.info("user entered register page information");

	}

	@When("user click accepts privacyPolicy")
	public void user_click_accepts_privacy_policy() {
		registerPage.clickPrivacyPolicy();
		logger.info("user clicked on privacy policy");
		
	}

	@When("user click on Continue Button")
	public void user_click_on_continue_button() {
		registerPage.clickOnContinueButton();
		logger.info("user clicked on continue button");

	}

	@Then("user should see a successfull message {string}")
	public void user_should_see_a_successfull_message(String string) {
		Assert.assertEquals(string, registerPage.getSccessMessage());
		logger.info("Your Account Has Been Created!");
		Util.takeScreenShot();
		

	}

}
