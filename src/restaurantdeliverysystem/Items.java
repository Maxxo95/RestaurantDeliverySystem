/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantdeliverysystem;

public abstract class Items {

    private String name;
    protected Double price;
    private String itemID;

    public Items(String name, Double price, String itemID) {
        this.setName(name);
        this.setPrice(price);
        this.setItemID(itemID);
    }
     public Items() {
        this.setName(name);
        this.setPrice(price);
        this.setItemID(itemID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public abstract void display();
    public abstract Items createItem();
}
