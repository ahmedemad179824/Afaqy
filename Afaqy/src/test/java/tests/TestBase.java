package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import data.ReadProperties;
//import io.qameta.allure.Attachment;

public class TestBase {
	
public static WebDriver driver;
	
	@BeforeClass
	public void startDriver() 
	{
		

		String chromePath=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriverchrome.driver", chromePath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		String URL=ReadProperties.data.getProperty("URL");
		driver.get(URL);
		
		
    }
	
	@AfterClass
	public void stopDriver()
	{
		driver.quit();
	}
//	@Attachment(value = "Screenshot", type = "image/png")
//    public byte[] takeScreenshot() {
//        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//    }
//
//    @Rule
//    public TestWatcher watchman = new TestWatcher() {
//        @Override
//        protected void failed(Throwable e, Description description) {
//            takeScreenshot();
//        }
//    };

}
