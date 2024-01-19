package testngassignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rishiherbal {
	WebDriver driver;
	@BeforeTest
	public void test()
	{
		driver=new ChromeDriver();
	}
@BeforeMethod
public void urlloading()
{
driver.get("https://rishiherbalindia.linker.store/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

}
@Test
public void main() 
{
	//Registration
	/*driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("chithraradhakrishnan0721@gmail");
	driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Janavjay09");
	driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
	driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();*/
//login
	
driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input")).sendKeys("chithraradhakrishnan0721@gmail.com");
driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Janavjay09");
driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
String actualurl=driver.getCurrentUrl();
System.out.println(actualurl);

String expurl="https://rishiherbalindia.linker.store/";
		if(expurl.equals(actualurl))
		{
			System.out.println("login successful");
			
		}
		else
		{
			System.out.println("login failed");
		}

driver.navigate().refresh();
driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal Agro Growth Booster");
driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i")).click();
driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();


driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/div[2]/ul/li[4]/a")).click();
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,250)","");


WebElement aloe= driver.findElement(By.xpath(" //*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img"));
Actions act1=new Actions(driver);
act1.moveToElement(aloe).perform();


driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button/span")).click();
driver.findElement(By.xpath("//*[@id=\"showMesg\"]/a/strong")).click();

driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();

driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();

	
}
}