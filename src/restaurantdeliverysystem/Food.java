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
public class Food extends Items {

    private String description;

    public Food(String name, Double price, String itemID, String description) {
        super(name, price, itemID);
        this.setDescription(description);
    }
    public Food() {
       
        this.setDescription(description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void display() {
        System.out.println(getName());
        System.out.println("Precio: " + this.getPrice() + " $");
        System.out.println("Descripcion: " + this.getDescription());

    }
  public Items createItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the item:");
        String name = scanner.nextLine().trim();

        while (name.isEmpty()) {
            System.out.println("Name cannot be empty. Please enter the name of the item:");
            name = scanner.nextLine().trim();
        }

        System.out.println("Enter the price of the item:");
        double price = -1;
        while (price < 0) {
            String priceInput = scanner.nextLine().trim();
            try {
                price = Double.parseDouble(priceInput);
                if (price < 0) {
                    System.out.println("Price cannot be negative. Please enter a valid price:");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid price:");
            }
        }

        System.out.println("Enter the description of the item (optional):");
        String description = scanner.nextLine().trim();
        
        // Create the Food item
        Food foodItem = new Food(name, price,"ID", description);
        //foodItem.display();
        
        System.out.println("Item created successfully: " );
        return foodItem;
    }
}
