package ExcelPrograms;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelData2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\sures\\OneDrive\\Desktop\\Excel\\TestData2.xlsx");
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("TestData");

//        for(Row row:sheet){
//            for(Cell cell: row){
//                System.out.println(cell);
//            }

        int lastRowNum = sheet.getLastRowNum();
        System.out.println(lastRowNum);

        for(int i=0;i<=lastRowNum;i++){
            Row row = sheet.getRow(i);
            for(int j=0;j<row.getLastCellNum();j++){
                Cell cell = row.getCell(j);
                System.out.println(cell.toString());
            }
        }


        for(int i=0;i<=lastRowNum;i++){
            for(int j=0;j<sheet.getRow(i).getLastCellNum();j++){
                System.out.println(sheet.getRow(i).getCell(j).toString());
            }
        }


    }
}
