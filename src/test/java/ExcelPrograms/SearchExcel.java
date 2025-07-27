package ExcelPrograms;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class SearchExcel {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("Employees.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Employees");

        String searchValue = "R2C1";  // Value to search
        boolean found = false;

        DataFormatter formatter = new DataFormatter();

        for (Row row : sheet) {
            for (Cell cell : row) {
                if (formatter.formatCellValue(cell).equals(searchValue)) {
                    System.out.println("Found at Row: " + row.getRowNum() + ", Column: " + cell.getColumnIndex());
                    found = true;
                }
            }
        }

        if (!found) System.out.println("Value not found.");
        workbook.close();
        fis.close();
    }
}

