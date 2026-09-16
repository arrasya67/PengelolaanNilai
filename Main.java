/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak2;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner; //input user 

public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukan jumlah Siswa :");
    int jumlahSiswa = scanner.nextInt();
    scanner.nextLine();
    Student[] student = new Student[jumlahSiswa];
    for (int i = 0; i < jumlahSiswa; i++) {
        System.out.println("\n Data Siswa ke " + (i + 1)+":");
        System.out.print("Masukan Nama: ");
        String nama =  scanner.nextLine();
        System.out.print("Masukan Nilai: ");
        double nilai = scanner.nextDouble();
        scanner.nextLine();
        student[i] = new Student(nama, nilai);
        student[i].checkPassed();
    }
    
System.out.println();
double total = 0;
int lulus = 0;
Student tertinggi = student[0];
Student terendah = student[0];

for (Student s : student) {
System.out.println("Siswa: " + s.name + " - Nilai: " + s.score + " - " + (s.passed ? "LULUS" : "TIDAK LULUS"));
total += s.score;
if (s.passed) lulus++;
if (s.score > tertinggi.score) tertinggi = s;
if (s.score < terendah.score) terendah = s;
}
System.out.println();
System.out.printf(" Rata - Rata Nilai Kelas: %.2f%n", total / student.length);
System.out.println(" Jumlah Siswa Lulus: " + lulus);
System.out.println("Jumlah Siswa Tidak Lulus: " + (student.length - lulus));
System.out.println();
System.out.println(" Nilai Tertinggi: " + tertinggi.name + " (" + tertinggi.score + ")");
System.out.println(" Nilai Terendah: " + terendah.name + " (" + terendah.score + ")");
scanner.close();
}
}