package org.example.quanlyphuongtien;

import java.util.ArrayList;

public class QuanLyOto
{
    ArrayList<OTo> listOto;

    public  QuanLyOto(){
        listOto = new ArrayList<>();
    }

    public  void  themOto(OTo oto){

        listOto.add(oto);
    }

    public  String dataListOto()
    {
        String kq ="";

        for (OTo a:listOto)
        {
            kq = kq + a.toString();
        }

        return  kq;

    }


}
