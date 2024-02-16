/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author deeks
 */
import java.util.Scanner;
public class Student {
    String studentName;
    String regNum;
    Book borrowedBooks[] = new Book[3];
    public int booksCount = 0;
    Scanner input = new Scanner(System.in);
    public Student() {
        this.studentName = input.nextLine();
        this.regNum = input.nextLine();
    }
}
    

