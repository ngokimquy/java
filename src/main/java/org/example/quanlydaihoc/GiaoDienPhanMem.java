package org.example.quanlydaihoc;

import java.util.Scanner;

public class GiaoDienPhanMem {

    QuanLySinhVien quanLySinhVien = new QuanLySinhVien();

    public void giaodienChinh()
    {

        System.out.println("chao mung ban den voi phan mem quan ly sinh vien dai hoc");
        System.out.println("vui long chon cac tinh nang sau:");
        System.out.println("***************** **************** *************");
        System.out.println("1. Quan ly Sinh Vien");
        System.out.println("2. Thoat khoi chuong trinh");


        System.out.println("******************** ****************** **************");

        Scanner scanner = new Scanner(System.in);
        // Yêu cầu người dùng nhập một chuỗi
        System.out.print("Lua chon tinh nang: ");
        String inputString = scanner.nextLine(); // Đọc toàn bộ chuỗi


        switch (inputString)
        {
            case  "1" : giaodienQuanLySinhVien();break;
            case  "2" : System.out.println("thoat khoi chuong trinh"); break;
            default: System.out.println("vui long chon trong danh sach lua chon");
        }

        System.out.println("chuong trinh da dong xin hen lai lan sau");
        // Đóng Scanner


    }


    public void giaodienQuanLySinhVien()
    {
        System.out.println("chao mung ban den voi quan ly sinh vien:");
        System.out.println("1. Them sinh vien vao danh sach sinh vien");
        System.out.println("2. Xoa sinh vien ra khoi danh sach");
        System.out.println("3. Hien thi danh sach sinh vien hien tai");
        System.out.println("4. Nhap diem cho sinh vien thong qua ID sinh vien");
        System.out.println("5. Hien thi diem sinh vien thong qua ID sinh vien");
        System.out.println("e: de thoat ve chuong trinh chinh");

        System.out.print("Lua chon tinh nang: ");

        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine(); // Đọc toàn bộ chuỗi
        switch (inputString)
        {
            case "1" : System.out.println("ban da chon phuong an 1");
                        giaodienThemSinhVien();
                        giaodienQuanLySinhVien();
                        break;
            case "2" : System.out.println("ban da chon phuong an 2");
                giaodienXoaSinhVien();
                giaodienQuanLySinhVien();
                break;
            case "3" : System.out.println("ban da chon phuong an 3");
                giaodienHienThiDanhSachSinhvien();
                giaodienQuanLySinhVien();
                break;
            case "4" : System.out.println("ban da chon phuong an 4");
                giaodienNhapDiemSinhVien();
                giaodienQuanLySinhVien();
                break;
            case "5" : System.out.println("ban da chon phuong an 4");
                giaodienHienThiDiem();
                giaodienQuanLySinhVien();
                break;
            case "e": giaodienChinh(); break;

            default: System.out.println("ban da chon ngoai phuong an");

        }
    }

    public  void giaodienThemSinhVien()
    {
        Scanner scanner = new Scanner(System.in);
        String inputString = "";
        Student sv = new Student();

         System.out.println("vui long nhap  ten sinh vien:");
         inputString = scanner.nextLine();
         sv.name = inputString;
         System.out.println("vui long nhap id sinh vien");
         inputString = scanner.nextLine();
         sv.id = inputString;

         this.quanLySinhVien.themStudent(sv);
         System.out.println("da thuc hien xong");
        System.out.println("***************** **************** *************");


    }

    public  void giaodienXoaSinhVien()
    {
        System.out.println("vui long nhap id sinh vien: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = "";
        inputString = scanner.nextLine();

        boolean flag = true;
        for (Student a: quanLySinhVien.studentsList)
        {
            if (inputString.equals(a.id))
            {

                quanLySinhVien.xoaStudent(a);
                System.out.println("chung toi da xoa thong tin cua sinh vien: ");
                flag = false;

            }


        }

        if (flag)
            System.out.println("thong tin cung cap ko co:");
        System.out.println("***************** **************** *************");

    }

    public  void giaodienHienThiDanhSachSinhvien()
    {
        System.out.println(quanLySinhVien.hienthiDanhSachSinhVien());
    }

    public  void giaodienNhapDiemSinhVien(){


        System.out.println("vui long nhap id sinh vien: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = "";
        inputString = scanner.nextLine();

        boolean flag = true;
        for (Student a: quanLySinhVien.studentsList)
        {
            if (inputString.equals(a.id))
            {


                System.out.println("chung toi da xoa thong tin cua sinh vien: ");
                MonHoc mh = new MonHoc();

                System.out.println("vui long nhap thong tin id mon hoc:");
                inputString = scanner.nextLine();

                mh.id    = inputString  ;
                System.out.println("vui long nhap thong tin ten mon hoc");
                inputString = scanner.nextLine();
                mh.ten = inputString;
                System.out.println("vui long nhap thong tin diem mon hoc");
                inputString = scanner.nextLine();
                mh.diem = Double.parseDouble(inputString);

                a.grades.add(mh);




                flag = false;

            }


        }

        if (flag)
            System.out.println("thong tin cung cap ko co:");
        System.out.println("***************** **************** *************");



    }

    public  void giaodienHienThiDiem()
    {
        System.out.println(this.quanLySinhVien.hienthiFullDanhSachSinhVien());

    }



}
