/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject;

/**
 *
 * @author ahmedyasser
 */
import java.util.ArrayList;

public class BST_FinalProject {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        // testing isEmpty() method before adding
        System.out.println(bst.isEmpty()); // true

        //  إضافة 20 طالب
        bst.insert(new Student("Khaled",105, 95.0));
        bst.insert(new Student("Omar",78, 83.0));
        bst.insert(new Student("Hana",150, 91.0));
        bst.insert(new Student("Tamer",68, 74.0));
        bst.insert(new Student("Sara",95, 92.0));
        bst.insert(new Student("Dina",130, 86.5));
        bst.insert(new Student("Rana",170, 93.5));
        bst.insert(new Student("Bassem",63, 69.0));
        bst.insert(new Student("Karim",72, 88.5));
        bst.insert(new Student("Youssef",85, 79.5));
        bst.insert(new Student("Mohamed",115, 76.5));
        bst.insert(new Student("Layla",140, 70.0));
        bst.insert(new Student("Mona",180, 82.0));
        bst.insert(new Student("Sherif",58, 77.0));
        bst.insert(new Student("Adel",53, 90.5));
        bst.insert(new Student("Nadia",48, 68.0));
        bst.insert(new Student("Hazem",120, 85.0));
        bst.insert(new Student("Fatma",160, 95.0));
        bst.insert(new Student("Nour",190, 65.0));
        bst.insert(new Student("Eman",200, 97.0));

        // testing isEmpty() method after adding
        System.out.println(bst.isEmpty()); // false

        // testing size() method
        System.out.println("The numbers of student: " + bst.getSize()); // 20

        // testing height() method
        System.out.println("The height of this tree = " + bst.getHeight());

        // testing toArrayList() method and printing it
        
        System.out.println("This the binary tree as an ArrayList: ");
        ArrayList<Object> list = bst.getList(); 
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // الطباعة سطر بسطر
        }

        // Testing containsNonBST() method
        // searching for an existed student
        Student search1 = new Student("Layla",140, 70.0);
        System.out.println("Search ID = 140: " + bst.find(search1.id));
        System.out.println("Comparisons: " + bst.comparisons);
                
        //searching for a non-existent student
        Student search2 = new Student("Mazen", 999, 0);
        System.out.println("Search ID = 999: " + bst.find(search2.id));
        System.out.println("Comparisons: " + bst.comparisons);
    }
}
