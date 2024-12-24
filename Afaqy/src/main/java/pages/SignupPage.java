package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

import static java.awt.SystemColor.window;

public class SignupPage extends PageBase{

	public SignupPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	By name = By.cssSelector("input[placeholder=\"Name\"]");
    By email = By.cssSelector("input[data-qa=\"signup-email\"][placeholder=\"Email Address\"]");
    By signupButton = By.cssSelector("button[data-qa=\"signup-button\"]");

    By genderMale = By.id("id_gender1");
    By password = By.id("password");
    By day = By.id("days");
    By month = By.id("months");
    By year = By.id("years");
    By newsletter = By.id("newsletter");
//    By offers = By.id("optin");

    By firstName = By.id("first_name");
    By lastName = By.id("last_name");
    By address = By.id("address1");
    By country = By.id("country");
    By state = By.id("state");
    By city = By.id("city");
    By zipcode = By.id("zipcode");
    By mobileNumber = By.id("mobile_number");
    By createAccountButton = By.xpath("//button[@data-qa='create-account']");

    By accountCreatedMessage = By.cssSelector("h2[data-qa=\"account-created\"]");

    public void fillSignupForm(String userName, String userEmail, String userPassword,String Day,String Month,String Year,String FirstName,String LastName,String Address,String Country,String State,String City,String ZipCode,String MobileNumber) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        driver.findElement(name).sendKeys(userName);
        driver.findElement(email).sendKeys(userEmail);
        driver.findElement(signupButton).click();
        Actions action = new Actions(driver);
        driver.findElement(genderMale).click();
        driver.findElement(password).sendKeys(userPassword);
        driver.findElement(day).sendKeys(Day);
        driver.findElement(month).sendKeys(Month);
        driver.findElement(year).sendKeys(Year);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(newsletter));
        action.moveToElement(driver.findElement(newsletter)).click().perform();
        driver.findElement(firstName).sendKeys(FirstName);
        driver.findElement(lastName).sendKeys(LastName);
        driver.findElement(address).sendKeys(Address);
        driver.findElement(country).sendKeys(Country);
        driver.findElement(state).sendKeys(State);
        driver.findElement(city).sendKeys(City);
        driver.findElement(zipcode).sendKeys(ZipCode);
        driver.findElement(mobileNumber).sendKeys(MobileNumber);
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(createAccountButton));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(createAccountButton)));
       action.moveToElement(driver.findElement(createAccountButton)).click().perform();
    }

    public boolean isAccountCreated() {
        return driver.findElement(accountCreatedMessage).isDisplayed();
    }

}
