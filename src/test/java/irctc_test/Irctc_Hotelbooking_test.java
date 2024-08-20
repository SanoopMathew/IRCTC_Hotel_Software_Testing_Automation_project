package irctc_test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import irctc_page.Irctc_Hotelbooking;

public class Irctc_Hotelbooking_test extends Irctc_baseclass
{
	@Test
	public void test2() throws InterruptedException
	{
		Irctc_Hotelbooking book=new Irctc_Hotelbooking(driver);
		book.booking();						
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
