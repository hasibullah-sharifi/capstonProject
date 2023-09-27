package step.definitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.Util;

public class RetailStepDefinition extends Base {
	RetailPageObject RetailObject = new RetailPageObject();
	Util util = new Util();

	@Given("User is on Retail Website")
	public void user_is_on_retail_website() {
		logger.info("user is on retail stepDefinition");

	}

	@When("User click on MyAccount")
	public void user_click_on_my_account() {
		RetailObject.clickOnMyAccount();
		logger.info("user clicked on My account option");

	}

	@When("User click on Login")
	public void user_on_login() {
		RetailObject.clickOnLoginOption();
		logger.info("user clicked on loggin button");

	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
		RetailObject.enterEmail(string);
		logger.info("user entered email");
		RetailObject.enterPassword(string2);
		logger.info("user enter password");

	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		RetailObject.clickOnLoginButton();
		logger.info("user clicked on loggin button");

	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Assert.assertTrue(RetailObject.successMessage());
		logger.info("user got success messge");
		Util.takeScreenShot();

	}

	// -------------------------------------------------------------------------
	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		RetailObject.clickOnRegister();
		logger.info("user clicked on register affiliate account link");

	}

	@When("User fill affiliate from with bellow information")
	public void user_fill_affiliate_from_with_bellow_information(DataTable dataTable) {
		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
		RetailObject.enterCompanyName(info.get(0).get("company"));
		RetailObject.enterWebSite(info.get(0).get("website"));
		RetailObject.enterTaxID(info.get(0).get("taxID"));
		RetailObject.paymentMethod(info.get(0).get("paymentMethod"));
		RetailObject.enterPayname(info.get(0).get("payName"));
		logger.info("user entered all the information");

	}

	@When("check on About us check box")
	public void check_on_about_us_check_box() {
		RetailObject.checkAboutUS();
		logger.info("user cheack about us check box");

	}

	@When("User click on continue button")
	public void user_check_on_continue_button() {
		RetailObject.clickOnContinueButton();
		logger.info("user click on continue button");
		Util.takeScreenShot();
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		Assert.assertTrue(RetailObject.isAccountCreated());
		logger.info("user Register for an Affiliate Account successfully");

	}

	// ------------------------------------------------------------------------------
	@When("User click on Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		RetailObject.clickOnAffiliateMenu();
		logger.info("user clicked on edit your affiliate information");

	}

	@When("User click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		RetailObject.clickOnBankPayOption();
		logger.info("user clicked on Bank payment option");

	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
		RetailObject.enterBankName(info.get(0).get("BankName"));
		logger.info("user entered Bank Name");
		RetailObject.enterBrancName(info.get(0).get("abaNumber"));
		logger.info("user entered abaNumber or branch number");
		RetailObject.enterSwiftCode(info.get(0).get("swiftCode"));
		logger.info("user enterd swift code");
		RetailObject.enterAccountName(info.get(0).get("accountName"));
		logger.info("user entered Account Name ");
		RetailObject.enterAccountNumber(info.get(0).get("AccountNumber"));
		logger.info("user entered Account information");

	}

	@When("User click on Contiue button")
	public void user_click_on_contiue_button() {
		RetailObject.clickOnAffiliateContinueButton();
		logger.info("user entered on continue button");
		Util.takeScreenShot();

	}

	@Then("User Should seea seccess message")
	public void user_should_seea_seccess_message() {
		Assert.assertTrue(RetailObject.affiliateEditSuccessMessage());
		logger.info("user got success messsage");

	}

	// ----------------------------------------------------------------------------------------------
	@When("User click on Edit your account information")
	public void user_click_on_edit_your_account_information() {
		RetailObject.clickOnEditMenu();
		logger.info("user click on Edit your account information");
	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
		RetailObject.enterEditName(info.get(0).get("firstName"));
		logger.info("user entered firstName");
		RetailObject.enterEditLastName(info.get(0).get("lastName"));
		logger.info("user entered lastName");
		RetailObject.enterEditEmail(info.get(0).get("email"));
		logger.info("user entered email");
		RetailObject.enterEditTelePhone(info.get(0).get("telephone"));
		logger.info("user entered telephone");

	}

	@When("User click on continueButton")
	public void user_click_on_continue_button() {
		RetailObject.clickOnEditContinueButton();
		logger.info("user click on Continue button");
		Util.takeScreenShot();

	}

	@Then("User should see a success message {string}")
	public void user_should_see_a_success_message(String string) {
		//Assert.assertTrue(RetailObject.editSuccessMessage());

	}

}
