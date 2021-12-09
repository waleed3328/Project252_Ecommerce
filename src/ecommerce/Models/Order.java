package ecommerce.Models;

import java.util.*;

public class Order {

    private int OrderID;
    private String UserName;
    private String TimeofOrder;
    private Date ShippedDate;
    private String Address;
    private String Status;
    private Double Price;

    public Order(int OrderID, String UserName, String TimeofOrder, Date ShippedDate, String Address, String Status, Double Price) {
        this.OrderID = OrderID;
        this.UserName = UserName;
        this.TimeofOrder = TimeofOrder;
        this.ShippedDate = ShippedDate;
        this.Address = Address;
        this.Status = Status;
        this.Price = Price;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getTimeofOrder() {
        return TimeofOrder;
    }

    public void setTimeofOrder(String TimeofOrder) {
        this.TimeofOrder = TimeofOrder;
    }

    public Date getShippedDate() {
        return ShippedDate;
    }

    public void setShippedDate(Date ShippedDate) {
        this.ShippedDate = ShippedDate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }
}
