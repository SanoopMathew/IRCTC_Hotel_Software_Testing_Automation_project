package irctc_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Irctc_Login 
{
	WebDriver driver;
	
	By logo=By.xpath("/html/body/app-root/app-home/div[1]/app-header/div/div/div[1]/a/img");
	By homeloginbtn=By.xpath("/html/body/app-root/app-home/div[1]/app-header/div/div/div[2]/div/div[2]/a");
	By username=By.xpath("//*[@id=\"IrctcLogin\"]/div[1]/form/ul/li[1]/input");
	By password=By.xpath("//*[@id=\"IrctcLogin\"]/div[1]/form/ul/li[2]/input");
	By loginbtn=By.xpath("//*[@id=\"IrctcLogin\"]/div[1]/form/ul/li[3]/button");
	
	public Irctc_Login(WebDriver driver)
	{
		this.driver=driver;		
	}
	
	public void verification()
	{
		//Logo Verification
		WebElement logoirctc=driver.findElement(logo);
		if(logoirctc.isDisplayed())
		{
			System.out.println("Logo displayed");
		}
		else
		{
			System.out.println("Logo not displayed");
		}
		//LogIn button text varification
		String actsearchbtntxt=driver.findElement(homeloginbtn).getText();
		String expsearchbtntxt="login";
		if(actsearchbtntxt.equalsIgnoreCase(expsearchbtntxt))
		{
			System.out.println("LogIn button text verified");
		}
		else
		{
			System.out.println("LogIn button text not verified");
		}
	}
	
	public void login(String usrname,String pass) throws InterruptedException
	{
		driver.findElement(homeloginbtn).click();
		Thread.sleep(2000);
		driver.findElement(username).sendKeys("username");
		driver.findElement(password).sendKeys("pass");
		driver.findElement(loginbtn).click();
	}
	

}
