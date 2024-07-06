package restaurantdeliverysystem;

import java.util.ArrayList;

/**
 *
 * @author Acer Nitro
 */
public class Menu {

    private String name;
    private ArrayList<Items> menu;

    public Menu(String name, ArrayList<Items> menu) {
        this.setName(name);
        this.setMenu(menu);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Items> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Items> menu) {
        this.menu = menu;
    }

    // Method to add an item to the menu
    public void addItem(Items item) {
        menu.add(item);
    }

    // Method to remove an item from the menu
    public void removeItem(Items item) {
        menu.remove(item);
    }

    // Overloaded method to remove an item by index
    public void removeItem(int index) {
        if (index >= 0 && index < menu.size()) {
            menu.remove(index);
        } else {
            System.out.println("Index out of range.");
        }
    }

    // Method to display the menu
    public void displayMenu() {
        System.out.println("          " + this.getName());
       int x = 0;
        for (Items item : menu) {
            x++;
            System.out.println(x + ".- " + item.getName() + " - " + item.getPrice() + "$"); // Assuming Items class has a meaningful toString() method
        }
    }
}
