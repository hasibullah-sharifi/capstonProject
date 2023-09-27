package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksObject extends Base {

	public LaptopNoteBooksObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Laptops & Notebooks')][@class='dropdown-toggle']")
	private WebElement laptopNoteBookTab;

	@FindBy(xpath = "//a[contains(text(),'All Laptops & Notebooks')]")
	private WebElement laptopAllElements;

	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macMinue;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addMac;

	@FindBy(xpath = "//div[contains(text(),'Success')]")
	private WebElement macAddSuccessMessage;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement itemsInCart;

	@FindBy(xpath = "//button[@title='Remove'][@class='btn btn-danger btn-xs']")
	private WebElement removeButton;

	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement cart;

	public void clickOnLaptopNoteBookTab() {
		laptopNoteBookTab.click();

	}

	public void clickOnShowAllElementOfLaptop() {
		laptopAllElements.click();
	}

	public void openMacMenu() {
		macMinue.click();
	}

	public void addMacToCart() {
		addMac.click();

	}

	public boolean addMacSuccessMessage() {
		return macAddSuccessMessage.isDisplayed();
	}

	public boolean cheackPriceIncard(String string) {
		System.out.println("***************************************\n" + itemsInCart.getText()
				+ "\n***********************************************************");
		boolean i = string.equals(itemsInCart.getText());
		return i;
	}

	public void clickOnCartItems() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cart.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void removeMac() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		removeButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("***************************************\n" + itemsInCart.getText()
				+ "\n***********************************************************");
	}

	public boolean cheackPriceAfterRemovingMac(String string) {
		boolean i = string.equals(itemsInCart.getText());
		return i;

	}

	// -----------------------------------------------------------------------------------------
	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div[2]/div/div[2]/div[2]/button[2]")
	private WebElement sonyWishList;

	@FindBy(xpath = "//div[contains(text(),'You must')]")
	private WebElement warrningMessage;

	public void addSonyToWishList() {
		sonyWishList.click();
	}

	public boolean isWarrningMessageDisplayed() {
		return warrningMessage.isDisplayed();
	}

	// -----------------------------------------------------------------------------------------------
	
	@FindBy(xpath="//a/img[@title='MacBook Pro']")
	private WebElement macPro;
	
	@FindBy(xpath="//li/h2[contains(text(),'$2,000.00')]")
	private WebElement priceTag;
	
	public void clickOnMacPro() {
		macPro.click();
	}
	public boolean isPriceIsCorrect(String string) {
		boolean i=string.equals(priceTag.getText());
		return i;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
