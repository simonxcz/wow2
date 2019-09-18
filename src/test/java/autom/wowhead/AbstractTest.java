package autom.wowhead;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public  abstract class  AbstractTest {
	
	WebDriver driver ;

	public String BROWSER = System.getProperty("browser");

	public AbstractTest() {

		if (BROWSER.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\formation\\Documents\\eclipse-workspace\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (BROWSER.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\formation\\Documents\\eclipse-workspace\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.IEDriver.Server", "C:\\Users\\formation\\Documents\\eclipse-workspace\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();

	}

	@After
	public void teardown() {
		driver.close();
	}
}
