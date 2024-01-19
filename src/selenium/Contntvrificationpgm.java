package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Contntvrificationpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String content=driver.getPageSource();
		if(content.contains("Gmail"))
				{
			System.out.println("pass");
				}
		else
		{
		System.out.println("fail");
		}
	}

}
