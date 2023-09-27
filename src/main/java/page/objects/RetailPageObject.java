package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {
	public RetailPageObject() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//li/a[@title='My Account']")
	private WebElement myAccount;

	@FindBy(xpath = "//li/a[contains(text(),'Login')]")
	private WebElement loginOption;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailInputOption;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordInputOption;

	@FindBy(xpath = "//input[@type='submit'][@value='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//div//h2[contains(text(),'My Account')]")
	private WebElement successMessage;

	public void clickOnMyAccount() {
		myAccount.click();
	}

	public void clickOnLoginOption() {
		loginOption.click();
	}

	public void enterEmail(String email) {
		emailInputOption.sendKeys(email);

	}

	public void enterPassword(String password) {
		passwordInputOption.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();

	}

	public boolean successMessage() {
		boolean messageValue = successMessage.isDisplayed();
		return messageValue;

	}
	// ----------------------------------------------------------------------------------------

	@FindBy(xpath = "//a[contains(text(),'Register for an affiliate account')]")
	private WebElement RegisterOption;

	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyName;

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement website;

	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement TaxID;

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement paymentMethod;

	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement PayName;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement aboutUs;

	@FindBy(xpath = "//input[@type='submit'][@value='Continue']")
	private WebElement ContinueButton;

	@FindBy(xpath = "//div[contains(text(),'Success')]")
	private WebElement successMessage2;

	public void clickOnRegister() {
		RegisterOption.click();

	}

	public void enterCompanyName(String company) {
		companyName.sendKeys(company);
	}

	public void enterWebSite(String site) {
		website.sendKeys(site);
	}

	public void enterTaxID(String taxID) {
		TaxID.sendKeys(taxID);
	}

	public void paymentMethod(String PayMethod) {
		paymentMethod.click();

	}

	public void enterPayname(String payname) {
		PayName.sendKeys(payname);
	}

	public void checkAboutUS() {
		aboutUs.click();
	}

	public void clickOnContinueButton() {
		ContinueButton.click();
	}

	public boolean isAccountCreated() {
		return successMessage.isDisplayed();

	}

//-------------------------------------------------------------------------------------------
	@FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
	private WebElement editMenu;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement editName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement editLastName;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement editEmail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement editTelephone;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement editContinueButton;

	@FindBy(xpath = "//div[contains(text(),' Your account has been successfully updated.')]")
	private WebElement editSuccessMessage;

	public void clickOnEditMenu() {
		editMenu.click();
	}

	public void enterEditName(String name) {
		editName.clear();
		editName.sendKeys(name);
	}

	public void enterEditLastName(String lastName) {
		editLastName.clear();
		editLastName.sendKeys(lastName);
	}

	public void enterEditEmail(String email) {
		editEmail.clear();
		editEmail.sendKeys(email);
	}

	public void enterEditTelePhone(String telephone) {
		editTelephone.clear();
		editTelephone.sendKeys(telephone);
	}

	public void clickOnEditContinueButton() {
		editContinueButton.click();
	}

	public boolean editSuccessMessage() {
		return editSuccessMessage.isDisplayed();

	}
	// -------------------------------------------------------------------------------------------

	
	@FindBy(xpath="//a[contains(text(),'Edit your affiliate information')]")
	private WebElement affiliateInformationMenu;
	
	@FindBy(xpath="//label/input[@name='payment'][@value='bank']")
	private WebElement bank;
	
	@FindBy(xpath="//input[@id='input-bank-name']")
	private WebElement bankName;
	
	@FindBy(xpath="//input[@id='input-bank-branch-number']")
	private WebElement branchNumber;
	
	@FindBy(xpath="//input[@id='input-bank-swift-code']")
	private WebElement swiftCode;
	
	@FindBy(xpath="//input[@id='input-bank-account-name']")
	private WebElement AccountName;
	
	@FindBy(xpath="//input[@id='input-bank-account-number']")
	private WebElement AccountNumber;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement affiliateContinueButton;
	
	@FindBy(xpath="//div[contains(text(),'Your account has been successfully updated')]")
	private WebElement affiliateSuccessMessage;
	
	
	public void clickOnAffiliateMenu() {
		affiliateInformationMenu.click();
}
	
	public void clickOnBankPayOption() {
		bank.click();
		
	}
	public void enterBankName(String bank) {
		bankName.sendKeys(bank);
		
	}
	public void enterBrancName(String branch) {
		branchNumber.sendKeys(branch);
	}
	
	public void enterSwiftCode(String code) {
		swiftCode.sendKeys(code);
	}
	
	public void enterAccountName(String accountname) {
		AccountName.sendKeys(accountname);
	}
	
	public void enterAccountNumber(String accountnumber) {
		AccountNumber.sendKeys(accountnumber);
	}
	public void clickOnAffiliateContinueButton() {
		affiliateContinueButton.click();
	}
	public boolean affiliateEditSuccessMessage() {
		return affiliateSuccessMessage.isDisplayed();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
