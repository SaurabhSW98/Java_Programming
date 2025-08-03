package com.corejava.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    private String name;
    private double gpa;

    public Student(double gpa, String name) {
        this.gpa = gpa;
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //static method created for method reference
    public static void printStudentInfo(Student s) {
        System.out.println(s.getName() + "  : " + s.getGpa());
    }
}

public class ComparatorStudents {
public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student(9.1,"bob"));
    students.add(new Student(7.5,"raj"));
    students.add(new Student(9.9,"joe"));
    students.add(new Student(7.5,"carl"));



    students.sort((a,b) -> {
        if((a.getGpa()-b.getGpa()) > 0) {
            return 1;
        }else if ((a.getGpa()-b.getGpa()) < 0) {
            return -1;
        }
        else return a.getName().compareTo(b.getName());
    });

    Comparator<Student> comparing = Comparator.comparing(Student::getGpa).thenComparing(Student::getName);
        students.sort(comparing);

//        for(Student s: students){
//        System.out.println(s.getName() + "  : "+s.getGpa());
//    }

    students.forEach(Student::printStudentInfo);//method reference
}
}
