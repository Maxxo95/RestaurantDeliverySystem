/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantdeliverysystem;

/**
 *
 * @author Acer Nitro
 */
public interface PaymentMethod {
   
    boolean processPayment(double amount);
    String getPaymentDetails();
   

}
