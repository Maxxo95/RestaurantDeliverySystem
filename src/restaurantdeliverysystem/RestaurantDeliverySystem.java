/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantdeliverysystem;

import java.util.ArrayList;

/**
 *
 * @author Acer Nitro
 */
public class RestaurantDeliverySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      OrderCreator orderFood = new     OrderCreator();
     //rderFood.displayMenu();
      
     
      Order order =   orderFood.createOrder(8);
      orderFood.addToBasket(order, 11);
       ClientMenu menu = new ClientMenu();   
       menu.startMenu();
}
}