package seleniumclassassignments;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffcount {

ChromeDriver driver;
@Before
public void browseropen()
{
	driver=new ChromeDriver();
	
}
@Test
public void Test()


		{
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	WebElement button=driver.findElement(By.xpath("//input[@id='Register']"));
			String  buttontext = button.getAttribute("value");
			if(buttontext.equals("Create my account >>"))
					{
	System.out.println("Test on registration: Pass");
		}
else
{
	System.out.println("Test on registration :Fail");
}

}
}
