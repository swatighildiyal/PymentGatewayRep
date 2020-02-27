package pGTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pGBaseClass.BaseClass1;
import pGPages.GenerateCardPage;
import pGPages.homePage;

public class GenerateCardTest extends BaseClass1 {
	GenerateCardPage gcn;
	homePage HomePage;
	
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
	
	@Test
	public void buyMethod()
	{
		gcn=new GenerateCardPage();
		gcn.buyNow();
		
	}

	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("driver needs to be closed");
	}
}
