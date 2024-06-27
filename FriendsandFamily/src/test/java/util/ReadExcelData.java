package util;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcelData {

	public static void main(String[] args) throws Exception  {
		//Get the path of excel file
				FileInputStream fis=new FileInputStream("./data/readexcel.xlsx");
				Workbook wb=WorkbookFactory.create(fis);
				//From sheet we can get the row
				int row =wb.getSheet("Sheet1").getLastRowNum();
				int cell = wb.getSheet("Sheet1").getRow(row).getLastCellNum();
				for (int i = 1; i <= row; i++) {
					for (int j = 0; j < cell; j++) {
						String data = wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
						System.out.println(data);
					}
					System.out.println(" ");
				}
	}
}
