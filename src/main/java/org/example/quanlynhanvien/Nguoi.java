package org.example.quanlynhanvien;

public class Nguoi {

      public String maDinhDanh;
       public String hoTen;


    Nguoi()
    {}
    Nguoi(String maDinhDanh, String hoTen )
    {
        this.maDinhDanh = maDinhDanh;
        this.hoTen = hoTen;
    }

    public  String getString(){
        String  kq ="";
        kq = "maDinhDanh: " + this.maDinhDanh + "\t"
                + "hoTen: " + this.hoTen + "\t" + "\n";


    return  kq;


    }


}
