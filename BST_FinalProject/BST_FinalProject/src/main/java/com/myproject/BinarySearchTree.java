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

public class BinarySearchTree {

    private BinaryNode root;        // الجذر
    int comparisons = 0;        // عداد المقارنات

    // Constructor - شجرة فارغة
    public BinarySearchTree() {
        root = null;
    }

    // ==================== height() ====================
    public int height(BinaryNode node) {
        if (node == null) return -1;
        int left = height(node.leftChild);
        int right = height(node.rightChild);

        return 1 + Math.max(left, right);
    }

    // ==================== size() ====================
    public int size(BinaryNode node) {
        if (node == null) return 0;                     // شجرة فارغة
        
        int left = size(node.leftChild);
        int right = size(node.rightChild);

        return 1 + left + right;
    }

    // ==================== containsNonBST() ====================
    public boolean containsNonBST(BinaryNode node, int id) {
    if (node == null) return false;
    comparisons++;
    if (node.data.id == id) return true;

    return containsNonBST(node.leftChild, id) ||
           containsNonBST(node.rightChild, id);
    }

    // ==================== isEmpty() ====================
    public boolean isEmpty() {
        return root == null;
    }

    // ==================== toString() ====================
    public String toString(BinaryNode node) {
        if (node == null) return "";

        return toString(node.leftChild) + 
               node.data.toString() + "\n" + 
               toString(node.rightChild);
    }

    // ==================== toArrayList() ====================
    public void toArrayList(BinaryNode node, ArrayList<Object> list) {
        
        if (node == null) return;

        toArrayList(node.leftChild, list);
        list.add(node.data);
        toArrayList(node.rightChild, list);
    }

    // ==================== insert() - إضافة طالب ====================
    public void insert(Student s) {
   
        BinaryNode newNode = new BinaryNode(s); 

        if (root == null) { 
            root = newNode;
        } 
        else { 
            BinaryNode current = root;
            BinaryNode parent;

        while (true) {
            parent = current;
            

            comparisons++;
            if (s.id < current.data.id) { 
                current = current.leftChild;
                if (current == null) {
                    parent.leftChild = newNode;
                    return;
                }
            } 
            else { 
                current = current.rightChild;
                if (current == null) { 
                    parent.rightChild = newNode;
                    return;
                }
            }
        } 
        }
    }

    public int getHeight() { 
        return height(root); 
    }
    
    public int getSize() { 
        return size(root);
    }
    
    public boolean find(int id) { 
        return containsNonBST(root, id);
    }
    
    public String displayAll() {
        return toString(root); 
    }
    
    public ArrayList<Object> getList() {
        ArrayList<Object> list = new ArrayList<>();
        toArrayList(root, list);
        return list;
    }
}
