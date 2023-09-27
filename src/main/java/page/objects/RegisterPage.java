package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RegisterPage extends Base {

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement Register;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameField;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameField;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailField;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephoneField;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement passConfirmField;

	@FindBy(xpath = "//input[@name='newsletter'][@type='radio'][@value='1']")
	private WebElement yesSubscribe;

	@FindBy(xpath = "//input[@name='newsletter'][@type='radio'][@value='0']")
	private WebElement noSubscribe;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement privacyPlolicy;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;

	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	private WebElement sccessMessage;
	public void clickOnRegister() {
		Register.click();
	}

	public void enterFirstName(String firstNameValue) {
		firstNameField.sendKeys(firstNameValue);
	}

	public void enterLastName(String lastNameValue) {
		lastNameField.sendKeys(lastNameValue);
	}

	public void enterEmail(String emailValue) {
		emailField.sendKeys(emailValue);
	}

	public void enterTelephone(String telephoneValue) {
		telephoneField.sendKeys(telephoneValue);
	}

	public void enterPassword(String passValue) {
		passwordField.sendKeys(passValue);
	}

	public void enterConfirPassword(String confirmPasswordValue) {
		passConfirmField.sendKeys(confirmPasswordValue);
	}

	public void selectSubscribe(String Option) {
		if (Option.equalsIgnoreCase("yes") && !yesSubscribe.isSelected()) {
			yesSubscribe.click();
		} else {
			noSubscribe.click();
		}
	}
	
	public void clickPrivacyPolicy() {
		privacyPlolicy.click();
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}
	public String getSccessMessage() {
		String actualMessage=sccessMessage.getText();
		return actualMessage;

	}
}
