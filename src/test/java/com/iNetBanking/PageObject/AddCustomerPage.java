package com.iNetBanking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	public WebDriver driver;

	public AddCustomerPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "New Customer")
	WebElement LnkAddNewCustomer;

	@FindBy(name = "name")
	WebElement txtCustomerName;

	@FindBy(name = "rad1")
	WebElement rdGender;

	@FindBy(id = "dob")
	WebElement txtDOB;

	@FindBy(name = "addr")
	WebElement txtAddress;

	@FindBy(name = "city")
	WebElement txtCity;

	@FindBy(name = "state")
	WebElement txtState;

	@FindBy(name = "pinno")
	WebElement txtPin;
	
	@FindBy(name = "telephoneno")
	WebElement txttelephone;

	@FindBy(name = "emailid")
	WebElement txtEmailId;

	@FindBy(name = "sub")
	WebElement btnSubmit;

	public void clickAddNewCustomer() {
		LnkAddNewCustomer.click();
	}

	public void enterName(String cname) {
		txtCustomerName.sendKeys(cname);
	}

	public void selectGender(String cgender) {
		rdGender.click();
	}

	public void enterDOB(String mm, String dd, String yy) {
		txtDOB.sendKeys(mm);
		txtDOB.sendKeys(dd);
		txtDOB.sendKeys(yy);
	}

	public void enterAddress(String address) {
		txtAddress.sendKeys(address);
	}

	public void enterCity(String cityname) {
		txtCity.sendKeys(cityname);
	}

	public void enterState(String statename) {
		txtState.sendKeys(statename);
	}
	
	public void enterPinNo(String cpinno) {
		txtPin.sendKeys(String.valueOf(cpinno));		
	}
	
	public void enterphonenumber(String telephonenum) {
		
		txttelephone.sendKeys(telephonenum);
	}
	public void enterEmailString (String email) {
		txtEmailId.sendKeys(email);
	}
	
	public void clickSubmit() {
		btnSubmit.click();
	}

}
