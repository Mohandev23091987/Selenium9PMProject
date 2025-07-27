package ExcelPrograms;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;

public class ReadAllData {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\sures\\OneDrive\\Desktop\\Excel\\TestData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("TestData");

        DataFormatter formatter = new DataFormatter();  // Handles all data types

        for (Row row : sheet) {
            for (Cell cell : row) {
                String value = formatter.formatCellValue(cell);
                System.out.print(value + " | ");
            }
            System.out.println();
        }

        workbook.close();
        fis.close();
    }
}

