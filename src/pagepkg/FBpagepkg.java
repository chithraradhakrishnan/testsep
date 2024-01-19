package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBpagepkg {
	WebDriver driver;
	By fbemail=By.name("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
		
public FBpagepkg(WebDriver driver)
{
	this.driver=driver;
}
public void setvalues(String email,String password)
{
	driver.findElement(fbemail).clear();
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpassword).clear();
	driver.findElement(fbpassword).sendKeys(password);
}
public void login()
{
	driver.findElement(fblogin).click();
}


}
