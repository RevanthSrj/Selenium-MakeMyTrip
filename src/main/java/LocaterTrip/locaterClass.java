package LocaterTrip;

import org.openqa.selenium.By;

public class locaterClass {

	public By clickPopup = By.xpath("//div[@id=\"webklipper-publisher-widget-container-notification-container\"]"); 
	
	public By clickBus = By.xpath("//span[text()=\"Buses\"]");
	
	public By sltLtn = By.xpath("//input[@type=\"text\"]");
	
	public By fromCity =By.xpath("//input[@title=\"From\"]");
	
	public By selectFrom = By.xpath("//p[@class=\"searchedResult font14 darkText\"]");
	
	public By toCity = By.xpath("//input[@title=\"To\"]");
	
	public By selectTo = By.xpath("//p[@class=\"searchedResult font14 darkText\"]");
	
//	public By currentDate = By.xpath("//div[@class=\"DayPicker-Day DayPicker-Day--selected\"]");
	
	public By nextDate = By.xpath("(//div[@class=\"DayPicker-Day\"])[1]");
	
	public By search = By.xpath("//button[@id=\"search_button\"]");
	
	public By pickupSeemore = By.xpath("(//span[text()=\"Show All(45)\"])[1]");
	
	public By pickupLoc = By.xpath("//span[text()=\"Perungudi\"]");
	
	public By srcDwn = By.xpath("//div[text()=\"Travel Operators\"]");
	
	public By dropLocations = By.xpath("//span[text()=\"Salem New Bus Stand\"]");
	
	public By srcMid = By.xpath("//div[text()=\"Pick up point - Chennai\"]");
	
	public By busPrice = By.xpath("//span[@id=\"price\"]");
	
	public By timing = By.xpath("//span[text()=\"6 PM to 11 PM\"]");
	
	public By srcUP = By.xpath("//h3[text()=\"Filters\"]");
	
	public By filter = By.xpath("//li[text()=\"Cheapest\"]");
	
	public By clickSelectSeat = By.xpath("(//div[text()=\"Select Seats\"])[1]");
	
	public By selectSeat = By.xpath("//span[@class=\"darkGreyText font10 lineHeight6 false\"]");
	
	public By clickContinue = By.xpath("//span[text()=\"Continue\"]");
	
	public By enterName = By.xpath("//input[@id=\"fname\"]");
	
	public By enterAge = By.id("age");
	
	public By sltGender = By.xpath("//div[@class=\"maleTab \"]");
	
	public By checkBox = By.xpath("//span[@class=\"checkboxWpr\"]");
	
	public By enterEmail = By.xpath("//input[@type=\"email\"]");
	
	public By enterMblNo = By.xpath("//input[@name=\"Mobile Number\"]");
	
	public By clickContinue2 = By.xpath("//div[@class=\"paymentBtn whiteText latoBold font16 capText\"]");
		
	
	
}
