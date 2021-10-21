package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObject extends Base{
	// in this class we will store UI element of Login page
	// we will implement pageFactory. initElement method to initialize the page elements
	// we will use @FindBy annotation to story UI WebElement and access them 
	// through public methods and will write the function inside the public methods.
	
	/*
	 * This constructor will to initialize the Webelements inside this POM class 
	 * we will create PageFactory.initElement method inside the constructor 
	 */
	public LoginPageObject() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	// pageFactory class provides an annotation  @FindBy to find UI elements 
	// @Findby == driver.findElement()
	@FindBy(xpath = "//span[text() = 'My Account']")
	private WebElement myAccount;
	@FindBy(xpath = "//a[text() = 'Login']" )
	private WebElement login;
	
	@FindBy(id = "input-email")
	private WebElement email;
	@FindBy(id = "input-password")
	private WebElement password;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton; 
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountText;
	
	
	public void clickonMyAccount() {
		myAccount.click();
	
		
	}
	public void clickonMyLogin() {
		login.click();
	
		
	}
public void enterEmailAndPassword(String emailValue, String passwordValue) {
	email.sendKeys(emailValue);
	password.sendKeys(passwordValue);
	
}
    public void clickOnLoginButton() {
    	loginButton.click();
    	
    }
    
    public boolean myAccountTextisPresent() {
    	if(myAccountText.isDisplayed())
    		return true;
    	else
    		return false;
    	
    }
    
    
    
    


}
