package com.corejava.collections;

import java.util.ArrayList;
import java.util.List;

class Student1 implements Comparable<Student1>{
    private String name;
    private double gpa;

    public Student1(double gpa, String name) {
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
    public static void printStudentInfo(Student1 s) {
        System.out.println(s.getName() + "  : " + s.getGpa());
    }

    @Override
    public int compareTo(Student1 o) {
        return Double.compare(o.getGpa(),this.getGpa());
    }
}

public class ComparableImpl {
    public static void main(String [] args){

        Student1 s1= new Student1(6.5,"John");
        Student1 s2 = new Student1(7.8,"Harry");

        List<Student1> list1= new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.sort(null);
       list1.forEach(Student1::printStudentInfo);
    }
}
