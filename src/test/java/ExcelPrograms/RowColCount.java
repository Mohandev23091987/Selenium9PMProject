package ExcelPrograms;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;

public class RowColCount {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("Employees.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Employees");

        int rowCount = sheet.getLastRowNum() + 1;
        int colCount = sheet.getRow(0).getLastCellNum();

        System.out.println("Rows: " + rowCount);
        System.out.println("Columns: " + colCount);

        workbook.close();
        fis.close();
    }
}

