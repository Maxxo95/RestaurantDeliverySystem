/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantdeliverysystem;

import java.util.Scanner;

/**
 *
 * @author Acer Nitro
 */

    public class CardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String cvv;
  
    public CardPayment(String cardNumber, String cardHolderName, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }
     public CardPayment() {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public boolean processPayment(double amount) {
      
        System.out.println("Processing card payment of $" + amount);
        return true; // Assuming payment is successful
    }

    @Override
    public String getPaymentDetails() {
        return "Card payment using card number ending in " + cardNumber.substring(cardNumber.length() - 4);
    }
 
    
}


