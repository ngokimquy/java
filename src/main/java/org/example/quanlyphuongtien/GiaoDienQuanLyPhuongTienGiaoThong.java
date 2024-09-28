package org.example.quanlyphuongtien;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.useful.ReadFileExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Inet4Address;
import java.util.Scanner;

public class GiaoDienQuanLyPhuongTienGiaoThong {
    QuanLyOto quanLyOto = new QuanLyOto();
    Scanner sc = new Scanner(System.in);

    String chuoiGiaoDienChinh = "1. Nhap thong tin Oto\n" +
            "2. Hien thi danh sach oto\n" +
            "3. Import Data Oto\n" +
            "4. Ket Thuc "
            ;

    public  void  giaodienChinh()
    {
        boolean flag = true;
        while (flag)
        {

            System.out.println(chuoiGiaoDienChinh);
            String inputString;
            inputString = sc.nextLine();

            switch (inputString)
            {
                case  "1": giaodienThemOto();break;
                case  "2": giaodienListOto();break;
                case  "3": giaodienImportOto();break;
                case  "4": flag = false; break;

            }

        }

    }


    public  void giaodienThemOto()
    {
        OTo oto = new OTo();
        String inputString;
        System.out.println("vui long nhap thong tin xe:");

        System.out.println("1. Nhap hang san xuat: ");
        inputString = sc.nextLine();
        oto.hangSanXuat  = inputString;
        System.out.println("2. Nhap ten phuong tien:");
        inputString = sc.nextLine();
        oto.tenPhuongTien = inputString;
        System.out.println("3. Nhap nam san xuat:");
        inputString = sc.nextLine();
        oto.namSanXuat = Integer.parseInt(inputString);

        System.out.println("4. Nhap van toc toi da:");
        inputString = sc.nextLine();
        oto.vantocToiDa = Double.parseDouble(inputString);
        System.out.println("5. Nhap so choi ngoi:");
        inputString = sc.nextLine();
        oto.soChoNgoi = Integer.parseInt(inputString);
        System.out.println("6. Nhap loai dong co:");
        inputString = sc.nextLine();
        oto.kieuDongCo = inputString;

        quanLyOto.themOto(oto);
        System.out.println("O To da nhap thanh cong");



    }

    public  void giaodienListOto()
    {

        System.out.println(quanLyOto.dataListOto());

    }
    public  void giaodienImportOto()
    {
            OTo oto;



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
                oto = new OTo();
                if (flag)
                {
                    flag = false;
                    continue;
                }

                        oto.hangSanXuat = convertString(row.getCell(0));
                        oto.tenPhuongTien = convertString(row.getCell(1));
                        oto.namSanXuat = (int)Double.parseDouble(convertString(row.getCell(2)));
                        oto.vantocToiDa = Double.parseDouble(convertString(row.getCell(3)));
                        oto.soChoNgoi = (int)Double.parseDouble(convertString(row.getCell(4)));
                        oto.kieuDongCo = convertString(row.getCell(5));
                        quanLyOto.themOto(oto);







            }
        System.out.println("da hoan thanh");
            // Đóng file và workbook
            workbook.close();
            file.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }





    }

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


}
