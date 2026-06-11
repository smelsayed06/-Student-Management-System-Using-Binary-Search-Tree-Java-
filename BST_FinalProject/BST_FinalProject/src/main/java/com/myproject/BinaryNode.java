/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject;

/**
 *
 * @author ahmedyasser
 */
public class BinaryNode {
    Student data;           // بيانات الطالب
    BinaryNode leftChild;        // الابن الشمال "الصغير"
    BinaryNode rightChild;       // الابن اليمين "الكبير"

    // Constructor
    public BinaryNode(Student data) {
        this.data = data;
    }
}
