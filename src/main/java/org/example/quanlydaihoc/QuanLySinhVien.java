package org.example.quanlydaihoc;

import java.util.ArrayList;

public class QuanLySinhVien {


    public ArrayList<Student> studentsList;


    public QuanLySinhVien() {
        studentsList = new ArrayList<>();
    }
    public  void themStudent(Student student)
    {
        studentsList.add(student);
    }
    public  void xoaStudent(Student student)
    {
        studentsList.remove(student);
    }

    public  String hienthiDanhSachSinhVien()
    {
        String kq = "";

        for (Student a: studentsList)
        {
            kq = kq + a.hienthiId();
        }

        return  kq;
    }


    public  String hienthiFullDanhSachSinhVien()
    {
        String kq = "";

        for (Student a: studentsList)
        {
            kq = kq + a.hienthiFull();
        }

        return  kq;
    }



}
