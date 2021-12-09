package ecommerce.Models;

import java.util.*;

public class Cart {

    private ArrayList<Item> Items;

    public Item getItembyID(int id) {
        Item temp;
        for (int i = 0; i < this.Items.size(); i++) {
            if (id == Items.get(i).getItemID()) {
                temp = Items.get(i);
                return temp;
            }
        }
        return null;
    }

    public Cart(ArrayList<Item> Items) {
        this.Items = Items;
    }

    public Cart() {
        this.Items = new ArrayList<>();
    }

    public void addItemtoCart(Item e) {
        Items.add(e);
    }

    public ArrayList<Item> getItems() {
        return Items;
    }

    public void setItems(ArrayList<Item> Items) {
        this.Items = Items;
    }

    public void RemoveItemfromCart(int id) {
        for (int i = 0; i < this.Items.size(); i++) {
            if (id == Items.get(i).getItemID()) {
                Items.remove(i);
            }
        }
    }
}
