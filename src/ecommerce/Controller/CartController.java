package ecommerce.Controller;

import ecommerce.Models.Cart;
import ecommerce.Models.CartItem;
import ecommerce.Models.Item;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CartController implements Controller {

    public void AddItemtoCart(Cart cart, Item item) {
        cart.addItemtoCart(item);
    }

    public void RemoveItemfromCart(Cart cart, int id) {
        cart.RemoveItemfromCart(id);
    }

    public void InitializeCart(Cart cart) {
        cart = new Cart();
    }

    @Override
    public void Update(ArrayList<Item> products, JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        for (int i = 0; i < products.size(); i++) {
            model.addRow(new Object[]{products.get(i).getItemID(), products.get(i).getName(), products.get(i).getPrice()});
        }
    }
}
