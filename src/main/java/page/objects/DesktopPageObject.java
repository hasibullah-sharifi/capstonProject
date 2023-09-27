package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class DesktopPageObject extends Base {
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Desktop')][@class='dropdown-toggle']")
	private WebElement desktopMenu;
	
	@FindBy(xpath="//a[contains(text(),'Desktop')][@class='see-all']")
	private WebElement allDesktop;
	
	@FindBy(xpath="//a[contains(text(),'Desktops (13)')]")
	private WebElement desktopItems; 
	
	public void clickOnDesktopTab() {
		desktopMenu.click();
	}
	public void clickOnAllDesktopOption() {
		allDesktop.click();
	}
	public boolean isAllItemsPresented(){
		return desktopItems.isDisplayed();}
//----------------------------------------------------------------------------------------------------------------------------------------
	
		@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[1]")
		private WebElement connonAdd;
		
		
		
		@FindBy(xpath="//input[@id='input-quantity']")
		private WebElement qty;
		
		@FindBy(xpath="//button[@id='button-cart']")
		private WebElement addToCardButton;
		
		@FindBy(xpath="//*[@id=\"product-product\"]/div[1]")
		private WebElement addConnonToCardSuccessMessage;
		
		public void addConnonToCard() {
			connonAdd.click();
			
		}
		public void enterQty() {
			qty.sendKeys("1");
		}
		public void clickAddToCardButton() {
			addToCardButton.click();
		}
		
		public boolean isCannonAddedToCard() {
			return addConnonToCardSuccessMessage.isDisplayed();
		}
		
//---------------------------------------------------------------------------------------------------------------------
		@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/i[1]")
		private WebElement cameraAdd;
		
		@FindBy(xpath="//select[@id='input-option226']")
		private WebElement selectColor;
		
		@FindBy(xpath="//input[@id='input-quantity']")
		private WebElement CameraQty;
		
		@FindBy(xpath="//button[@id='button-cart']")
		private WebElement addCameraToCartButton;
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]")
		private WebElement cameraAddToCardSuccess;
	
		public void clickOnAddCameraToCard() {
			cameraAdd.click();
			
		}
		public void selectColorRed() {
			Select select=new Select(selectColor);
			select.selectByIndex(0);
			
		}
		public void enterCameraQty(String string) {
			CameraQty.sendKeys(string);
		}
		
		public void clickAddCamera() {
			addCameraToCartButton.click();
		}
		
		public boolean CameraSuccessMessage() {
			return cameraAddToCardSuccess.isDisplayed();
		}
//------------------------------------------------------------------------------------------------------------------
		
		@FindBy(xpath="//a[contains(text(),'Review')]")
		private WebElement reviewOption;
		
		@FindBy(xpath="//input[@id='input-name']")
		private WebElement yourNameOption;
		
		@FindBy(xpath="//textarea[@id='input-review']")
		private WebElement yourReview;
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[5]")
		private WebElement rating;
		
		@FindBy(xpath="//button[@id='button-review']")
		private WebElement reviewContinueButton;
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]")
		private WebElement reviewSuccessMessage;
		
		public void clickOnReviewOption() {
			reviewOption.click();
		}
		public void enterNameForReview(String name) {
			
			yourNameOption.sendKeys(name);
			
		}
		
		public void writeReview(String r) {
			yourReview.sendKeys(r);
		}
		
		public void giveRating(String r) {
			rating.click();
			
		}
		public void clickOnReviewContinueButton() {
			reviewContinueButton.click();
		}
		
		public boolean reviewSuccessMessage() {
			return reviewSuccessMessage.isDisplayed();
		}

		
		
		
		

}
