package irctc_page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Irctc_Hotelbooking 
{
	WebDriver driver;
	
	By where=By.xpath("//*[@id=\"inputbox\"]");
	By place=By.xpath("//*[@id=\"autofillId\"]/ul/li[1]/a/div/p");
	By checkin=By.xpath("/html/body/app-root/app-home/div[1]/div[2]/app-home-hotel-search/div/div/div/form/div/div[2]/input");
	By checkinmonth=By.xpath("//div[@class='bs-datepicker-head']/bs-datepicker-navigation-view/button[2]/span");
	By checkinyear=By.xpath("//div[@class='bs-datepicker-head']/bs-datepicker-navigation-view/button[3]/span");
	By checkinday=By.xpath("//div[@class='bs-datepicker-body']/table/tbody/tr/td");
	By checkinnextbtn=By.xpath("//div[@class='bs-datepicker-head']/bs-datepicker-navigation-view/button[4]");
	By checkout=By.xpath("/html/body/app-root/app-home/div[1]/div[2]/app-home-hotel-search/div/div/div/form/div/div[3]/input");	
	By checkoutmonth=By.xpath("//div[@class='bs-datepicker-head']/bs-datepicker-navigation-view/button[2]/span");
	By checkoutyear=By.xpath("//div[@class='bs-datepicker-head']/bs-datepicker-navigation-view/button[3]/span");
	By checkoutday=By.xpath("//div[@class='bs-datepicker-body']/table/tbody/tr/td");
	By checkoutnextbtn=By.xpath("//div[@class='bs-datepicker-head']/bs-datepicker-navigation-view/button[4]");
	By roomandguest=By.xpath("/html/body/app-root/app-home/div[1]/div[2]/app-home-hotel-search/div/div/div/form/div/div[4]/input");
	By room=By.xpath("//*[@id=\"collapseBasic\"]/div/ul/li[1]/select");
	By adult=By.xpath("//*[@id=\"collapseBasic\"]/div/ul/li[2]/select");
	By children=By.xpath("//*[@id=\"collapseBasic\"]/div/ul/li[3]/select");
	By children1=By.xpath("//*[@id=\"age0\"]");
	By children2=By.xpath("//*[@id=\"age1\"]");
	By donebtn=By.xpath("//*[@id=\"collapseBasic\"]/div/div[2]/button");
	By searchhotelbtn=By.xpath("/html/body/app-root/app-home/div[1]/div[2]/app-home-hotel-search/div/div/div/form/div/div[5]/button");
	
	
	
	public Irctc_Hotelbooking(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void booking() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(where).click();
		driver.findElement(place).click();
		
		Thread.sleep(3000);		
		//CheckIn Date picker
		driver.findElement(checkin).click();
		Thread.sleep(2000);		
		String expcimonth="september";
		String expciyear="2024";
		String expciday="27";	
		
		while(true)
		{
			Thread.sleep(2000);
			String actcimonth=driver.findElement(checkinmonth).getText();
			String actciyear=driver.findElement(checkinyear).getText();
			if(actcimonth.equalsIgnoreCase(expcimonth)&&actciyear.equalsIgnoreCase(expciyear))
			{
				break;
			}
			else
			{
				driver.findElement(checkinnextbtn).click();;
			}
			
		}
		
		List<WebElement>cindays=driver.findElements(checkinday);
		for(WebElement in:cindays)
		{
			String cind=in.getText();
			if(cind.equals(expciday))
			{
				in.click();
				break;
			}
		}
		//CheckOut Date picker
				driver.findElement(checkout).click();
				Thread.sleep(2000);		
				String expcomonth="october";
				String expcoyear="2024";
				String expcoday="24";	
				
				while(true)
				{
					Thread.sleep(2000);
					String actcomonth=driver.findElement(checkoutmonth).getText();
					String actcoyear=driver.findElement(checkoutyear).getText();
					if(actcomonth.equalsIgnoreCase(expcomonth)&&actcoyear.equalsIgnoreCase(expcoyear))
					{
						break;
					}
					else
					{
						driver.findElement(checkoutnextbtn).click();;
					}
					
				}
				Thread.sleep(2000);
				List<WebElement>coutdays=driver.findElements(checkoutday);
				for(WebElement out:coutdays)
				{
					String coutd=out.getText();
					if(coutd.equals(expcoday))
					{
						out.click();
						break;
					}
				}
		
		driver.findElement(roomandguest).click();
		Thread.sleep(2000);
		//Room Dropdown
		WebElement slctrm=driver.findElement(room);
		Select rm=new Select(slctrm);
		rm.selectByVisibleText("1");
		//Adult Dropdown
		WebElement slctadult=driver.findElement(adult);
		Select adlt=new Select(slctadult);
		adlt.selectByVisibleText("4");
		//Children Dropdown
		WebElement slctchildren=driver.findElement(children);
		Select chldrn=new Select(slctchildren);
		chldrn.selectByVisibleText("2");
		//Children1age Dropdown
		WebElement slctchildren1=driver.findElement(children1);
		Select chldrn1=new Select(slctchildren1);
		chldrn1.selectByVisibleText("10");
		//Children2age Dropdown
		WebElement slctchildren2=driver.findElement(children2);
		Select chldrn2=new Select(slctchildren2);
		chldrn2.selectByVisibleText("15");
		
		Thread.sleep(2000);
		driver.findElement(donebtn).click();		
		driver.findElement(searchhotelbtn).click();
		
	}
	

}
