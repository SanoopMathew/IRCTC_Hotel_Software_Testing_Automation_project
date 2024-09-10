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
	By username=By.id("userName");
	By fullname=By.xpath("//*[@id=\"fullName\"]");
	By password=By.id("usrPwd");
	By confirmpassword=By.id("cnfUsrPwd");
	By mail=By.id("email");
	By cntrycode=By.xpath("//*[@id=\"divMain\"]/div/app-user-signup/div/div/form/div/div[2]/div/div[2]/div[7]/select");
	By mobile=By.xpath("//*[@id=\"mobile\"]");
	By submitbtn=By.xpath("//*[@id=\"divMain\"]/div/app-user-signup/div/div/form/div/div[2]/div/div[2]/div[10]/div/button");
	
		
	public Irctc_SignUp(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void signup() throws InterruptedException
	{
		driver.findElement(loginbtn).click();
		Thread.sleep(2000);
		driver.findElement(signup).click();
		Thread.sleep(2000);
		driver.findElement(username).sendKeys("sanoopmathew");
		driver.findElement(fullname).sendKeys("Sanoop Mathew");
		driver.findElement(password).sendKeys("Sanoop5465rfer^%&^");
		driver.findElement(confirmpassword).sendKeys("Sanoop5465rfer^%&^");
		driver.findElement(mail).sendKeys("Sanoo8456p@gmail.com");
		
		//Dropdown Country Code
		WebElement code=driver.findElement(cntrycode);
		Select cc=new Select(code);
		cc.selectByVisibleText("+91 - India(NRI)");
		
		driver.findElement(mobile).sendKeys("9568784512");
		driver.findElement(submitbtn).click();
			    				
	}

}
