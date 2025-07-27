package ExcelPrograms;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;

public class WriteMultiple {
    public static void main(String[] args) throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Employees");

        for (int i = 0; i < 5; i++) {
            Row row = sheet.createRow(i);
            for (int j = 0; j < 3; j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue("R" + i + "C" + j);
            }
        }

        FileOutputStream fos = new FileOutputStream("Employees.xlsx");
        workbook.write(fos);
        workbook.close();
        fos.close();
    }
}

