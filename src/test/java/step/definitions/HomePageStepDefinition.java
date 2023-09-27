package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;

public class HomePageStepDefinition extends Base {
	HomePageObject homeObject = new HomePageObject();

	@Given("User is on Retail websitee")
	public void user_is_on_retail_websitee() {
		logger.info("user on retail website");
	}

	@When("User click on Currency")
	public void user_click_on_currency() {
		homeObject.clickOnCurrency();
		logger.info("user clicked on currency dropdown");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homeObject.selectEURO();
		logger.info("user selected Euro");

	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		Assert.assertTrue(homeObject.isEuroDisplayed());

	}

	// ----------------------------------------------------------------------------------------
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homeObject.clickOnShopingCart();
		logger.info("user cliked on shoping cart");

	}

	@Then("Your shopping cart is empty! message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		Assert.assertTrue(homeObject.emptyMessageOfShoppingCart());
		logger.info("empty shopping cart message was displayed");

	}

}
