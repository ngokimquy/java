package org.example.quanlydaihoc;

public class tesst {
    public  void test()
    {
        Student sv1 = new Student();
        sv1.id = "12";
        sv1.name = "ngo kim quy";
        MonHoc mh1 = new MonHoc("12", "mon van", 5.3);
        MonHoc mh2 = new MonHoc("14", "mon toan",5.5);
        sv1.grades.add(mh1);
        sv1.grades.add(mh2);
        System.out.println(sv1.hienthiFull());
        for (MonHoc a:sv1.grades)
        {
            if (a.id == "12")
            {
                System.out.println("da phat hien");
                sv1.grades.remove(a);
            }
        }
        System.out.println(sv1.hienthiFull());
    }


}
