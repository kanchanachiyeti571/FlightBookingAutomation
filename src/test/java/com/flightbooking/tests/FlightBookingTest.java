package com.flightbooking.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseClass;
import pages.*;
import utils.ScreenshotUtil;


public class FlightBookingTest extends BaseClass {

	@Test
	public void bookFlightTest() throws InterruptedException {

	HomePage home = new HomePage(driver);
	home.selectCities();
	home.clickFindFlights();
	Thread.sleep(2000);

	FlightsPage flights = new FlightsPage(driver);
	flights.chooseFlight();
	Thread.sleep(2000);

	PurchasePage purchase = new PurchasePage(driver);
	purchase.enterPassengerDetails();
	purchase.enterPaymentDetails();
	purchase.clickPurchaseFlight();
	Thread.sleep(2000);

	ConfirmationPage confirm = new ConfirmationPage(driver);
	String message = confirm.getConfirmationMessage();
	Thread.sleep(2000);

	Assert.assertTrue(message.contains("Thank you"));
	ScreenshotUtil.takeScreenshot(driver,"FlightBookingTest");

	System.out.println("Flight booked successfully");

	}
	}