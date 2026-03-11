/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author frances
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author frances
 */
public class Order {

    // Information
    private String customerName;
    private String studentNumber;
    private String itemOrdered;
    private int quantity;
    private double pricePerItem;

    // Constant for VAT
    private static final double VAT_RATE = 0.15;

    // Constructor
    public Order(String customerName, String studentNumber, String itemOrdered, int quantity, double pricePerItem) {
        this.customerName = customerName;
        this.studentNumber = studentNumber;
        this.itemOrdered = itemOrdered;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Calculating Subtotal Method
    public double calculateSubtotal() {
        return quantity * pricePerItem;
    }

    // Calculating 10% discount if quantity > 3
    public double calculateDiscount() {
        if (quantity > 3) {
            return calculateSubtotal() * 0.10;
        }
        return 0.0;
    }

    // Calculating VAT Method
    public double calculateVAT() {
        return (calculateSubtotal() - calculateDiscount()) * VAT_RATE;
    }

    // Calculating total Method
    public double calculateTotal() {
        return calculateSubtotal() - calculateDiscount() + calculateVAT();
    }

} // Order class close 

