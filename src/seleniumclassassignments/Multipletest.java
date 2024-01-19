package seleniumclassassignments;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipletest {
	
		ChromeDriver driver;
	@Before
	public void browseopen()
	{
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
	}
@Test
public void Test()
{
	driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
	
	Alert a= driver.switchTo().alert();
	String actualtext=a.getText();
	if(actualtext.equals("You clicked a button"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
}
}
@Test

public void Test1()
{
	driver.manage().window().maximize();
	driver.navigate().refresh();
driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();

	Alert b= driver.switchTo().alert();
	String actualtext1=b.getText();
	if(actualtext1.equals("Do you confirm action?"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
}

}
@After
public void close()
{
	System.out.println("browserclose");
}
}
