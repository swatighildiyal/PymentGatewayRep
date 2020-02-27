package pGTestCases;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pGBaseClass.BaseClass1;
import pGPages.cardNumberPage;
import pGPages.homePage;

public class cardNumberTest extends BaseClass1 {
	
	homePage HomePage;
	cardNumberPage cnt;
	
	public cardNumberTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		initilization();
		HomePage=new homePage();
		}
	
	@Test
	public void creditMethod()
	{
		cnt=new cardNumberPage();		
		HomePage.generateCardNumber();
		String homePage=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())
		{
			String cardWindow=i1.next();
			if(!homePage.equalsIgnoreCase(cardWindow))
			{
				driver.switchTo().window(cardWindow);
				System.out.println(driver.getCurrentUrl());
				cnt.cardInfo();
				}
			
}
		driver.switchTo().window(homePage);
		System.out.println(driver.getCurrentUrl());
		
		
}

	@AfterMethod
	public void tearDown()
	{
		System.out.println("Need to close the browser");
	}
	

}
