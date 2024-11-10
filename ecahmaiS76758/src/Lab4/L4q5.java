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
public class L4q5 {
    
    public static void main(String[] args) {
        
        String inputDistance = JOptionPane.showInputDialog("Enter the distance in meters: ");
        double distanceInMeters = Double.parseDouble(inputDistance);
        
        String inputHour = JOptionPane.showInputDialog("Enter time in hour: ");
        int hour = Integer.parseInt(inputHour);
        
        String inputMinute = JOptionPane.showInputDialog("Enter time in minutes: ");
        int minute = Integer.parseInt(inputMinute);
        
        String inputSecond = JOptionPane.showInputDialog("Enter time in second: ");
        int second = Integer.parseInt(inputSecond);
        
        int totalTimeInSeconds = (hour * 3600) + (minute * 60) + second;

        // Step 4: Calculate speed in meters per second
        double speedMetersPerSecond = distanceInMeters / totalTimeInSeconds;

        // Step 6: Calculate speed in kilometers per hour and miles per hour
        double speedKilometersPerHour = speedMetersPerSecond * 3600 / 1000;
        double speedMilesPerHour = speedMetersPerSecond * 3600 / 1609;
        
        String Message = String.format ("Speed meter per second: %.2f m/s %n",speedMetersPerSecond)
                + String.format("Speed kilometer per hour: %.2f kp/h %n", speedKilometersPerHour)
                + String.format("Speed miles per hour: %.2f mph", speedMilesPerHour);
        
        JOptionPane.showMessageDialog(null, Message);
        
    }
    
}
