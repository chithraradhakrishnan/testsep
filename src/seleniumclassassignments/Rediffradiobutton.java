package seleniumclassassignments;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffradiobutton {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void Test()
	{
	driver.manage().window().maximize();
	String actualtitle=driver.getTitle();
	System.out.println(actualtitle);
	String exp= "Rediffmail Free Unlimited Storage";
	if(actualtitle.equals(exp))
			{
		System.out.println("rediff logo is displayed");
			}
	else
	{
		System.out.println("rediff logo can not displayed");
	}
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[1]")).click();
List<WebElement>r=driver.findElements(By.name( "gender965c84a7"));
for(WebElement e:r)
{
	if(e.getAttribute("value").equalsIgnoreCase("m"))
	{
	e.click();
	
	}
}

	}	

}
