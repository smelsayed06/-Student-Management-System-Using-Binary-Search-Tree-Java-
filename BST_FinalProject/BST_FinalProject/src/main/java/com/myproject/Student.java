/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject;

/**
 *
 * @author ahmedyasser
 */
public class Student {
     // كلاس الطالب - يحتوي على بيانات الطالب


    protected String name;    // اسم الطالب
    protected int id;         // الرقم التعريفي (المفتاح)
    protected double grade;   // الدرجة

    // Constructor
    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    // toString لعرض البيانات
    @Override
    public String toString() {
        return "--> ID=" + id + ", Name=" + name + ", Grade=" + grade;
    }
}
