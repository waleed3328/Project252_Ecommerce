package ecommerce.Models;

public class Item {

    public Item() {
    }
    private int ItemID;
    private Double Price;
    private String Photo;
    private String Description;
    private int InStock;
    private String name;

    public int getItemID() {
        return ItemID;
    }

    public Item(int ItemID, String name, String Description, Double Price) {
        this.ItemID = ItemID;
        this.Price = Price;
        this.Description = Description;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItemID(int ItemID) {
        this.ItemID = ItemID;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getInStock() {
        return InStock;
    }

    public void setInStock(int InStock) {
        this.InStock = InStock;
    }
}
