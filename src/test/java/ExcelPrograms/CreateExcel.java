package ExcelPrograms;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateExcel {

    public static void main(String[] args) throws IOException {
        // workbook sheet Row Cell
        //XSSFWorbook Sheet ROW Cell


        XSSFWorkbook workbook = new XSSFWorkbook();  // Create workbook
        Sheet sheet = workbook.createSheet("TestData");  // Create sheet
        Row row = sheet.createRow(0);  // Create row
        Cell cell = row.createCell(0);  // Create cell
        cell.setCellValue("Hello Excel!");

        FileOutputStream fos = new FileOutputStream("C:\\Users\\sures\\OneDrive\\Desktop\\Excel\\TestData2.xlsx");
        workbook.write(fos);  // Write data
        workbook.close();
        fos.close();
        System.out.println("Excel written successfully.");
    }
}
