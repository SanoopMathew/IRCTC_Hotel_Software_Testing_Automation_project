package irctc_page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Irctc_SignUp 
{
	WebDriver driver;
	
	By loginbtn=By.xpath("/html/body/app-root/app-home/div[1]/app-header/div/div/div[2]/div/div[2]/a");
	By signup=By.xpath("//*[@id=\"IrctcLogin\"]/div[2]/p[1]/a");
	By username=By.xpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[2]/input");
	By password=By.xpath("//*[@id=\"usrPwd\"]");
	By confrmpassword=By.xpath("//*[@id=\"cnfUsrPwd\"]");
	By language=By.xpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[5]/p-dropdown/div");
	By languageselect=By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li");
	By secuirityqstion=By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div");
	By secuirityqstn=By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]/li/span");
	By secuirityanswer=By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input");
	By continuebtn1=By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
	By firstname=By.xpath("//*[@id=\"firstName\"]");
	By middlename=By.xpath("//*[@id=\"middleName\"]");
	By lastname=By.xpath("//*[@id=\"lastname\"]");
	By slctoccupation=By.xpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div");
	By occupation=By.xpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li/span");
	By unmarriedcheckbox=By.xpath("//*[@id=\"unmarried\"]/div/div[2]");
	By male=By.xpath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[1]/span");
	By nationalitydropdown=By.xpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[13]/select");
	By dob=By.xpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input");
	By dobmonthdropdown=By.xpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/div/div/div[1]/div/select[1]");
	By dobyeardropdown=By.xpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[6]/p-calendar/span/div/div/div[1]/div/select[2]");
	By dobday=By.xpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr/td");
	By country=By.xpath("//*[@id=\"ui-tabpanel-1\"]/div/div[8]/select");
	By mail=By.xpath("//*[@id=\"email\"]");
	By mobile=By.xpath("//*[@id=\"mobile\"]");
	By continuebtn2=By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
	By flat=By.xpath("//*[@id=\"resAddress1\"]");
	By street=By.xpath("//*[@id=\"resAddress2\"]");
	By area=By.xpath("//*[@id=\"resAddress3\"]");
	By addresscopycheckbox=By.xpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[9]/span[1]/p-radiobutton/div/div[2]/span");
	By phone=By.xpath("//*[@id=\"resPhone\"]");
	By pincode=By.xpath("//*[@id=\"ui-tabpanel-2\"]/div/div[4]/input");
	By city=By.xpath("//*[@id=\"ui-tabpanel-2\"]/div/div[5]/select");
	By postoffice=By.xpath("//*[@id=\"ui-tabpanel-2\"]/div/div[7]/select");
		
	public Irctc_SignUp(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void login() throws InterruptedException
	{
		Thread.sleep(3000);	
		driver.findElement(loginbtn).click();
		Thread.sleep(3000);	
		driver.findElement(signup).click();
		
		Thread.sleep(3000);		
		driver.findElement(username).sendKeys("sanoop");
		driver.findElement(password).sendKeys("sevw414@#");
		driver.findElement(confrmpassword).sendKeys("sevw414@#");
		
		Thread.sleep(2000);
		driver.findElement(language).click();
		driver.findElement(languageselect).click();
		driver.findElement(secuirityqstion).click();
		driver.findElement(secuirityqstn).click();
		driver.findElement(secuirityanswer).sendKeys("ironman");
		driver.findElement(continuebtn1).click();
		
		Thread.sleep(2000);
		driver.findElement(firstname).sendKeys("sanoop");
		driver.findElement(middlename).sendKeys("mathew");
		driver.findElement(lastname).sendKeys("km");
		driver.findElement(slctoccupation).click();
		driver.findElement(occupation).click();
		driver.findElement(unmarriedcheckbox).click();
		driver.findElement(male).click();
		//Nationality Dropdown
		Thread.sleep(3000);
		WebElement nation=driver.findElement(nationalitydropdown);
		Select nat=new Select(nation);
		nat.selectByVisibleText("India");
		
		driver.findElement(dob).click();
		//DOB month Dropdown
		Thread.sleep(3000);
		WebElement dobmnth=driver.findElement(dobmonthdropdown);
		Select dobmn=new Select(dobmnth);
		dobmn.selectByVisibleText("September");
		//DOB year Dropdown
		Thread.sleep(3000);
		WebElement dobyear=driver.findElement(dobyeardropdown);
		Select dobyr=new Select(dobyear);
		dobyr.selectByVisibleText("1997");
		//DOB date selection
		Thread.sleep(3000);
		String exday="29";
		List<WebElement> alldays=driver.findElements(dobday);
		for(WebElement ele:alldays)
		{
			String dt=ele.getText();
			if(dt.equals(exday))
			{
				ele.click();
				break;
			}
		}
		// Country Dropdown
		Thread.sleep(3000);
		WebElement slctcountry=driver.findElement(country);
		Select cntry=new Select(slctcountry);
		cntry.selectByVisibleText("India");
		
		Thread.sleep(3000);
		driver.findElement(mail).sendKeys("sdacwe546@gmail.com");
		driver.findElement(mobile).sendKeys("5481254587");
		driver.findElement(continuebtn2).click();
		
		Thread.sleep(3000);
		driver.findElement(flat).sendKeys("kuttiyanickal");
		driver.findElement(street).sendKeys("punnachuvad");
		driver.findElement(area).sendKeys("peechi");
		Thread.sleep(3000);
		driver.findElement(addresscopycheckbox).click();
		driver.findElement(phone).sendKeys("1254871236");
		driver.findElement(pincode).sendKeys("680751");
		driver.findElement(city).click();
		Thread.sleep(3000);
		driver.findElement(city).sendKeys(Keys.DOWN,Keys.ENTER);
		
		//Postoffice Dropdown
		Thread.sleep(3000);
		WebElement po=driver.findElement(postoffice);
	    Select post=new Select(po);
	    post.selectByVisibleText("Asarikkad B.O");
	    				
	}

}
