/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author Ms Aisyah
 */
public class L4q2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = scan.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = scan.nextInt();
        
        int square1 = num1 * num1;
        int square2 = num2 * num2;
        int sumSquare = square1 + square2;
        int diffSquare = square1 - square2;
        
        System.out.println("\nSquare of number 1: " + square1);
        System.out.println("Square of number 2: " + square2);
        System.out.println("Sum both square: " + sumSquare);
        System.out.println("Different both square: " + diffSquare);
    }
    
}
