package autom.wowhead;

import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class AbstractTest extends AbstractPage{

	@Test
	public void initialiser() {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\formation\\Documents\\eclipse-workspace\\drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\formation\\Documents\\eclipse-workspace\\drivers\\chromedriver.exe");

	}

}
