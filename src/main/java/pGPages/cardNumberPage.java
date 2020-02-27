package pGPages;

import java.lang.reflect.Array;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import pGBaseClass.BaseClass1;
import pGUtility.ExcelReader;

public class cardNumberPage extends BaseClass1{
	
	@FindBy(xpath="//div[@class='inner']//h4[1]")
	WebElement cardNumber;
	
	@FindBy(xpath="//div[@class='inner']//h4[2]")
	WebElement cvv;
	
	@FindBy(xpath="//div[@class='inner']//h4[3]")
	WebElement expiration;
	
	
	@FindBy(xpath="//div[@class='inner']//h4[4]")
	WebElement creditLimit;
	
	@FindBy(xpath="//div[@class='inner']//h4[")
	WebElement before;
	
	String after="]";
	
	
	
	public  cardNumberPage()
	{
		PageFactory.initElements(driver, this);
		
		}
	
	
	
	public String[] cardInfo()
	{
		String[] cardDet=new String[4];
		String[] card=cardNumber.getText().trim().split("-");
		cardDet[0]=card[1].trim();
		String[] Cvv=cvv.getText().trim().split("-");
		cardDet[1]=Cvv[1].trim();
		String[] exp=expiration.getText().trim().split("-");
		String[] month=exp[1].split("/");
		cardDet[2]=month[0].trim();
		cardDet[3]=month[1].trim();
		
		
		for(int i=0;i<cardDet.length;i++)
		{
			System.out.println(cardDet[i]);
		}
		
		return cardDet;
	}
	
	
	
	
	
	
	}

	

	
	
	
	
	
	
	
	
	
	
	
