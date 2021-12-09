package ecommerce.Models;

public class User {

    private int id;
    private String Username;
    private String Password;
    private String Email;
    private String Address;
    private String Contact;

    public User(int id, String Username, String Password, String Email, String Address, String Contact) {
        this.id = id;
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
        this.Address = Address;
        this.Contact = Contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }
}
