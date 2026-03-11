/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author frances
 */
import javax.swing.JOptionPane;

public class QuickServeApp {
    public static void main(String[] args){
        String customerName = JOptionPane.showInputDialog("Name?");
        String studentNumber = JOptionPane.showInputDialog("Student number?");
        String itemOrdered = JOptionPane.showInputDialog("What did you order?");
        String quantityInput = JOptionPane.showInputDialog("How many did you order?");
        int quantity = Integer.parseInt(quantityInput);
        String priceInput = JOptionPane.showInputDialog("Price per item?");
        double pricePerItem = Double.parseDouble(priceInput);
    } 
        
        
        
        
        
    }
    
}
