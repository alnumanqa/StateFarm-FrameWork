package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		// Page factory help to instantiate WebElements
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "productName")
	WebElement product;
	
	@FindBy(how = How.ID, using = "quote-main-zip-btn")
	WebElement startAQuote;
	
	@FindBy(xpath = "//span[text()='Log in']")
	WebElement login;
	
	@FindBy(className = "-oneX-login-remember-me-label")
	WebElement checkbox;

	public void clickProduct() throws InterruptedException {
		product.click();
		Thread.sleep(4000);
	}
	
	public void clickStartAQuote () {
		startAQuote.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickLogin () throws InterruptedException {
		login.click();
		Thread.sleep(3000);
	}
	
	public void clickCheckbox () throws InterruptedException {
		checkbox.click();
		Thread.sleep(3000);
	}
	
	

}
