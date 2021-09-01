package com.AdactinCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PageObjects {
	
	public static WebDriver driver;
	

	

	public Login_PageObjects(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_Button() {
		return login_Button;
	}

	@FindBy(id=("username"))
	private WebElement username;
	
	@FindBy(id=("password"))
	private WebElement password;
	
	@FindBy(id=("login"))
	private WebElement login_Button;
	

}
