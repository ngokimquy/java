package org.example.exampledata;

public class Student {

    public  String id;
    public String name;
    public Double gpa;

    Student()
    {

    }

    public Student(String id, String name, Double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}' + '\n';
    }
}
