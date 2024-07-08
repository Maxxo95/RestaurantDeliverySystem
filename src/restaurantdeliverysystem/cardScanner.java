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
public class cardScanner {
    
       
      public static CardPayment cardScanner() {
        Scanner scanner = new Scanner(System.in);
        
        String cardNumber = "";
        while (true) {
            System.out.println("Enter card number (16 digits):  ");
             System.out.println("Introduce "+ 0 + " para volver al Menu: ");
            cardNumber = scanner.nextLine();
            if (cardNumber.matches("\\d{16}")) {
                break;
            } else if (cardNumber.matches("0")){
                   return null; 
                    }else {
                System.out.println("Invalid card number. Please enter exactly 16 digits.");
            }
        }

        System.out.print("Enter card holder name: ");
        String cardHolderName = scanner.nextLine();

        String expirationDate = "";
        while (true) {
            System.out.print("Enter expiration date (MM/YY): ");
            expirationDate = scanner.nextLine();
            if (expirationDate.matches("(0[1-9]|1[0-2])/[0-9]{2}")) {
                break;
            }  else {
                System.out.println("Invalid expiration date. Please enter in MM/YY format.");
            } 
        }

        String cvv = "";
        while (true) {
            System.out.print("Enter CVV (3 digits): ");
            cvv = scanner.nextLine();
            if (cvv.matches("\\d{3}")) {
                break;
            } else {
                System.out.println("Invalid CVV. Please enter exactly 3 digits.");
            }
        }
       
        CardPayment card = new CardPayment(cardNumber, cardHolderName, expirationDate, cvv);
         System.out.println("");
        System.out.println("Gracias por su preferencia, su orden esta en progreso" );
         System.out.println("Para salir entre 0:");
          System.out.println("Para iniciar otra orden presione 2:");
           System.out.println("");
        return card;
    }
}
