package selenium;
import java.net.URL;
import java.net.HttpURLConnection;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Res {
	ChromeDriver driver;
	String baseurl=("http://www.google.com");
	@Before
	public void browseopen()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
@Test
public  void linkvalidation ()throws Exception

{
driver.get(baseurl);
URL ob=new URL(baseurl);
HttpURLConnection con=(HttpURLConnection)ob.openConnection();
con.connect();
if(con.getResponseCode()==200)
{
	System.out.println("valid url:" +baseurl);
}
else
{
	System.out.println("Invalid url:" +baseurl);
}
}
}