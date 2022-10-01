package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_class {
	public static String path="C:\\Users\\Aadishma\\Documents\\Aparna_Velocity\\TEST_Screenshot\\test- ";
	public WebDriver driver;
	
	public static void captureScreenshot(WebDriver driver,int testID) throws IOException
	{
        Date d=new Date();
        String dtm =d.toString().replace(' ','-').replace(':', '-')+".jpg";
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest=new File(path +" "+testID+" " + dtm);
	    FileHandler.copy(src, dest);
	
	}
	
	public static String getDatafromExcel(String sheet,int a,int b) throws EncryptedDocumentException, IOException
	{
		String data;
		String path="C:\\Users\\Aadishma\\Desktop\\Book1.xlsx";
		FileInputStream file=new FileInputStream(path);
		Workbook workbk=WorkbookFactory.create(file);
		
		try
		{
			data=workbk.getSheet(sheet).getRow(a).getCell(b).getStringCellValue();
			
		}
		catch(Exception e)
		{
			double output=workbk.getSheet(sheet).getRow(a).getCell(b).getNumericCellValue();
			data=Double.toString(output);
		}
		
		return data;
		
	}
}
