package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.FBpagepkg;
import utilities.Excelutilities;

public class FBtestpkg extends Baseclass
{
	@Test
	public void verifylogin() throws  Exception
	{
		FBpagepkg ob= new FBpagepkg(driver);
		String xl="D:\\data.xlsx";
		String sheet="Sheet1";
		int rowcount=Excelutilities.getRowCount(xl,sheet);
		for(int i=1;i<=rowcount;i++)
		{
			String username=Excelutilities.getCellValue(xl,sheet,i,0);
			System.out.println("usename : +username");
			String pswd=Excelutilities.getCellValue(xl,sheet,i,1);
			System.out.println("password :"+pswd);
			
			ob.setvalues(username, pswd);
			ob.login();
		}
		
	}

}
