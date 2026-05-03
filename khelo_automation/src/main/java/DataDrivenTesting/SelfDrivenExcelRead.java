package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//Excel File-- workbook---sheets--row--- cell
public class SelfDrivenExcelRead {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Ajay Pratap\\eclipse-workspace\\khelo_automation\\testData\\DataDriven2.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
       XSSFSheet sheet = workBook.getSheet("Singh");
       		int RowCount = sheet.getLastRowNum();
       		int cellCount = sheet.getRow(1).getLastCellNum();
       		
       		System.out.println("Row count is : "+ RowCount);
       		System.out.println("Cell count : "+ cellCount);
       		for(int i=0; i<= RowCount; i++) {
       			XSSFRow row = sheet.getRow(i);
       			
       			for(int j =0;j<cellCount; j++) {
       				XSSFCell cell = row.getCell(j);
       				System.out.print(cell.toString()+"    ");
       			}
       			System.out.println();
       		}
	}

}
