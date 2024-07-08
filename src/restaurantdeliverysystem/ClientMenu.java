/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantdeliverysystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer Nitro
 */
public class ClientMenu {

    OrderCreator orderFood = new OrderCreator();
    

    Order order ;

    // orderFood.addToBasket(order, 11);
    
    public void startMenu() {

        Scanner scanner = new Scanner(System.in);

        String menuOption = "";
        while (!menuOption.equals("0")) {

            System.out.println("------------------------------------------------");
            System.out.println("Bienvenidos a la cocina de Doña Claudia ");
            System.out.println("Elige una opcion");
            System.out.println("1.- Mostrar el menu");
            System.out.println("2.- Comenzar orden");
            System.out.println("3.- Añadir a la order");
            System.out.println("4.- Mostrar orden");
            System.out.println("5.- Modificar orden");
            System.out.println("6.- Pagar Orden");
            System.out.println("0.- Salir");

            menuOption = scanner.nextLine().trim();

            switch (menuOption) {
                case "1":
                   orderFood.displayMenu();
                    break;
                case "2":
                    System.out.println("Añada el item que desea, uno a la vez");
                    String itemOption = scanner.nextLine().trim();

                    try {
                        int itemNumber = Integer.parseInt(itemOption);
                        order = orderFood.createOrder(itemNumber);
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid item number.");
                    }
                    break;
                case "3":
                    // Implement the functionality for adding to the order here
                       System.out.println("Añada el item que desea, uno a la vez");
                    String indexOfMenuItem = scanner.nextLine().trim();
                  if (order != null) {
                          try {
                        int itemNumber = Integer.parseInt(indexOfMenuItem);
                        order =  orderFood.addToBasket(order,  itemNumber);
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid item number.");
                    }
                    } else {
                        System.out.println("Comienze orden antes de añadir mas productos.");
                    }
                   
                  
                    break;
                case "4":
                    if (order != null) {
                        orderFood.displayOrder(order);
                    } else {
                        System.out.println("Order is empty.");
                    }
                    break;
                case "5":
                    // Implement the functionality for deleting the order here
                    System.out.println("Functionality for modifiyin the order is not yet implemented.");
                    break;
                    case "6":
                     String referencia;
                  String domicilio;
                  
             if (order != null) {      
                   System.out.println("Entre su domicilio"); 
                  domicilio =   scanner.nextLine().trim();
                    System.out.println("Entre Referencia (Opcional)"); 
                  referencia =   scanner.nextLine().trim();
                  order.setDomicilio("Domicilio: " + domicilio + ". Referencia: " + referencia);
                  
                    System.out.println(order.getDomicilio());    
                        
                    // Implement the functionality for deleting the order here
                    System.out.println("Selecciona el metodo de pago ");
                    System.out.println("1.- Pago con tarjeta  ");
                    System.out.println("2.- Pago en efectivo  ");
                    
                  
                     String n = scanner.nextLine().trim();
                  int paymentOption = Integer.parseInt(n);
                  
                  if(paymentOption == 1){
                     CardPayment cardInfo = new CardPayment();
                     cardInfo = cardScanner();
                  }
                  else {
                      System.out.println("Pago en efectivo");
                  }  
                  
             }else {
                        System.out.println("Orden Vacia");
                    }
                         
                 
                    
                    break;
                case "0":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("This is not a valid option.");
                    break;
            }
        }

        scanner.close();
    }
    
       
 public static CardPayment cardScanner() {
        Scanner scanner = new Scanner(System.in);
        
        String cardNumber = "";
        while (true) {
            System.out.print("Enter card number (16 digits): ");
            cardNumber = scanner.nextLine();
            if (cardNumber.matches("\\d{16}")) {
                break;
            } else {
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
            } else {
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
        return card;
    }
}

