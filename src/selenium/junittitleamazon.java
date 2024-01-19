package selenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class  junittitleamazon 
 {
	
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
	driver=new ChromeDriver();
	driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjcu8eX3PeCAxU3E3sHHdF3D_oYABAAGgJ0bQ&ase=2&gclid=EAIaIQobChMI3LvHl9z3ggMVNxN7Bx3Rdw_6EAAYASAAEgKm6vD_BwE&ohost=www.google.com&cid=CAASJeRo4zXehLx1R-CICjjJj4Ud5adI3Hzye9RNOjU_8MrzmFlCKe8&sig=AOD64_26V1H6Hir33Qstcq2uhinDXJh7Og&q&nis=4&adurl&ved=2ahUKEwiCwMGX3PeCAxW11zQHHULLBTQQ0Qx6BAgFEAE");
	}
	
	@Test
	public void test()
	{
		String actualtitle =driver.getTitle();
		System.out.println(actualtitle);
		String exp="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
			
		if(actualtitle.equals(exp))
		{
			
			System.out.println("pass");
				}
			else
			{
			System.out.println("fail");
			}
	}

	@After
	public void browserclose()
	{
		driver.quit();
	}


}




