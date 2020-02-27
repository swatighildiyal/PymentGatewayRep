package pGPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pGBaseClass.BaseClass1;

public class homePage extends BaseClass1 {
	
	@FindBy(xpath="//nav//a[text()='Cart']")
	WebElement cart;
	
	@FindBy(xpath="//nav//a[text()='Generate Card Number']")
	WebElement gcn;
	
	@FindBy(xpath="//nav//a[text()='Check Credit Card Limit']")
	WebElement ccl;
	
	public homePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void  cartLink()
	{
		cart.click();
	}
	
	public void generateCardNumber()
	{
		gcn.click();
		
	}
	
	public void checkCreditLimit()
	{
		ccl.click();
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	
	
	
	
	
}
