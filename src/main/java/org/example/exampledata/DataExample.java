package org.example.exampledata;

public class DataExample {

    public static Student getStudent()
    {
        Student st = new Student();
        st.name = Data.getNamePerson();
        st.id = Data.getId(8);
        st.gpa = Data.getGpa();

        return  st;
    }






}
