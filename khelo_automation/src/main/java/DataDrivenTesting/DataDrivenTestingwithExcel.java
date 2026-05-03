package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File-- workbook---sheets--row--- cell
public class DataDrivenTestingwithExcel {
	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\Ajay Pratap\\eclipse-workspace\\khelo_automation\\testData\\DataDriven.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int totalrow = sheet.getLastRowNum();
		int totalCell = sheet.getRow(1).getLastCellNum();
		//System.out.println("number of rows " + totalrow);
		//System.out.println("number of cell " + totalCell);
		for (int i = 0; i <= totalrow; i++) {
			XSSFRow currentRow = sheet.getRow(i);
			for (int j = 0; j < totalCell; j++) {
				XSSFCell currentCell = currentRow.getCell(j);
				System.out.print(currentCell.toString()+"   ");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();

	}

}
