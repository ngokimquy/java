package org.example.quanlynhanvien;

public class NhanVien extends Nguoi {

    public   Integer namSinh;
    public   Double heSoLuong;
    public     Double luong;
    static  Double tienPhuCap = 2536.0;

    public NhanVien(){};
    NhanVien(String maDinhDanh, String hoTen, Integer namSinh, Double heSoLuong){
        super(maDinhDanh,hoTen);
        this.namSinh = namSinh;
        this.heSoLuong = heSoLuong;
   //     this.luong = tinhLuong();
    }


    public Double tinhLuong(){

        return  (this.heSoLuong * 1550.0 + NhanVien.tienPhuCap);
    }


    public String getString() {
        return "NhanVien{" +
                "hoTen='" + hoTen + '\'' +
                ", maDinhDanh='" + maDinhDanh + '\'' +
                ", luong=" + luong +
                ", heSoLuong=" + heSoLuong +
                ", namSinh=" + namSinh +
                '}'+ "\n";
    }


}
