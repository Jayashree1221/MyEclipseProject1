package com.AdactinCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel_Objects {
	
	public BookAHotel_Objects(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public static WebDriver driver;
	@FindBy(id="first_name")
	public WebElement first_name;
	@FindBy(id="last_name")
	public WebElement last_name;
	@FindBy(id="address")
	public WebElement address;
	@FindBy(id="cc_num")
	private WebElement cc_num;
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirst_name() {
		return first_name;
	}
	public WebElement getLast_name() {
		return last_name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCc_num() {
		return cc_num;
	}
	public WebElement getCc_type() {
		return cc_type;
	}
	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}
	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}
	public WebElement getCc_cvv() {
		return cc_cvv;
	}
	public WebElement getBook_now() {
		return book_now;
	}
	public WebElement getLogout() {
		return logout;
	}
	@FindBy(id="cc_type")
	public WebElement cc_type;
	@FindBy(id="cc_exp_month")
	public WebElement cc_exp_month;
	@FindBy(id="cc_exp_year")
	public WebElement cc_exp_year;
	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;
	@FindBy(id="book_now")
	public WebElement book_now;
	@FindBy(id="logout")
	public WebElement logout;
	
	

}
