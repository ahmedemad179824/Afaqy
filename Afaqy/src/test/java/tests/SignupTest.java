package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProfilePage;
import pages.SignupPage;
import Utilities.Helper;
import data.ReadProperties;


public class SignupTest extends TestBase{
	HomePage homePageObject;
	@Test()	
	public void signUp() {
		String RandomName=Helper.GenerateRandomString(6);
		String RandomNumber=Helper.GenerateRandomNo(3);
		String Email = RandomName+RandomNumber+ "@gmail.com";
		String Password =RandomName+"@"+RandomNumber+"!";
		String Day=ReadProperties.data.getProperty("Day");
		String Month=ReadProperties.data.getProperty("Month");
		String Year=ReadProperties.data.getProperty("Year");
		String FirstName=ReadProperties.data.getProperty("FirstName");
		String LastName=ReadProperties.data.getProperty("LastName");
		String Address=ReadProperties.data.getProperty("Address");
		String Country=ReadProperties.data.getProperty("Country");
		String State=ReadProperties.data.getProperty("State");
		String City=ReadProperties.data.getProperty("City");
		String ZipCode=ReadProperties.data.getProperty("ZipCode");
		String MobileNumber=ReadProperties.data.getProperty("MobileNumber");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		
		homePageObject = new HomePage(driver);
		homePageObject.clickOnSignupOption();
		SignupPage signupPageOpj = new SignupPage(driver);
        signupPageOpj.fillSignupForm(RandomName,Email, Password,Day,Month,Year,FirstName,LastName,Address,Country,State,City,ZipCode,MobileNumber);

        assertTrue(signupPageOpj.isAccountCreated());

        ProfilePage profilePageOpj = new ProfilePage(driver);
        wait.until(ExpectedConditions.visibilityOf(profilePageOpj.conBtn));
        profilePageOpj.clickOnContinueBtn();
        profilePageOpj.clickLogoutButton();
	}
}
