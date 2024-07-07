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
public class OrderCreator {
    
      Menu displayMenu;
      CreateMenu menuCreator = new CreateMenu();
        public void displayMenu(){
        displayMenu = menuCreator.testMenu();
        displayMenu.displayMenu();
        }
        
        
        
        public Order createOrder(int n){
           
           Integer itemIndex = n-1;
          displayMenu = menuCreator.testMenu();
          Items item = displayMenu.getIndexAt(itemIndex);
           
           
            ArrayList<Items> itemsList = new ArrayList();  
            itemsList.add(item);
            Order order = new Order(item.price, itemsList);
           System.out.println( " -Orden");
            System.out.println(item.getName() + " total: " + item.price + "$");
            return order;
        }
        
        public void addToBasket(Order order , int n){
           Integer itemIndex = n-1;
           displayMenu = menuCreator.testMenu();
            
            
        }
}
