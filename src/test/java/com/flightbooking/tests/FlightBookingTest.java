package com.flightbooking.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.*;
import utils.ScreenshotUtil;

public class FlightBookingTest extends BaseClass {

	@Test
	public void bookFlightTest() {

	HomePage home = new HomePage(driver);
	home.selectCities();
	home.clickFindFlights();

	FlightsPage flights = new FlightsPage(driver);
	flights.chooseFlight();

	PurchasePage purchase = new PurchasePage(driver);
	purchase.enterPassengerDetails();
	purchase.enterPaymentDetails();
	purchase.clickPurchaseFlight();

	ConfirmationPage confirm = new ConfirmationPage(driver);
	String message = confirm.getConfirmationMessage();

	Assert.assertTrue(message.contains("Thank you"));
	ScreenshotUtil.takeScreenshot(driver,"FlightBookingTest");

	System.out.println("Flight booked successfully");

	}
	}