package testPages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = false, priority = 1)
	public void clickProductTest() throws InterruptedException {
		homePage.clickProduct();
	}
	
	@Test(enabled = false, priority = 2)
	public void clickStartAQuoteTest () {
		homePage.clickStartAQuote();
	}
	
	@Test(enabled = false, priority = 3)
	public void clickLoginTest () throws InterruptedException {
		homePage.clickLogin();
	}
	
	@Test(enabled = true, priority = 4)
	public void clickCheckboxTest () throws InterruptedException {
		homePage.clickLogin();
		homePage.clickCheckbox();
	}

}
