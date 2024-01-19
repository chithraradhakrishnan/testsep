package selenium;
import java.io.File;
import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;


	public class Screenshot {
		ChromeDriver driver;
		@Before
		public void browseropen()
		{
			driver=new ChromeDriver();
			driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		}
		@Test
		
		public void Test() throws Exception
		{
			//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//FileHandler.copy(src, new File("D://error7.png"));
			
			
	      WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		File src2=dayelement.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src2, new File("./Screenshot//Elementscreenshot2.png"));
	}






}
