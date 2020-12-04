// Author: Wesley Reid
//
// Module 2 - Program Three

/*
    Duke Shirts sells Java t-shirts for $24.95 each, but discounts are possible for quantities as follows:
        1 or 2 shirts, no discount and total shipping is $6.99
        3-6 shirts, discount is 10% and total shipping is $5.49
        7-9 shirts, discount is 20% and total shipping is $4.00
        10 or more shirts, discount is 30% and shipping is free

    Write a Java program that prompts the user for the number of shirts required. 
    The program should then print the extended price* of the shirts, the shipping charges, 
    and the total cost of the order. 
    
    Use currency format where appropriate.
*/

package reid2;

import java.util.Scanner;

public class ProgramThree {

    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);
        
        //define Constants for shirt, shipping costs and discounts.
        double SHIRT_COST = 24.95;
        double SHIPPING_CLASS_ONE = 6.99;
        double SHIPPING_CLASS_TWO = 5.49;
        double SHIPPING_CLASS_THREE = 4.00;
        double DISCOUNT_CLASS_ONE = 0.10;
        double DISCOUNT_CLASS_TWO = 0.20;
        double DISCOUNT_CLASS_THREE = 0.30;
        
        //gather input 
        System.out.println("Please enter the amount of t-shirts the customer is ordering: ");
        int order = input.nextInt();
        
        /*
         * To my knowledge, Java does not support switch() with cases that can have ranges. 
         * So, we'll utilize if/else if statements since the amount of cases we have to check is low.
         */
        
        //shipping cost storage value
        double shippingCost = 0.0;
        //discount value storage
        double discount = 0.0;
        
        //if order is equal to 1 or two
        if(order == 1 || order == 2) {
            shippingCost = SHIPPING_CLASS_ONE;
            //we do not need to alter discount value.
        } else if (order >= 3 && order <= 6) {
            //if order is greater than or equal to 3, or less than or equal to 6
            shippingCost = SHIPPING_CLASS_TWO;
            discount = DISCOUNT_CLASS_ONE;
        } else if (order >= 7 && order <= 9) {
            //if order is greater than or equal to 7, or less than or equal to 9
            shippingCost = SHIPPING_CLASS_THREE;
            discount = DISCOUNT_CLASS_TWO;
        } else if (order >= 10) {
            //if order is greater than or equal to 10
            discount = DISCOUNT_CLASS_THREE;
            //we do not need to alter the shippingCost value, as shipping is free.
        }
        
        //calculate initial cost
        double totalOrderCost = order * SHIRT_COST;
        
        //initialize a variable for storage for later addition of shipping and discounts.
        double total = 0.0;
        
        //utilized a second variable for if a discount is applied.
        double discountedOrderCost = 0.0;
        
        /*
         * Unlike the first two programs, I will be displaying output as we go.
         * This is because the output will change depending upon if we have variables 
         * present or not, and I should generally try to avoid re-checking variables if I can.
         */
        
        //display amount of order
        System.out.println("Order Volume: " + order);
        
        //display sub total
        System.out.println("Subtotal: $" + (String.format("%,.2f", totalOrderCost)));
        
        //check for discount, we will subtract this from totalOrderCost later.
        if(discount > 0.0) {
            discountedOrderCost = totalOrderCost * discount;
            //calculate how much they saved
            System.out.println("Discount: $" + (String.format("%,.2f", (totalOrderCost - (totalOrderCost - discountedOrderCost)))));
            //calculate the total.
            System.out.println("Discounted Total: $" + (String.format("%,.2f", totalOrderCost - discountedOrderCost)));
            //here our total is the discounted total.
            total = totalOrderCost - discountedOrderCost;
        } else {
            System.out.println("Discount: None");
            //no discount, set total to totalOrderCost
            total = totalOrderCost;
        }
        
        //apply shipping costs if any
        if(shippingCost > 0.0) {
            System.out.println("Shipping Cost: $" + (String.format("%,.2f", shippingCost)));
            //add shippingCost to total.
            total += shippingCost;
        } else { 
            System.out.println("Shipping Cost: None");
        }
        
        //display total.
        System.out.println("Total: $" + String.format("%,.2f", total));
    }
}
