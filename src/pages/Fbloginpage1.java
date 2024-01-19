package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage1 {
	WebDriver driver;
	By createapage =By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By busget =By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");

		
public Fbloginpage1 (WebDriver driver)
{
	this.driver=driver;
}

public void click()
{
	driver.findElement(createapage).click();
	driver.findElement(busget).click();
	

	
}
}



