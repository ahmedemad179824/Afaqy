package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	
protected WebDriver driver;
	
	public PageBase(WebDriver driver)
	{
		this.driver = driver;
	}
	public void sendText(WebElement element, String text )
	{
		element.clear();
		element.sendKeys(text);
	}
	
}
