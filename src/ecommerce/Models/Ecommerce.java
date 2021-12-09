package ecommerce.Models;

import ecommerce.Controller.ProductsController;
import ecommerce.Views.LoginView;
import java.util.ArrayList;

public class Ecommerce {

    public static void main(String[] args) {
        ArrayList<Item> temp = new ArrayList<>();
        temp.add(new Item(1, "Beef Burger", "	Frozen beef patties", 11.5));
        temp.add(new Item(2, "Pepsi", "	Carbinated cola flavored soft drink", 2.5));
        temp.add(new Item(3, "Toast Bread", "	pre-cut loaf of bread", 3.0));
        temp.add(new Item(4, "Skittles", "	Rainbow colored candy", 1.5));
        temp.add(new Item(5, "Nutella ", "   Hazelnut and cocoa flavored spread", 18.0));
        temp.add(new Item(6, "Redbull", "	Energy Drink", 8.5));
        temp.add(new Item(7, "Whole Chicken", "	Halal slaughtered whole chicken", 12.5));
        temp.add(new Item(8, "Burger Bread", "	pre-cut seseme covered buns", 2.5));
        temp.add(new Item(9, "Ketchup ", "   Tomato flavored sauce", 5.0));
        Inventory inven = new Inventory(temp);
        ProductsController initializer = new ProductsController(temp);
        LoginView mainpage = new LoginView(inven);
        mainpage.setVisible(true);
    }

}
