package irctc_test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import irctc_page.Irctc_SignUp;

public class Irctc_SignUp_test extends Irctc_baseclass
{
	@Test
	public void test1() throws InterruptedException
	{
		Irctc_SignUp log=new Irctc_SignUp(driver);
		log.signup();
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
