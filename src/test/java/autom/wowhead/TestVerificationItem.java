package autom.wowhead;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestVerificationItem extends AbstractTest {
	// Web Elements
	@FindBy(how = How.XPATH, using="//form[@action='/search']//input[@name='q']")
	private WebElement input_search;
	
	@FindBy(how = How.XPATH, using="//a[@class='header-search-button fa fa-search']") 
	private WebElement bouton_search;
	
	@FindBy(how = How.XPATH, using="//span[contains(text(),'Continuer')]") //div[contains(class(),'banner_banner')]//span[contains(text(),'Continuer')]
	private WebElement bouton_accept_cookie;
	
	@Test
	public void test() throws InterruptedException 	{
		
		System.setProperty("webdriver.gecko.drive", "C:\\Users\\formation\\Documents\\eclipse-workspace\\drivers\\geckodriver.exe");
		WebDriver driver ;		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		// Aller sur le site 'https://fr.wowhead.com/'
		driver.get("https://fr.wowhead.com/");

		// Cliquer sur la bouton accepter le cookie		
		Thread.sleep(3000); //Wait for 5s
		driver.findElement(By.xpath("//span[contains(text(),'Continuer')]")).click();//bouton_accept_cookie.click();
		
		// Faire une recherche avec mot-cle "Lardeur"	
		//input_search.clear();
		driver.findElement(By.xpath("//form[@action='/search']//input[@name='q']")).clear();
		// input_search.sendKeys("Lardeur"); 
		driver.findElement(By.xpath("//form[@action='/search']//input[@name='q']")).sendKeys("Lardeur");
		driver.findElement(By.xpath("//a[@class='header-search-button fa fa-search']")).click();

		// TODO : Assert

		Thread.sleep(3000); //Wait for 5s
		
		driver.findElement(By.xpath("//div[@id='search-tabs']//div[contains(text(),'PNJ')]")).click();
		driver.findElement(By.xpath("//table[@class='listview-mode-default']//td[@class='icon-boss-padded']/a[1]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='listview-mode-default']//tbody[@class='clickable']/tr[1]/td[3]//a[1]")).click();
		
		Thread.sleep(2000);
		//Assert;
	}

}
