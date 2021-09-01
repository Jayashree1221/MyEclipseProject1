package com.AdactinCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_HotelObjects {
public Search_HotelObjects(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	}
public static WebDriver driver;

@FindBy(xpath="//select[@id='location']")
private WebElement location;
public static WebDriver getDriver() {
	return driver;
}
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoomType() {
	return roomType;
}
public WebElement getRoom_nos() {
	return room_nos;
}
public WebElement getDatepick_in() {
	return datepick_in;
}
public WebElement getDatepick_out() {
	return datepick_out;
}
public WebElement getAdult_room() {
	return adult_room;
}
public WebElement getChild_room() {
	return child_room;
}
public WebElement getSubmit() {
	return Submit;
}
@FindBy(xpath="//select[@id='hotels']")
private WebElement hotels;
 @FindBy(xpath="//select[@id='room_type']")
 private WebElement roomType;
 @FindBy(xpath ="//select[@id='room_nos']")
 private WebElement room_nos;
 @FindBy(xpath="//input[@id='datepick_in']")
 private WebElement datepick_in;
 @FindBy(xpath="//input[@id='datepick_out']")
 private WebElement datepick_out;
 @FindBy(xpath="//select[@id='adult_room']")
 private WebElement adult_room;
 @FindBy(xpath="//select[@id='child_room']")
 private WebElement child_room;
 @FindBy(id="Submit")
 private WebElement Submit;
}
//input[@id='Submit']