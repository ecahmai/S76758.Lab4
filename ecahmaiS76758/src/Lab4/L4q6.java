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
public class L4q6 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter the values of x1: ");
        double x1 = scan.nextDouble();
        
        System.out.println("Enter the values of x2: ");
        double x2 = scan.nextDouble();
        
        System.out.println("Enter the values of x3: ");
        double x3 = scan.nextDouble();
        
        double mean = (x1 + x2 + x3)/3;
        
        double variance = Math.pow((x1 - mean),2)+Math.pow((x2 - mean),2)+Math.pow((x3 - mean),2)/3;
        
        double standardDeviation = Math.sqrt(variance);
        
        System.out.println("Mean: " + mean + "\nVariance: " + variance + "\nStandard deviation: " + standardDeviation);
        
    }
    
}
