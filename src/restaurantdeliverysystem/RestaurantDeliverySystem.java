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
   // Mexican Food items
       
   
   
        Food quesadilla = new Food("Quesadilla Sencilla", 20, "1", "Quesadilla con queso y salsa aparte");
        Food tlacoyo = new Food("Tlacoyo de Frijol", 25, "2", "Tlacoyo de frijol con nopales y queso fresco");
        Food gordita = new Food("Gordita de Chicharrón", 30, "3", "Gordita rellena de chicharrón prensado");
        Food sope = new Food("Sope de Pollo", 22, "4", "Sope con pollo, crema, queso y salsa");
        Food tamal = new Food("Tamal de Rajas", 18, "5", "Tamal de masa de maíz con rajas y queso");
        Food chilaquiles = new Food("Chilaquiles Verdes", 35, "6", "Chilaquiles verdes con pollo y crema");
        Food enfrijoladas = new Food("Enfrijoladas", 28, "7", "Enfrijoladas rellenas de queso con crema");
        Food huarache = new Food("Huarache de Bistec", 40, "8", "Huarache de masa con bistec, frijoles y queso");
        Food tamaleOaxaqueño = new Food("Tamal Oaxaqueño", 25, "9", "Tamal oaxaqueño con mole y pollo");

        // Drink items
        Drinks atole = new Drinks("Atole de Vainilla", 15, "10", "Bebida caliente de masa de maíz con sabor a vainilla");
        Drinks champurrado = new Drinks("Champurrado", 20, "11", "Bebida caliente de chocolate y masa de maíz");
        Drinks cafeDeOlla = new Drinks("Café de Olla", 12, "12", "Café tradicional con piloncillo y canela");
 
      //   quesadilla.display();
    
     ArrayList<Items> initialMenu = new ArrayList<>();
   
     Menu myMenu = new Menu("Desayunos", initialMenu);
    
    myMenu.addItem(quesadilla);
    myMenu.addItem(tlacoyo);
     myMenu.addItem(gordita);
    myMenu.addItem(sope); 
     myMenu.addItem(tamal);
    myMenu.addItem(chilaquiles);
     myMenu.addItem(enfrijoladas);
    myMenu.addItem(huarache);
     myMenu.addItem(tamaleOaxaqueño);
    myMenu.addItem(atole);
     myMenu.addItem(champurrado);
    myMenu.addItem(cafeDeOlla);
    
    
    System.out.println("         Bienvenido");
    
    myMenu.displayMenu();
    
    
    }
    
}
