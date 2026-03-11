/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author frances
 */
public class Order {
    
    //  Attributes
    
    private String customerName;
    private String studentNumber;
    private String itemOrdered;
    private int quantity;
    private double pricePerItem;
    
    // Constructor 
    
    public Order(String customerName, String studentNumber, String itemOrdered, int wuantity, double pricePerItem){
        this.customerName = customerName;
        this.studentNumber = studentNumber;
        this. itemOrdered = itemOrdered;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;}
    
        //Method
        // Calculating subtotal
    
    public double calculateSubtotal(){
        double subtotal = quantity * pricePerItem;
        return subtotal; }
    
         // Discount
    
    public double calculateDiscount(){
        double subtotal = calculateSubtotal();
        double discount = 0.0;
        
        // Quantity Check 
        
        if (quantity > 3)
    
    
    
        
    
        
    }
            
    
}
