package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage extends PageBase{

	public ProfilePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	By ContinueBtn =By.cssSelector("a[data-qa=\"continue-button\"]");
	By logoutButton = By.xpath("//a[contains(text(),'Logout')]");
	public WebElement conBtn=driver.findElement(ContinueBtn);
	public void clickOnContinueBtn() {
		
		driver.findElement(ContinueBtn).click();
	}
    public void clickLogoutButton() {
    	
        driver.findElement(logoutButton).click();
    }
}
   
