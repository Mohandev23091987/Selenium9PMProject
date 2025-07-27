package ExcelPrograms;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DeleteRow {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("Employees.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Employees");

        int rowIndex = 2;
        Row rowToRemove = sheet.getRow(rowIndex);
        if (rowToRemove != null) {
            sheet.removeRow(rowToRemove);
        }

        FileOutputStream fos = new FileOutputStream("Employees.xlsx");
        workbook.write(fos);
        workbook.close();
        fis.close();
        fos.close();
    }
}
