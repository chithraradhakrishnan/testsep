package seleniumclassassignments;
import org.junit.Before;
	import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Rediffradioboolean  {
		ChromeDriver driver;
		@Before
		public void browseropen()
		{
			driver=new ChromeDriver();
			driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		}
		@Test
		public void Display()
		{

Boolean b1=driver.findElement( By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
if(b1)
{
	System.out.println("selected");
}
else
{
	System.out.println("not selected");
}
Boolean b2=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
if(b2)
{
	System.out.println("displayed");
}
else
{
	System.out.println("not displayed");
}
Boolean b3=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
if(b3)
{
	System.out.println("selected");
}
else
{
	System.out.println("not selected");
}

		}
}