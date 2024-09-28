package org.example.useful;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileExcel {

    public String convertString(Cell cell) {
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:

                    // Chuyển đổi số thành chuỗi
                    return String.valueOf(cell.getNumericCellValue());

            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                // Nếu ô chứa công thức, bạn cũng có thể lấy giá trị tính toán của công thức
                return cell.getCellFormula();
            case BLANK:
                return "";
            default:
                return "Không xác định";
        }
    }


    public  void readFileExcel ()
    {
        try {
            // Đường dẫn đến file Excel
            FileInputStream file = new FileInputStream(new File("src/main/java/org/people.xlsx"));

            // Tạo Workbook từ file Excel
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            // Lấy sheet đầu tiên trong workbook
            XSSFSheet sheet = workbook.getSheetAt(5);
            boolean flag = true;
            // Duyệt qua các hàng trong sheet
            for (Row row : sheet) {
               if (flag)
               {
                   flag = false;
                   continue;
               }
                String a = convertString(row.getCell(0));
                System.out.print(a);
                String a1 = convertString(row.getCell(1));
                System.out.print(a1);

                Double b = Double.parseDouble(convertString(row.getCell(2)));
                System.out.print(b);
                Double b1 = Double.parseDouble(convertString(row.getCell(3)));
                System.out.print(b1);
                Double b2 = Double.parseDouble(convertString(row.getCell(4)));
                System.out.print(b2);

                String c = convertString(row.getCell(5));
                System.out.print(c);

                System.out.println();
                    /*if (flag)
                    {
                        flag = false;
                        continue;
                    }

                    String a = row.getCell(0).getStringCellValue();
                    System.out.println(a);
                    String a1 = row.getCell(1).getStringCellValue();
                    System.out.println(a1);
                    Double b = row.getCell(2).getNumericCellValue();
                    System.out.println(b);
                Double b1 = row.getCell(3).getNumericCellValue();
                System.out.println(b);
                Double b2 = row.getCell(4).getNumericCellValue();
                System.out.println(b);
                String c = row.getCell(5).getStringCellValue();
                System.out.println(c);

*/

            }

            // Đóng file và workbook
            workbook.close();
            file.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }


    }






}
