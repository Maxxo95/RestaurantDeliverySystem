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
        public Menu displayMenu(){
        displayMenu = menuCreator.testMenu();
        displayMenu.displayMenu();
        return displayMenu;
        }
        
        
        
        public Order createOrder(int n) {
           
           Integer itemIndex = n-1;
          displayMenu = menuCreator.testMenu();
         
          Items item = displayMenu.getIndexAt(itemIndex);
           
           
            ArrayList<Items> itemsList = new ArrayList();  
            itemsList.add(item);
            Order order = new Order(item.price, itemsList);
            System.out.println( " Nueva Orden ");
            System.out.println("Total: " + order.getTotal() + " $");
            System.out.println(item.getName() + " total: " + item.price + "$");
            return order;
        }
        
        public Order addToBasket(Order order , int n){
           Integer itemIndex = n-1;
           displayMenu = menuCreator.testMenu();
             ArrayList<Items> itemsList = new ArrayList();   
         itemsList =  order.getItemsList();
         Items item = displayMenu.getIndexAt(itemIndex);
         itemsList.add(item);
         order.setItemsList(itemsList);
         order.setTotal(order.getTotal()+item.price);
        System.out.println("Total: " + order.getTotal());
         for( int i = 0 ; i < itemsList.size(); i++){
             
             System.out.println( i+1 + " " + itemsList.get(i).getName() + " "+itemsList.get(i).getPrice() + " $")  ;
        }
        return  order;
        }

        public void displayOrder (Order order){
             for(int n = 0 ; n < order.getItemsList().size() ; n++ ){
              System.out.println( n+1 + " " +  order.getItemAtIndex(n).getName() + " " + order.getItemAtIndex(n).getPrice() + "$");
                        }
            }
      

}

        