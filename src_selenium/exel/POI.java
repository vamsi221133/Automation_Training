package exel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class POI {
	static void poi() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\training\\Documents\\selenium\\XLFiles\\Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowc = ws.getLastRowNum();
		System.out.println("first row number "+ws.getFirstRowNum());
		System.out.println("total number of rows are : "+rowc);
		
		int colmn = ws.getRow(1).getLastCellNum();
		
		System.out.println("total number of columns are"+colmn);
		
		for (int i = 0 ; i <= rowc  ; i++)
		{
			for (int j = 0 ; j<colmn ; j++)
			{
				XSSFCell username = ws.getRow(i).getCell(j);
				System.out.println(username.toString());
//				for (int k = 1 ; k < colmn ; k++) 
//					{
//						XSSFCell password = ws.getRow(i).getCell(k);
//						System.out.println("password is "+password.toString()); 
//			}
	}
	}
	}
	static void fillow() throws FilloException {
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection("C:\\Users\\training\\Documents\\selenium\\XLFiles\\Book1.xlsx");
		String strQuary = "Select * from Sheet1";
		Recordset rc = connection.executeQuery(strQuary);
		while(rc.next()) {
			System.out.println(rc.getField("username"));
			String st = rc.getField("username");
			System.out.println(rc.getField("password"));
			
		}
	}
	public static void main(String[] args) throws FilloException, IOException{
		
//		poi();
		fillow();

	
	}
}