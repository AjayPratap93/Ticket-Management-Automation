package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Second_Excel_Writing {
public static void main(String[] args) throws IOException {
	FileOutputStream file =new FileOutputStream("C:\\\\Users\\\\Ajay Pratap\\\\eclipse-workspace\\\\khelo_automation\\\\testData\\\\WritingDynamic.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet Sheet = workbook.createSheet("Data");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many  cell");
		int row=sc.nextInt();
		
		System.out.println("Enter how many  cell");
		int cell=sc.nextInt();
		
		
		for(int i=0; i<=row; i++) {
			
			XSSFRow currentRow = Sheet.createRow(i);
			for(int j=0; j<=cell; j++ ) {
				XSSFCell cell1= currentRow.createCell(j);
				 cell1.setCellValue(sc.next());
				 
			}
		}
	
		workbook.write(file);
		System.out.println("File created succesful ");
		
		
}
}
