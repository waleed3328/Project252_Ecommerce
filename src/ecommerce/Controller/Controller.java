package ecommerce.Controller;

import ecommerce.Models.Item;
import java.util.ArrayList;
import javax.swing.JTable;

public interface Controller {

    public void Update(ArrayList<Item> products, JTable table);
}
