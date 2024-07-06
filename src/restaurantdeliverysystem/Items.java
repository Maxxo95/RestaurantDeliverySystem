/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantdeliverysystem;


public abstract class Items {
    private String name ;
    protected Integer price; 
    private String itemID;

    public Items(String name, Integer price, String itemID) {
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }
       public abstract void display();
    
}
