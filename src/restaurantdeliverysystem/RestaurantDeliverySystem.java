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
    Food quesadilla = new Food("Quesadilla Sencilla", 20, "1","Quesadilla con queso y salsa aparte");   
    quesadilla.display();
    
     ArrayList<Items> initialMenu = new ArrayList<>();
        Menu myMenu = new Menu("Desayunos", initialMenu);
    
    myMenu.addItem(quesadilla);
    myMenu.displayMenu();
    }
    
}
