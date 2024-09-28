package org.example.quanlydaihoc;

public class MonHoc {
    String id;
    String ten;
    Double diem;

    public MonHoc(String id, String ten, Double diem) {
        this.id = id;
        this.ten = ten;
        this.diem = diem;
    }

    public MonHoc() {
    }

    public  String hienthiMonHoc()
    {
        return  "id: " + this.id
                + " ten: " + this.ten
                + " diem: " + this.diem
                +",";
    }

}
