package pom_Rap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
				
		PageFactory.initElements(driver,this);
		
     }
	
	@FindBy(id = "name")
	 private WebElement nameTextField;
	
	@FindBy(id = "email")
	 private WebElement emailTextField;

	@FindBy(id = "password")
	 private WebElement passwordTextField;

	@FindBy(tagName = "button")
	 private WebElement registerbutton;
	

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	
	public void registerAction(String name,String email,String password) {
		nameTextField.sendKeys(name);  
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		registerbutton.click();
		
	 }

}
