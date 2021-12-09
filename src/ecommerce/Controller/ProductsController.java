package ecommerce.Controller;

import ecommerce.Models.Cart;
import ecommerce.Models.Inventory;
import ecommerce.Models.Item;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProductsController implements Controller {

    ArrayList<Item> temp;

    public ProductsController(ArrayList<Item> temp) {
        this.temp = temp;
    }

    public ArrayList<Item> getTemp() {
        return temp;
    }

    public void setTemp(ArrayList<Item> temp) {
        this.temp = temp;
    }

    public void AddItemtoInventory(Inventory cart, Item item) {

        cart.addItemtoCart(item);

    }

    public void RemoveItemfromProducts(Inventory cart, int id) {
        cart.removeItemfromCart(id);

    }

    public void InitializeProducts(Inventory cart) {
        cart = new Inventory();

    }

    @Override
    public void Update(ArrayList<Item> products, JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (int i = 0; i < products.size(); i++) {
            model.addRow(new Object[]{products.get(i).getItemID(), products.get(i).getName(), products.get(i).getDescription(), products.get(i).getPrice()});
        }
    }
}
