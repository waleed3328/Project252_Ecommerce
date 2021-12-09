package ecommerce.Models;

import java.util.*;

public class Inventory {

    ArrayList<Item> items;

    public ArrayList<Item> getItems() {
        return items;
    }

    public Item getItembyID(int id) {
        Item temp;
        for (int i = 0; i < this.items.size(); i++) {
            if (id == items.get(i).getItemID()) {
                temp = items.get(i);
                return temp;
            }
        }
        return null;
    }

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public Inventory(ArrayList<Item> items) {
        this.items = items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItemtoCart(Item item) {
        this.items.add(item);
    }

    public void removeItemfromCart(int id) {
        for (int i = 0; i < this.items.size(); i++) {
            if (id == items.get(i).getItemID()) {
                items.remove(i);
            }
        }
    }
}
