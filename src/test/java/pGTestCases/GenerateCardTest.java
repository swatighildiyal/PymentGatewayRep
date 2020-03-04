package pGTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pGBaseClass.BaseClass1;
import pGPages.GenerateCardPage;
import pGPages.homePage;
import pGUtility.ExcelReader;

public class GenerateCardTest extends BaseClass1 {
	GenerateCardPage gcn;
	homePage HomePage;
	String sheet="Sheet1";
	
	public GenerateCardTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		initilization();
		HomePage=new homePage();
		HomePage.cartLink();
		
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= ExcelReader.getTestData(sheet);
		return data;
	}
	
	/*@Test(dataProvider="getData")
	public void buyMethod(String cardNumber, String month,String year,String cvv)
	{
		gcn=new GenerateCardPage();
		gcn.buyNow(cardNumber, month, year, cvv);
		
	}*/
	
	@Test(priority=1)
	public void priceCheck()
	{
		gcn=new GenerateCardPage();
		gcn.validatePrice();
	}

	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("driver needs to be closed");
		driver.close();
		
	}
}
