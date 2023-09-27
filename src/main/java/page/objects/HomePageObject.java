package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button/span[contains(text(),'Currency')]")
	private WebElement currency;
	
	@FindBy(xpath="//button[@name='EUR']")
	private WebElement Euro;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement itemsInCart;
	
	public void clickOnCurrency() {
		currency.click();
	}
	public void selectEURO() {
		Euro.click();
	}
	
	public boolean isEuroDisplayed() {
		boolean i=itemsInCart.getText().contains("€");
		return i;
		
	}
	//------------------------------------------------------=-=-=-=-=-=-=-=-=-=-=------------------------------------
	@FindBy(xpath="//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement emptyMessage;
	
	public void clickOnShopingCart() {
		itemsInCart.click();
	}
	public boolean emptyMessageOfShoppingCart() {
	return emptyMessage.isDisplayed();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
