package irctc_test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import irctc_page.Irctc_Login;

public class Irctc_Login_Test extends Irctc_baseclass 
{
	@Test
	public void test3() throws InterruptedException, IOException
	{
		Irctc_Login il=new Irctc_Login(driver);
		il.verification();
		il.login();		
	}
	@AfterTest
	public void close() 
	{
		driver.close();
	}

}
