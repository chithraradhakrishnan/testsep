package testngassignment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Saucedemodr {
	WebDriver driver;
@BeforeTest
public void test()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void url()
{
driver.get("https://www.saucedemo.com/");
}
@Test

	public void main() throws IOException
	{
		
		File f=new File("D://sauce.xlsx");
		FileInputStream fi=new FileInputStream(f);
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String Username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username=" +Username);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(pswd);
			
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(Username);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pswd);
			driver.findElement(By.name("login-button")).click();

		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		
		String expurl="https://www.saucedemo.com/inventory.html";
				if(expurl.equals(actualurl))
				{
					System.out.println("login successful");
					
				}
				else
				{
					System.out.println("login failed");
				}
		
		}
		




	}
	}



