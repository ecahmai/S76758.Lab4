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
public class L4q4 {
    
    public static void main(String[] args) {
        
        String lowerChar = JOptionPane.showInputDialog("Enter string: ");
        String convertString = lowerChar.toUpperCase();
        
        JOptionPane.showMessageDialog(null, "Convert string: " + convertString);

        String viceVersaString = "";
        for (int i = 0; i < lowerChar.length(); i++) {
            char ch = lowerChar.charAt(i);
            if (Character.isLowerCase(ch)) {
                viceVersaString += Character.toUpperCase(ch);  
            } else {
                viceVersaString += Character.toLowerCase(ch);  
            }
        }
        
        JOptionPane.showMessageDialog(null,"\nVice versa string: " + viceVersaString);
   
    }      
    
}
