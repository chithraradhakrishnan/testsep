package testng;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
import java.awt.datatransfer.StringSelection;

public class Robotclassss {
	WebDriver driver;
	@BeforeTest
	public void test()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
@BeforeMethod
public void urlloading()
{
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	
}
@Test
public void test1() throws Exception
{
driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
fileUpload("D:\\ldc22.pdf");
}
public void fileUpload(String p) throws AWTException

{
	
	//to copy path to clipboard
	StringSelection strSelection=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
	
	
	//to paste into sysmwindow
	Robot robot=new Robot();
	robot.delay(3000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);

	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	//Thread.sleep(5000);
	robot.keyRelease(KeyEvent.VK_ENTER);

	
	
}
}