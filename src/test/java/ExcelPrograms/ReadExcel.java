package ExcelPrograms;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;

public class ReadExcel {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\sures\\OneDrive\\Desktop\\Excel\\TestData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("TestData");
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println("*****************************************************");
        System.out.println("Cell value: " + cell.getStringCellValue());

        workbook.close();
        fis.close();
    }
}

