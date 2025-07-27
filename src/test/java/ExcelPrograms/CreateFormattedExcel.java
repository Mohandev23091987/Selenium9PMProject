package ExcelPrograms;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;

public class CreateFormattedExcel {
    public static void main(String[] args) throws Exception {

        //create excel
        //first row - style objec
        // first ID anem email - apply style
        //from second row store data -
        //save excel


        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Users");

        String[] headers = { "ID", "Name", "Email" };

        Row headerRow = sheet.createRow(0);

        // Apply bold font
        CellStyle style = workbook.createCellStyle();
        Font font = workbook.createFont();
        font.setBold(true);
        style.setFont(font);

        for (int i = 0; i < headers.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headers[i]);
            cell.setCellStyle(style);
        }

        // Add some data rows
        for (int i = 1; i <= 3; i++) {
            Row row = sheet.createRow(i);
            row.createCell(0).setCellValue(i);
            row.createCell(1).setCellValue("User" + i);
            row.createCell(2).setCellValue("user" + i + "@example.com");
        }

        FileOutputStream fos = new FileOutputStream("UserData.xlsx");
        workbook.write(fos);
        workbook.close();
        fos.close();
    }
}
