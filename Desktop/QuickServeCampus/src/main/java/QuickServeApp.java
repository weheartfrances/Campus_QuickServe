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

    public static void main(String[] args) {

        // Ask user for input
        String customerName = JOptionPane.showInputDialog("Name?");
        String studentNumber = JOptionPane.showInputDialog("Student number?");
        String itemOrdered = JOptionPane.showInputDialog("What did you order?");
        String quantityInput = JOptionPane.showInputDialog("How many did you order?");
        int quantity = Integer.parseInt(quantityInput);
        String priceInput = JOptionPane.showInputDialog("Price per item?");
        double pricePerItem = Double.parseDouble(priceInput);

        // Order object
        Order myOrder = new Order(customerName, studentNumber, itemOrdered, quantity, pricePerItem);

        // Calculate Variables
        double subtotal = myOrder.calculateSubtotal();
        double discount = myOrder.calculateDiscount();
        double vat = myOrder.calculateVAT();
        double total = myOrder.calculateTotal();

        // Receipt string
        String receipt = "---- Campus QuickServe Receipt ----\n" +
                         "Customer Name: " + customerName + "\n" +
                         "Student Number: " + studentNumber + "\n\n" +
                         "Item Ordered: " + itemOrdered + "\n" +
                         "Quantity: " + quantity + "\n" +
                         "Price per Item: R" + String.format("%.2f", pricePerItem) + "\n\n" +
                         "Subtotal: R" + String.format("%.2f", subtotal) + "\n" +
                         "Discount Applied: R" + String.format("%.2f", discount) + "\n" +
                         "VAT (15%): R" + String.format("%.2f", vat) + "\n" +
                         "Total: R" + String.format("%.2f", total) + "\n\n" +
                         "Thank you for your order!\n" +
                         "-------------------------------------";

        // Receipt Output
        JOptionPane.showMessageDialog(null, receipt, "Receipt", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(receipt);

    } // Main close

} // QuickServeApp class close
        