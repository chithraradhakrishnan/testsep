package seleniumclassassignments;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebookdobcount  {
	ChromeDriver driver;
@Before
public void browseropen()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
}
@Test
public void Test()
{
driver.manage().window().maximize();
WebElement dayelement=driver.findElement(By.xpath("//*[@id='day']"));
Select D=new Select(dayelement);
D.selectByValue("7");
D.getOptions();
List<WebElement>li=D.getOptions();
System.out.println("link count" +li.size());

WebElement Month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
Select M=new Select(Month);
M.selectByIndex(02);
M.getOptions();
List<WebElement>li1=M.getOptions();
System.out.println("link count" +li1.size());

WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
Select Y=new Select(year);
Y.selectByVisibleText("2021");
Y.getOptions();
List<WebElement>li2=Y.getOptions();
System.out.println("link count" +li2.size());


}
}




