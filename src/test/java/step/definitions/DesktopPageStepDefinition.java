package step.definitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPageObject;
import utilities.Util;

public class DesktopPageStepDefinition extends Base {
	DesktopPageObject DesktopObject = new DesktopPageObject();
	Util util = new Util();

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		DesktopObject.clickOnDesktopTab();
		logger.info("user clicked on desktop Tab");

	}//

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		DesktopObject.clickOnAllDesktopOption();
		logger.info("user clicked on all desktop option");
	}

	@Then("User should see all items are present in Desktop pag")
	public void user_should_see_all_items_are_present_in_desktop_pag() {
		Assert.assertTrue(DesktopObject.isAllItemsPresented());
		Util.takeScreenShot();

	}

	// -------------------------------------------------------------------------------------------------------------------------------------------------
	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		DesktopObject.addConnonToCard();
		logger.info("user clicked on add cannon to card button");

	}

	@When("User select quantity")
	public void user_select_quantity() {
		DesktopObject.enterQty();
		logger.info("user entered quantity");

	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		DesktopObject.clickAddToCardButton();
		logger.info("user clicked on add to card button");
		Util.takeScreenShot();

	}

	@Then("User should see a message Success")
	public void user_should_see_a_message_success() {
		Assert.assertTrue(DesktopObject.isCannonAddedToCard());
		logger.info("user got the success message");
		

	}

	// -------------------------------------------------------------------------------------------------
	@When("User click ADD TO CART option on Canon EOS5D item")
	public void user_click_add_to_cart_option_on_canon_eos5d_item() {
		DesktopObject.clickOnAddCameraToCard();
		logger.info("user clicked on add to camera");

	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		DesktopObject.selectColorRed();
		logger.info("user select red color");

	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		DesktopObject.enterCameraQty(string);

	}

	@When("User click add to Cartbutton")
	public void user_click_add_to_cartbutton() {
		DesktopObject.clickAddCamera();
		logger.info("user clicked on add to card button");
		Util.takeScreenShot();

	}

	@Then("User should see a message")
	public void user_should_see_a_message() {
		Assert.assertTrue(DesktopObject.CameraSuccessMessage());
	}

//--------------------------------------------------------------------------------------------------------------------------------------
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		DesktopObject.clickOnReviewOption();
		logger.info("user clicked on review option");
		
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String,String>> info=dataTable.asMaps(String.class,String.class);
		DesktopObject.enterNameForReview(info.get(0).get("yourname"));
		logger.info("user entered name for review");
		DesktopObject.writeReview(info.get(0).get("yourReview"));
		logger.info("user entered review");
		DesktopObject.giveRating(info.get(0).get("Rating"));
		logger.info("user entered rating");
		
	}

	@When("User click on ContinueButton")
	public void user_click_on_continue_button() {
		DesktopObject.clickOnReviewContinueButton();
		logger.info("user clicked on continue button on review page");
		
	}
	@Then("User should see a message Of successfull review")
	public void user_should_see_a_message_of_successfull_review() {
		Assert.assertTrue(DesktopObject.reviewSuccessMessage());
		
	}
	
}
