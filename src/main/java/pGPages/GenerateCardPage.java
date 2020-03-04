package pGPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pGBaseClass.BaseClass1;

public class GenerateCardPage extends BaseClass1 {
	
	
	@FindBy(xpath="//input[@class='button special']")
	WebElement buyButton;
	
	
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
	WebElement cvvCode;
	
	@FindBy(name="submit")
	WebElement submitButton;
	
	@FindBy(xpath="//tr//td[2]//h3//strong")
	WebElement orderID;
	
	
	@FindBy(xpath="//div[@class='6u 12u$(small)'][2]/h3")
	WebElement price;
	
	@FindBy(xpath="//div[@class='6u 12u$(xsmall)']/font[2]")
	WebElement priceMainPage;
	
	public GenerateCardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void buyNow(String cardnum,String mon,String yr, String cv)
	{
		cardNumber.sendKeys(cardnum);		
		Select select2=new Select(month);
		select2.selectByVisibleText(mon);
		Select select3=new Select(year);
		select3.selectByVisibleText(yr);
		cvvCode.sendKeys(cv);
		submitButton.click();
		}
	
	public void validatePrice()
	{
		String[] price1=price.getText().split(":");
		String price3=price1[1].trim();	
		double homePagePrice=Double.valueOf(price3.replaceAll("[^a-zA-Z0-9]", " ").trim());		
		Select select=new Select(quantity);
		select.selectByVisibleText("4");
		buyButton.click();	
		String pricemain=priceMainPage.getText();			
		double finalPagePrice=Double.valueOf(pricemain.replace("$", " ").trim());
		System.out.println(homePagePrice);
		System.out.println(finalPagePrice);
		if(finalPagePrice%homePagePrice==0)
		{
			System.out.println("Cool");
		}
		else
		{
			System.out.println("Not cool, issue persist");
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	
	}
