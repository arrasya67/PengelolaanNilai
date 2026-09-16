/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak2;

/**
 *
 * @author Lenovo
 */
public class Student {
    String name;
    double score;
    boolean passed;
//constructor 
public Student(String name, Double score){
    this.name = name;
    this.score = score;
}
//syarat lulus
public void checkPassed() {
    passed = score >= 70;
}
}
