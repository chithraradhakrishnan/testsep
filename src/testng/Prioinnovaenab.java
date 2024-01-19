package testng;import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Prioinnovaenab {
@BeforeTest
public void browseopen()
{
	System.out.println("browseopen");
}
@BeforeMethod()
public void urlopen()
{
	System.out.println("urlopen");
}
@Test (priority=3,dependsOnMethods= {"test3"})
public void test1()
{
System.out.println("test1");
}

@Test(priority=2,invocationCount=2,enabled=false)
public void test2()
{
	System.out.println("test2");
}
@Test(priority=1)
public void test3()
{
	System.out.println("test3");
}
@AfterMethod
public void report()
{
	System.out.println("report");
}
@AfterTest
public void browseclose()
{
System.out.println("browseclose");	
}
}









