package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingdataINExcel {
	public static void main(String[] args) throws IOException {
		FileOutputStream file =new FileOutputStream("C:\\\\Users\\\\Ajay Pratap\\\\eclipse-workspace\\\\khelo_automation\\\\testData\\\\WritingExcel.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
			XSSFSheet Sheet = workbook.createSheet("Data");
			XSSFRow row1 = Sheet.createRow(0);
			row1.createCell(0).setCellValue("Java");
			row1.createCell(1).setCellValue("Manual");
			row1.createCell(2).setCellValue("SQL");
			row1.createCell(3).setCellValue("Automation");
			XSSFRow row2 = Sheet.createRow(1);
			row2.createCell(0).setCellValue("HTML");
			row2.createCell(1).setCellValue("backend");
			row2.createCell(2).setCellValue("ksj");
			row2.createCell(3).setCellValue("Shopyfy");
				
			XSSFRow row3 = Sheet.createRow(2);
			row3.createCell(0).setCellValue("CSS");
			row3.createCell(1).setCellValue("c#");
			row3.createCell(2).setCellValue("JavaScript");
			row3.createCell(3).setCellValue("Springboot");
			
			workbook.write(file);
				System.out.println("File is created");
		
	}
}
