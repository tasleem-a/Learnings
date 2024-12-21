package WeekendPrograms;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Read_Write_Excel {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream(
                "C:\\Users\\asus\\IdeaProjects\\AppiumBegin\\src\\Data\\CalculatorDC.xlsx");
        Workbook book= WorkbookFactory.create(fis);
        Sheet sh1 = book.getSheet("Sheet1");
        int sh1LastRowNum=sh1.getLastRowNum();
        for(int r=1;r<=sh1LastRowNum;r++){
            for(int c=0;c<=1;c++){
                Row row = sh1.getRow(r);
                Cell cell = row.getCell(c);
                String value = cell.getStringCellValue();
                System.out.print(value);
                System.out.print("     ");
            }
            System.out.println();
        }
        fis.close();
        FileOutputStream fos=new FileOutputStream(
                "C:\\Users\\asus\\IdeaProjects\\AppiumBegin\\src\\Data\\CalculatorDC.xlsx");
        Sheet sh2 = book.getSheet("Sheet2");
        Row r2=sh2.getRow(1);
        Cell c2=r2.createCell(1);
        c2.setCellValue("Updated in excel:PASS");
        book.write(fos);
        fos.close();
        book.close();
    }
}
