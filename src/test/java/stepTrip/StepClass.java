package stepTrip;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import BaseTrip.BaseClass;
import LocaterTrip.locaterClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepClass extends BaseClass {

	locaterClass pathLocater = new locaterClass();

	@Given("User enter the Url")
	public void user_enter_the_url() throws InterruptedException {
		geturl("https://www.makemytrip.com/flights/");
		implicitWait();
		try {
			driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
		} catch (Exception e) {}
	}

	@Then("click the Buses")
	public void click_the_buses() throws InterruptedException {

		driver.findElement(pathLocater.clickBus).click();
	}

	@Then("Select the From location")
	public void select_the_from_location() throws InterruptedException {

		driver.findElement(pathLocater.sltLtn).click();

		driver.findElement(pathLocater.fromCity).sendKeys("Chennai");
		List<WebElement> dynamicList = driver.findElements(pathLocater.selectFrom);
		Thread.sleep(1000);
		for (int i = 0; i < dynamicList.size(); i++) {
			String text = dynamicList.get(i).getText();
			System.out.println("City name -" + text);
			if (text.contains("Chennai")) {
				dynamicList.get(i).click();
				break;
			}
		}
	}

	@Then("Select the To location")
	public void select_the_to_location() throws InterruptedException {

		driver.findElement(pathLocater.toCity).sendKeys("Salem");

		List<WebElement> citylist_2 = driver.findElements(pathLocater.selectTo);
		Thread.sleep(1000);
		for (int i = 0; i < citylist_2.size(); i++) {
			String toPlace = citylist_2.get(i).getText();
			System.out.println("To City -" + toPlace);
			if (toPlace.contains("Salem")) {
				citylist_2.get(i).click();
				break;
			}
		}
	}

	@Then("Select the date that is two days after the current date and click search")
	public void select_the_date_that_is_two_days_after_the_current_date_and_click_search() {

		driver.findElement(pathLocater.nextDate).click();
		driver.findElement(pathLocater.search).click();
	}

	@Then("Select the Pickup location and Scrolldown")
	public void select_the_pickup_location_and_scrolldown() throws InterruptedException {

		WebElement seeMore = driver.findElement(pathLocater.pickupSeemore);
		seeMore.click();
		driver.findElement(pathLocater.pickupLoc).click();
		Thread.sleep(500);
		WebElement SrclDown = driver.findElement(pathLocater.srcDwn);
		jsScroll(SrclDown);
	}

	@Then("Select the Drop location and ScrollUp")
	public void select_the_drop_location_and_scroll_up() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(pathLocater.dropLocations).click();
//		Thread.sleep(500);
		WebElement srclMid = driver.findElement(pathLocater.srcMid);
		jsScroll(srclMid);
	}

	@Then("Filter the lowest price")
	public void filter_the_lowest_price() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(pathLocater.timing).click();
		Thread.sleep(500);
		List<WebElement> price = driver.findElements(pathLocater.busPrice);

		List<String> data = new ArrayList<String>();

		for (int i = 0; i < price.size(); i++) {
			String p = price.get(i).getText();
			System.out.println("Price: " + p);
			data.add(p);
		}

		System.out.println("list: " + data);
		System.out.println("Total Bus: " + data.size());
		Collections.sort(data);
		System.out.println("Low to high Price: " + data);
		System.out.println("Lowest Bus Price: " + data.get(0));

		WebElement Up = driver.findElement(pathLocater.srcUP);
		jsScroll(Up);

		Thread.sleep(500);
		driver.findElement(pathLocater.filter).click();
		driver.findElement(pathLocater.clickSelectSeat).click();
	}

	@Then("Select bus seat")
	public void select_bus_seat() throws InterruptedException, IOException {

		WebElement seat = driver.findElement(pathLocater.selectSeat);
		Thread.sleep(1000);
		seat.click();
		for (int i = 0; i < 2; i++) {
			System.out.println(i);
			seat.click();
			Thread.sleep(500);
		}
		WebElement srcPickup = driver.findElement(By.xpath("//div[text()=\"Pick up time - Chennai\"]"));
		jsScroll(srcPickup);
		driver.findElement(pathLocater.clickContinue).click();
		Thread.sleep(1000);
		driver.findElement(pathLocater.enterName).sendKeys("John Cena");
		
		driver.findElement(pathLocater.enterAge).sendKeys("48");
		driver.findElement(pathLocater.sltGender).click();
		driver.findElement(pathLocater.checkBox).click();
		driver.findElement(pathLocater.enterEmail).sendKeys("wwejohncena@gmail.com");
		driver.findElement(pathLocater.enterMblNo).sendKeys("8508508501");
		WebElement srcllUP = driver.findElement(By.xpath("//span[text()=\"Traveller Details\"]"));
		jsScroll(srcllUP);
		
		driver.findElement(pathLocater.clickContinue2).click();
		
		Thread.sleep(500);
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File imgVersion = screenshot.getScreenshotAs(OutputType.FILE);
		File imgPath = new File("C:\\Users\\Revanth\\eclipse-workspace\\Testing_makeMyTrip\\image\\img.png");
		FileUtils.copyFile(imgVersion, imgPath);
		
		for (int i =0;i<2;i++) {
			driver.navigate().back();
		}
		
		
		
		
	}
}
