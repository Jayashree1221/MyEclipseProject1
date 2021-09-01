package com.Properties;

import org.openqa.selenium.WebDriver;

import com.AdactinCucumber.BookAHotel_Objects;
import com.AdactinCucumber.Login_PageObjects;
import com.AdactinCucumber.Search_HotelObjects;
import com.AdactinCucumber.Select_HotelObjects;

public class POM_Manager {
	
	
	public static WebDriver driver;
	
	private Login_PageObjects lp;
	private Search_HotelObjects sh;
	private  Select_HotelObjects sel;
	private BookAHotel_Objects b;
	
	public POM_Manager(WebDriver driver2) {
this.driver = driver2;	}

	public Login_PageObjects getInstanceLogin_PageObjects() {
		lp = new Login_PageObjects(driver);
		return lp;
	}
	
	public Select_HotelObjects getInstanceSelect_HotelObjects() {
		sel = new Select_HotelObjects(driver);
		return sel;
		}
	public Search_HotelObjects getInstanceSearch_HotelObjects() {
		sh = new Search_HotelObjects(driver);	
		return sh;
		}
	
	
	public BookAHotel_Objects getInstanceBookAHotel_Objects() {
		
		b = new BookAHotel_Objects(driver);	
		return b;}
	


}
