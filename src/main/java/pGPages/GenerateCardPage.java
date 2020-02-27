package pGPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pGBaseClass.BaseClass1;

public class GenerateCardPage extends BaseClass1 {
	
	
	@FindBy(xpath="//input[@class='button special']")
	WebElement buyNow;
	
	
	@FindBy(name="quantity")
	WebElement quantity;
	
	@FindBy(xpath="//div[@class='6u 12u$(xsmall)']//font[2]")
	WebElement total;
	
	@FindBy(name="card_nmuber")
	WebElement cardNumber;
	
	@FindBy(name="month")
	WebElement month;
	
	@FindBy(name="year")
	WebElement year;
	
	@FindBy(name="cvv_code")
	WebElement cvv;
	
	
	public GenerateCardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void buyNow()
	{
		Select select=new Select(quantity);
		select.selectByVisibleText("3");
		buyNow.click();
		Select select1=new Select(cardNumber);
		Select select2=new Select(month);
		Select select3=new Select(year);
		Select select5=new Select(cvv);
		
		}
	
	}
