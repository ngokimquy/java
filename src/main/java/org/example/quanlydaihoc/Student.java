package org.example.quanlydaihoc;

import java.util.ArrayList;

public class Student {


    String name;
    String id;
    ArrayList<MonHoc> grades;

    public Student()
    {
        grades = new ArrayList<>();
    }
    public  String hienthiId()
    {
        return  "Name: " + this.name + " " + "Id: " + this.id;
    }
    public  String hienthiDiem()
    {   String kq = new String();
       for (MonHoc a: grades)
       {
          kq = kq+a.hienthiMonHoc();
       }
        return  kq;
    }

    public String hienthiFull()
    {
        return  hienthiId() + hienthiDiem();
    }

}
