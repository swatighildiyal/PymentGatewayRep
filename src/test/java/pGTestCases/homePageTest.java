package pGTestCases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pGBaseClass.BaseClass1;
import pGPages.homePage;

public class homePageTest extends BaseClass1 {
	
	homePage HomePage;

	
	
	public homePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initilization();
		HomePage=new homePage();
		
		}
	
	
	@Test(priority=1)
	public void homePageCartMethod()
	{
		HomePage.cartLink();
		}
	
	
	@Test(priority=2)
	public void verifyTitle()
	{
		String actualTitle=HomePage.verifyTitle();
		Assert.assertEquals(actualTitle, "Guru99 Payment Gateway");
		System.out.println(actualTitle);
		}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	

	
	
	
	
	
	
	
	
	
	

}
