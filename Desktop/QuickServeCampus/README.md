
1) Campus Quick Serve 

2) This Java program is a prototype for Campus QuickServe, a small campus food vendor.  
It collects customer details and orders using a GUI , JOptionPane and it  calculates the discount , subtotal, total and VAT.

3) 
Classes
-Order : Stores customer and order details and  performs calculations  
-QuickServeApp: The main class; collects input and displays receipt

Methods in Order class
- calculateSubtotal() = calculates subtotal  
- calculateDiscount() = calculates discount if quantity > 3  
- calculateVAT() = calculates VAT after discount  
- calculateTotal() = calculates the final total  
 

Methods in QuickServe class
- main() :  collects user input, creates "Order" object, calculates totals and displays receipt  

4) 
First i created 'Order' class to do the calculations. I went through the assignment step by step.
Then I created 'QuickServeApp' to collect input using 'JOptionPane', calculate totals and display a formatted receipt.  
I tested the program step by step to ensure discounts and VAT calculations were correct and formatted the receipt for both GUI and console output. 
I created it class by class, figuring out and trying to correct every error.

5) 
- class vs object :  'Order' class used to create objects for each order   
- constants 'VAT_RATE' is known as a constant  
- methods: different methods perform calculations ('calculateSubtotal' , 'calculateDiscount', 'calculateVAT', 'calculateTotal')  

