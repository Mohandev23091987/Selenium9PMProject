package ExcelPrograms;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.*;

public class UpdateExcel {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("Employees.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Employees");

        Row row = sheet.getRow(1);
        Cell cell = row.getCell(1);
        cell.setCellValue("Updated");

        FileOutputStream fos = new FileOutputStream("Employees.xlsx");
        workbook.write(fos);

        workbook.close();
        fis.close();
        fos.close();
    }
}
