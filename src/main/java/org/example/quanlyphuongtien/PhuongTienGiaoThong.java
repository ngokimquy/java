package org.example.quanlyphuongtien;

public class PhuongTienGiaoThong {

   public String hangSanXuat;
    public String tenPhuongTien;
    public Integer namSanXuat;
    public Double vantocToiDa;

      PhuongTienGiaoThong()
    {

    }
    PhuongTienGiaoThong(String hangSanXuat, String tenPhuongTien, Integer namSanXuat, Double vantocToiDa)
    {
        this.hangSanXuat = hangSanXuat;
        this.tenPhuongTien = tenPhuongTien;
        this.namSanXuat = namSanXuat;
        this.vantocToiDa = vantocToiDa;
    }


    @Override
    public String toString() {
        return "PhuongTienGiaoThong{" +
                "hangSanXuat='" + hangSanXuat + '\'' +
                ", tenPhuongTien='" + tenPhuongTien + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", vantocToiDa=" + vantocToiDa +
                '}' + '\n';

    }
}
