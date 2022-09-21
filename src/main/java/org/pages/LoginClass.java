package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class LoginClass extends BaseClass {
	
	
	public LoginClass() {
		PageFactory.initElements(driver, this);
		}
@FindBy(id="email")
	private WebElement textUsername;

@FindBy(id="pass")
private WebElement textPassword;
	

public WebElement getTextUsername() {
	return textUsername;
}

public WebElement getTextPassword() {
	return textPassword;
}

@FindBy(xpath="(//a[@role='button'])[2]")
private WebElement btncreate;

@FindBy(name="firstname")
private WebElement txtfirstname;

@FindBy(name="lastname")
private WebElement txtlastname;

@FindBy(name="websubmit")
private WebElement btnsignup;

@FindBy(name="login")
private WebElement btnlogin;


public WebElement getBtncreate() {
	return btncreate;
}

public WebElement getTxtfirstname() {
	return txtfirstname;
}

public WebElement getTxtlastname() {
	return txtlastname;
}

public WebElement getBtnsignup() {
	return btnsignup;
}

public WebElement getBtnlogin() {
	return btnlogin;
}

}