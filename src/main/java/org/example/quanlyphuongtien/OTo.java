package org.example.quanlyphuongtien;

public class OTo  extends  PhuongTienGiaoThong{

    public  Integer soChoNgoi;
    public String kieuDongCo;


    public  OTo()
    {
    }
    public  OTo(Integer soChoNgoi, String kieuDongCo)
    {
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public  OTo(String hangSanXuat, String tenPhuongTien, Integer namSanXuat, Double vantocToiDa,Integer soChoNgoi, String kieuDongCo)
    {
        super(hangSanXuat, tenPhuongTien, namSanXuat, vantocToiDa)  ;
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }


    @Override
    public String toString() {
        return "OTo{" +
                "hangSanXuat='" + hangSanXuat + '\'' +
                ", tenPhuongTien='" + tenPhuongTien + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", vantocToiDa=" + vantocToiDa +
                ", soChoNgoi=" + soChoNgoi +
                ", kieuDongCo='" + kieuDongCo + '\'' +
                '}' + "\n";
    }
    public void test()
    {
        System.out.println("hello tphcm");
    }
}
