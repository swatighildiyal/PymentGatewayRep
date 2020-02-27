package pGBaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass1 {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass1()
	{
		
		try
		{
			prop=new Properties();
			FileInputStream ip=new FileInputStream("F:\\Users\\ghildiyal\\eclipse-workspace\\Guru99PaymentGateway\\src\\main\\java\\pGConfig\\Config.Properties");
			prop.load(ip);
			
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}

		
		}
	
	public void initilization()
	{
		String browserName=prop.getProperty("browsername");
		String urlName=prop.getProperty("url");
		if(browserName.equalsIgnoreCase("chrome"))
				{
			System.setProperty("webdriver.chrome.driver", "F:/Users/ghildiyal/Downloads/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(urlName);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			System.out.println("Initializaition is successful");
			}
		
		else
		{
			System.out.println("Initialization is failed");
		}
		
	}

	
	
	
	
	

}
