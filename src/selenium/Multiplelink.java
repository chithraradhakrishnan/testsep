package selenium;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.net.URL;
import java.net.HttpURLConnection;

import org.openqa.selenium.chrome.ChromeDriver;



public class Multiplelink {
	ChromeDriver driver;
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public  void link_valid()
	{
		driver.manage().window().maximize();
		
	List<WebElement>li=driver.findElements(By.tagName("a"));
	System.out.println("total no of links="+li.size());
	for(WebElement s:li)
	{
		String link=s.getAttribute("href");
		verify(link);
		//String text=s.getText();
		//System.out.println(link+"----"+text);
		//verify (link,text);
		
	}
	
	}

	private void verify(String link)
	{
		try
		{
			
			URL ob=new URL(link);
			
			HttpURLConnection con=(HttpURLConnection)ob.openConnection();
			//HttpUrlConnection con=(HttpURLConnection)ob.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("valid---"+link);
			}

			else if(con.getResponseCode()==404)
			{
				System.out.println("broken link---"+link);
			}
		}

		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}
	}
	


