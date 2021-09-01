package com.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.AdactinCucumber.Base_Class;
import com.Properties.FileReaderManager;
import com.Properties.POM_Manager;
import com.AdactinCucumber.*;
import com.RunnerClas.AdactinRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AdactinStepDefinition extends Base_Class {
	
	public static WebDriver driver= AdactinRunner.driver;
	POM_Manager pom = new POM_Manager(driver);
@Given("^user in on login page$")
public void user_in_on_login_page() throws Throwable {
	
    getURL(FileReaderManager.getInstanceFR().getInstanceCR().getURL());
}

@When("^Enter the Username \"([^\"]*)\"$")
public void enter_the_Username(String arg1) throws Throwable {

   sendText(pom.getInstanceLogin_PageObjects().getUsername(), arg1 );
}

@When("^Enter the Password \"([^\"]*)\"$")
public void enter_the_Password(String arg1) throws Throwable {
	
  sendText(pom.getInstanceLogin_PageObjects().getPassword(),arg1 );  
}

@Then("^User should be click on login$")
public void user_should_be_click_on_login() throws Throwable {
clickElement(pom.getInstanceLogin_PageObjects().getLogin_Button());
}

@Given("^User can select the hotel location$")
public void user_can_select_the_hotel_location() throws Throwable {
	selectValues(pom.getInstanceSearch_HotelObjects().getLocation(), 0, "Los Angeles", "visible");
}

@When("^select the Hotels names$")
public void select_the_Hotels_names() throws Throwable {
	selectValues(pom.getInstanceSearch_HotelObjects().getHotels(), 0, "Hotel Sunshine", "visible");
}

@When("^select the Room Type$")
public void select_the_Room_Type() throws Throwable {
	selectValues(pom.getInstanceSearch_HotelObjects().getRoomType(), 0, "Deluxe", "visible");
}

@When("^Select the Number of Rooms$")
public void select_the_Number_of_Rooms() throws Throwable {
	selectValues(pom.getInstanceSearch_HotelObjects().getRoom_nos(), 0, "5", "value");
}

@When("^Choose the date to check in$")
public void choose_the_date_to_check_in() throws Throwable {
	clearMethod(pom.getInstanceSearch_HotelObjects().getDatepick_in());
	sendText(pom.getInstanceSearch_HotelObjects().getDatepick_in(), "30/08/2021");
}

@When("^select the check out date$")
public void select_the_check_out_date() throws Throwable {
	clearMethod(pom.getInstanceSearch_HotelObjects().getDatepick_out());
	sendText(pom.getInstanceSearch_HotelObjects().getDatepick_out(), "05/09/2021");
}

@When("^Choose Adults per Room$")
public void choose_Adults_per_Room() throws Throwable {
	selectValues(pom.getInstanceSearch_HotelObjects().getAdult_room(), 0, "2", "value");  
}

@When("^Choose the Children Per Room$")
public void choose_the_Children_Per_Room() throws Throwable {
	selectValues(pom.getInstanceSearch_HotelObjects().getChild_room(), 0, "3", "value");  
}

@Then("^Click the Search button$")
public void click_the_Search_button() throws Throwable {
	clickElement(pom.getInstanceSearch_HotelObjects().getSubmit());
}

@Given("^Select the Selected Hostel$")
public void select_the_Selected_Hostel() throws Throwable {
	takeScreenshotMethod("C:\\Users\\admin\\Documents\\Custom Office Templates\\Adactin\\src\\Screenshot\\Img.png");
	clickElement(pom.getInstanceSelect_HotelObjects().radiobutton);
	
}

@When("^Click the continue button$")
public void click_the_continue_button() throws Throwable {
	clickElement(pom.getInstanceSelect_HotelObjects().continue_btn);   
	takeScreenshotMethod("C:\\Users\\admin\\Documents\\Custom Office Templates\\Adactin\\src\\Screenshot\\Img2.png");
}

@Given("^User name should be given the First Name$")
public void user_name_should_be_given_the_First_Name() throws Throwable {
	sendText(pom.getInstanceBookAHotel_Objects().first_name, "Jayashree");
}

@When("^User name should be given the Last Name$")
public void user_name_should_be_given_the_Last_Name() throws Throwable {
	sendText(pom.getInstanceBookAHotel_Objects().last_name, "Mathivanan");
}

@When("^Provide the Billing address$")
public void provide_the_Billing_address() throws Throwable {
	sendText(pom.getInstanceBookAHotel_Objects().address, "South Senninatham, Sethiyathope,CDM,Cuddalore");
}

@When("^Giving user credit card details$")
public void giving_user_credit_card_details() throws Throwable {
	
	String cc_Details = FileReaderManager.getInstanceFR().getInstanceCR().getCC_Details();
	implicitywait(90);
	sendText(pom.getInstanceBookAHotel_Objects().getCc_num(),cc_Details);
	selectValues(pom.getInstanceBookAHotel_Objects().cc_type, 0, "VISA", "visible");
	selectValues(pom.getInstanceBookAHotel_Objects().cc_exp_month, 0, "February", "visible");
	selectValues(pom.getInstanceBookAHotel_Objects().cc_exp_year, 0, "2022", "Visible");
	String cvv = FileReaderManager.getInstanceFR().getInstanceCR().getCVV();
	implicitywait(90);
	sendText(pom.getInstanceBookAHotel_Objects().getCc_cvv(),cvv);
}

@When("^click the Booknow button$")
public void click_the_Booknow_button() throws Throwable {
	clickElement(pom.getInstanceBookAHotel_Objects().book_now);
}



@Then("^click logout$")
public void click_logout() throws Throwable {
	takeScreenshotMethod("C:\\Users\\admin\\Documents\\Custom Office Templates\\Adactin\\src\\Screenshot\\Img3.png");
	checkBox(pom.getInstanceBookAHotel_Objects().logout);
	takeScreenshotMethod("C:\\Users\\admin\\Documents\\Custom Office Templates\\Adactin\\src\\Screenshot\\Img4.png");

}
}

	
	

		
	



