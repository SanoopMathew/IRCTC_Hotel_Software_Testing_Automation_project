package irctc_page;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
		//LogIn button text verification
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
	//Data driven test 
	public void login() throws IOException, InterruptedException
	{
		driver.findElement(homeloginbtn).click();
		Thread.sleep(4000);
		FileInputStream ob= new FileInputStream("C:\\Users\\sanoo\\OneDrive\\Desktop\\temp\\Luminar\\WrksTestng//DataDriven.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet sh= wb.getSheet("Sheet1");
		int rowcount=sh.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			String usrname=sh.getRow(i).getCell(0).getStringCellValue();
			String pasword=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("User"+usrname);
			System.out.println("password "+pasword);
			driver.findElement(username).clear();
			driver.findElement(username).sendKeys(usrname);
			driver.findElement(password).clear();
			driver.findElement(password).sendKeys(pasword);
			driver.findElement(loginbtn).click();
			Thread.sleep(5000);			
		}
	}

}
