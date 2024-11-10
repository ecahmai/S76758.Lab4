/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import javax.swing.JOptionPane;

/**
 *
 * @author Ms Aisyah
 */
public class L4q1 {
    public static void main(String[] args) {
        
       
        String inputRadius = JOptionPane.showInputDialog("Enter radius of circle ");
        double radius = Float.parseFloat(inputRadius);
        
        double diameter = 2 * radius;
        double circumference = 2 * 3.14159 * radius;
        double area = 3.14159 * Math.pow(radius, 2);
        
        String message = String.format("Diameter: %.2f %n",diameter) 
                + String.format("Circumference: %.2f %n",circumference)
                + String.format("Area: %.2f %n",area);
        
        JOptionPane.showInternalMessageDialog(null, message);
}
}
