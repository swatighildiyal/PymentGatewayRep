package pGPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pGBaseClass.BaseClass1;

public class checkCardLimit extends BaseClass1 {
	
	
	
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitButton;
	@FindBy(name="card_nmuber")
	WebElement cardnumber;
	
	public checkCardLimit()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void cardLimit(String cardNum) 
	{
		cardnumber.sendKeys(cardNum);
		submitButton.click();
		}
	
	public void emptyFieldVaildation()
	{
		submitButton.click();
		}
	
	
	
	
	

}
