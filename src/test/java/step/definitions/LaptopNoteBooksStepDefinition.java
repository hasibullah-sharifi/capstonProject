package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksObject;

public class LaptopNoteBooksStepDefinition extends Base {
	LaptopNoteBooksObject laptobObject = new LaptopNoteBooksObject();

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptobObject.clickOnLaptopNoteBookTab();
		logger.info("user clicked on LaptopNoteBook tab");

	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptobObject.clickOnShowAllElementOfLaptop();
		logger.info("user clicked on show all loptop and notbook elements");

	}

	// -----------------------------------------------------------------------------------------------------------------
	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {

		laptobObject.openMacMenu();
		logger.info("user click on mack book menu");

	}

	@When("User click add to Cart button for mac")
	public void user_click_add_to_cart_button_for_mac() {

		laptobObject.addMacToCart();
		logger.info("user add mac to the cart");
	}

	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		Assert.assertTrue(laptobObject.addMacSuccessMessage());
		logger.info("success message was displayed");

	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) {
		Assert.assertTrue(laptobObject.cheackPriceIncard(string));
		logger.info("both message machted");

	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptobObject.clickOnCartItems();
		logger.info("user clicked on card again");
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {

		laptobObject.removeMac();
		logger.info("user remove mac from cart");

	}

	@Then("item should be removed and cart should show {string} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(String string) {
		Assert.assertTrue(laptobObject.cheackPriceAfterRemovingMac(string));
		logger.info("message matched after remove mac from cart");

	}

	// ------------------------------------------------------------------------------------------------------------
	@When("User click on heart icon to add Sony VaIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptobObject.addSonyToWishList();
		logger.info("user clicked on add sony to wish list");

	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
		Assert.assertTrue(laptobObject.isWarrningMessageDisplayed());
		logger.info("warrning message was displayed as expected");

	}
	// ---------------------------------------------------------------------------------------------------------------\

	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptobObject.clickOnMacPro();
		logger.info("user clicked on MacBook pro");

	}

	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		Assert.assertTrue(laptobObject.isPriceIsCorrect(string));

		
	}

}
