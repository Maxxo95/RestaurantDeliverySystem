/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantdeliverysystem;

/**
 *
 * @author Acer Nitro
 */
public class Food extends Items {

    private String description;

    public Food(String name, Integer price, String itemID, String description) {
        super(name, price, itemID);
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

}
