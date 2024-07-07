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
    

    Order order;

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
            System.out.println("5.- Eliminar orden");
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
                    System.out.println("Functionality for adding to the order is not yet implemented.");
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
                    System.out.println("Functionality for deleting the order is not yet implemented.");
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
}

