package pGTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pGBaseClass.BaseClass1;
import pGPages.checkCardLimit;
import pGPages.homePage;
import pGUtility.ExcelReader;

public class checkCreditCardTest extends BaseClass1{
	
	homePage HomePage;
	checkCardLimit ccl;
	String sheet="CardLimit";
	
	public checkCreditCardTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		initilization();
		HomePage=new homePage();
		HomePage.checkCreditLimit();
	}
	
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= ExcelReader.getTestData(sheet);
		return data;
	}
	
	@Test(dataProvider="getData")
	public void checkCreditCardLimit(String cardNumber)
	{
		ccl=new checkCardLimit();
		ccl.cardLimit(cardNumber);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
