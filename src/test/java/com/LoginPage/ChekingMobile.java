package com.LoginPage;

import org.testng.annotations.Test;

import com.Keyword.Keywords;

public class ChekingMobile {
	@Test
	public void verifyMobileNumberRequriedOrNot() {
		String s = "Username is required.";
		Keywords key = new Keywords();
		key.openBrowser();
		key.launchUrl("https://parabank.parasoft.com/parabank/index.htm");
		key.clickButton("//a[text()='Register']");
		key.sendKeys(("//input[@name=\"customer.firstName\"]"), "smita");
		key.sendKeys("//input[@name=\"customer.lastName\"]", "smi");
		key.sendKeys("//input[@name=\"customer.address.street\"]", "abc");
		key.sendKeys("//input[@name=\"customer.address.city\"]", "pune");
		key.sendKeys("//input[@name=\"customer.address.state\"]", "mh");
		key.sendKeys("//input[@name=\"customer.address.zipCode\"]", "123456");
		key.sendKeys("//input[@name=\"customer.phoneNumber\"]", "88888888");
		key.sendKeys("//input[@name=\"customer.ssn\"]", "sbdj");
		key.sendKeys("//input[@name=\"customer.username\"]", "");
		key.sendKeys("//input[@name=\"customer.password\"]", "123ahgf");
		key.sendKeys("//input[@name=\"repeatedPassword\"]", "123ahgf");
		key.clickButton("//input[@value=\"Register\"]");
		String err = key.getText("//span[text()='Username is required.']");
		if (s.equals(err)) {
			System.out.println("Username is required.");
		} else {
			System.out.println("It is bug.");
		}
		key.quitBrowser();

	}

}
