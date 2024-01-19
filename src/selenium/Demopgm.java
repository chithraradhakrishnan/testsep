package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demopgm {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
String actualtitle=driver.getTitle();
System.out.println(actualtitle);
String exp="yoogle";
if(actualtitle.equals(exp))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
	}

}
