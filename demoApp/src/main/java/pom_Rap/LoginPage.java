package pom_Rap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
						   
			}
	@FindBy(tagName = "h1")
	private WebElement loginPageHeader1;
	
	@FindBy(id = "email")
	private WebElement emailTextField;
	
	@FindBy(id = "password")
	private WebElement passwordTextField;
	
	@FindBy(tagName = "button")
	private WebElement loginbutton;

	public WebElement getLoginPageHeader1() {
		return loginPageHeader1;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public void loginAction(String email, String password){
		
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		loginbutton.click();
	}
	
	public String verifyLoginPage(){
		return loginPageHeader1.getText();
	}
		}
