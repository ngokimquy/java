package org.example.quanlynhanvien;

import java.util.ArrayList;

public class QuanLyNhanVien {
    public ArrayList<NhanVien> listNhanVien;


    public  QuanLyNhanVien()
    {
    listNhanVien = new ArrayList<>();

    }
    public  void  themNhanVien(NhanVien nhanvien){
        listNhanVien.add(nhanvien);
    }
    public void xoaNhanVien(NhanVien nhanvien) {
        listNhanVien.remove(nhanvien);
    }
    public void xapsepNhanVienTheoTen()
    {


    }

    public String getString(){

        String  kq = "";
        for (NhanVien a:listNhanVien)
        {
            kq = kq + a.getString();
        }
        return  kq;

    }


}
