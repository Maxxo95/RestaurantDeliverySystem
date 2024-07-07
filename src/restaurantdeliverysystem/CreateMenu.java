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
public class CreateMenu {
    
        // Food test
        Food quesadilla = new Food("Quesadilla Sencilla", 20.0, "1", "Quesadilla con queso y salsa aparte");
        Food tlacoyo = new Food("Tlacoyo de Frijol", 25.0, "2", "Tlacoyo de frijol con nopales y queso fresco");
        Food gordita = new Food("Gordita de Chicharrón", 30.0, "3", "Gordita rellena de chicharrón prensado");
        Food sope = new Food("Sope de Pollo", 22.0, "4", "Sope con pollo, crema, queso y salsa");
        Food tamal = new Food("Tamal de Rajas", 18.0, "5", "Tamal de masa de maíz con rajas y queso");
        Food chilaquiles = new Food("Chilaquiles Verdes", 35.0, "6", "Chilaquiles verdes con pollo y crema");
        Food enfrijoladas = new Food("Enfrijoladas", 28.0, "7", "Enfrijoladas rellenas de queso con crema");
        Food huarache = new Food("Huarache de Bistec", 40.0, "8", "Huarache de masa con bistec, frijoles y queso");
        Food tamaleOaxaqueño = new Food("Tamal Oaxaqueño", 25.0, "9", "Tamal oaxaqueño con mole y pollo");

        // Drink items
        Drinks atole = new Drinks("Atole de Vainilla", 15.0, "10", "Bebida caliente de masa de maíz con sabor a vainilla");
        Drinks champurrado = new Drinks("Champurrado", 20.0, "11", "Bebida caliente de chocolate y masa de maíz");
        Drinks cafeDeOlla = new Drinks("Café de Olla", 12.0, "12", "Café tradicional con piloncillo y canela");
 
      //quesadilla.display();
    
     private  ArrayList<Items> initialMenu = new ArrayList<>();
   
  public Menu testMenu(){
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
     System.out.println("        ");
   return myMenu;
  }
   
  
  
    
    
      
}
