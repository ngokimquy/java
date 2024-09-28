package org.example.quanlynhanvien;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.quanlyphuongtien.OTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GiaoDienQuanLySinhVien {
   public String noidungGiaoDienChinh =
           "1. Them nhan vien " + "\n"
            + "2. import danh sach nhan vien  " +"\n"

            + "3. ket thuc chuong trinh " + "\n"
   + "4. sap xep theo ten  " +"\n";
   public    QuanLyNhanVien quanLyNhanVien;
   public GiaoDienQuanLySinhVien() {
         quanLyNhanVien = new QuanLyNhanVien();
    }
    public void giaodienChinh()
    {
        boolean flag = true;
        while (flag)
        {System.out.println(noidungGiaoDienChinh);
            Scanner sc = new Scanner(System.in);
            String luachon = sc.nextLine();
            switch (luachon)
            {
                case "1": hienthiListNhanVien();break;
                case  "2": importNhanVien();break;
                case "3": {
                    System.out.println("ban da lua chon 3");
                    flag = false;
                };
                break;
                case "4": sapxepTheoTen();break;
                default: break;
            }

        }

    }

        public void  sapxepTheoTen()
        {
            Collections.sort(quanLyNhanVien.listNhanVien, new Comparator<NhanVien>() {
                @Override
                public int compare(NhanVien o1, NhanVien o2) {
                    return o2.namSinh.compareTo(o1.namSinh);
                }
            });

            System.out.println(quanLyNhanVien.getString());






        }

    public  void  test()
    {
        QuanLyNhanVien quanlyNhanVien = new QuanLyNhanVien();
        NhanVien nhanvien = new NhanVien();
        nhanvien.maDinhDanh ="alsdfadsfj";
        nhanvien.hoTen = "ngo kim quy";
        nhanvien.namSinh = 1993;
        nhanvien.heSoLuong = 4.4;
        quanlyNhanVien.themNhanVien(nhanvien);
        quanlyNhanVien.themNhanVien(nhanvien);
        System.out.println(quanlyNhanVien.getString());
    }
    public  void  hienthiListNhanVien()
    {
        System.out.println(quanLyNhanVien.getString());
    }
    public  void importNhanVien()
    {
        NhanVien nhanvien;



        try {

            // Đường dẫn đến file Excel
            FileInputStream file = new FileInputStream(new File("src/main/java/org/people.xlsx"));

            // Tạo Workbook từ file Excel
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            // Lấy sheet đầu tiên trong workbook
            XSSFSheet sheet = workbook.getSheetAt(6);
            boolean flag = true;
            // Duyệt qua các hàng trong sheet
            for (Row row : sheet) {
                nhanvien = new NhanVien();
                if (flag)
                {
                    flag = false;
                    continue;
                }
                nhanvien.maDinhDanh = convertString(row.getCell(0));
                nhanvien.hoTen = convertString(row.getCell(1));
                nhanvien.namSinh = (int)Double.parseDouble(convertString(row.getCell(2)));
                nhanvien.heSoLuong = Double.parseDouble(convertString(row.getCell(3)));
                nhanvien.luong = nhanvien.tinhLuong();
                quanLyNhanVien.themNhanVien(nhanvien);


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
