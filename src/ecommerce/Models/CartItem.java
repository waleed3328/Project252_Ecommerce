package ecommerce.Models;

public class CartItem {

    Item toBeAdded;
    int Quantity;

    public CartItem(Item toBeAdded, int Quantity) {
        this.toBeAdded = toBeAdded;
        this.Quantity = Quantity;
    }

    public Item getToBeAdded() {
        return toBeAdded;
    }

    public void setToBeAdded(Item toBeAdded) {
        this.toBeAdded = toBeAdded;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

}
