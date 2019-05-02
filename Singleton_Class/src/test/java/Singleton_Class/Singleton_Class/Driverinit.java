package Singleton_Class.Singleton_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverinit {
	private static Driverinit instanceDriver= null;
	private WebDriver driver;
	
	private Driverinit(){
		
	}
	public WebDriver openBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pratima\\Desktop\\Agama Solutions\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static Driverinit getInstance(){
		if(instanceDriver== null)
		instanceDriver = new Driverinit();
		return instanceDriver;
	}
	

}
