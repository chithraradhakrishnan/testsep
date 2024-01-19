package seleniumclassassignments;import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dateofbirthcount  {
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

WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
Select day=new Select(dayelement);
day.selectByValue("25");
day.getOptions();
List<WebElement>li=day.getOptions();
System.out.println("link count" +li.size());

WebElement Month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
Select M=new Select(Month);
M.selectByIndex(02);
M.getOptions();
List<WebElement>li1=M.getOptions();
System.out.println("link count" +li1.size());

WebElement year=driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[3]"));
Select Y=new Select(year);
Y.selectByVisibleText("1995");
Y.getOptions();
List<WebElement>li2=Y.getOptions();
System.out.println("link count" +li2.size());


}
}





