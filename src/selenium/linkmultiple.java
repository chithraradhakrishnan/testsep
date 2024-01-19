package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkmultiple {
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
	
	}
	@Test
	public void Buttonverify()
	
	{
		driver.get("file:///D:/display.html");
	driver.findElement(By.xpath("/html/body/input[1]"))	.click();
			//driver.switchTo().alert().accept();
			Alert a= driver.switchTo().alert();
			String actualtext=a.getText();
			if(actualtext.equals("Hello!I am an alert box!!"))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
	}
a.accept();
driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("123");
}
}