package pages;

import javax.swing.text.html.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
	
 public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	

	By signUpBtn = By.xpath("//a[contains(text(),'Signup / Login')]");
	
	public void clickOnSignupOption() {
		driver.findElement(signUpBtn).click();
	}
}
