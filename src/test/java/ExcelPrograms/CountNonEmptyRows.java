package ExcelPrograms;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class CountNonEmptyRows {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("UserData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Users");

        int nonEmptyRows = 0;

        for (Row row : sheet) {
            if (row != null && row.getCell(0) != null &&
                    !row.getCell(0).toString().trim().equals("")) {
                nonEmptyRows++;
            }
        }


        System.out.println("Non-empty row count: " + nonEmptyRows);

        workbook.close();
        fis.close();
    }
}

