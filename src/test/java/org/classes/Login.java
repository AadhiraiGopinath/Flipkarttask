package org.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base {
	public Login() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement email;

@FindBy(xpath="//button[text()='Request OTP']")
private WebElement requestButton;

public WebElement getEmail() {
	return email;
}

public WebElement getRequestButton() {
	return requestButton;
}


}
