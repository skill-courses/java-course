package java8;

public class User {
    private int id;
    private String name;
    private int cardNumber;
    
    public User(int id, String name, int cardNumber) {
        this.id = id;
        this.name = name;
        this.cardNumber = cardNumber;
    }
    
    public int getCardNumber() {
        return cardNumber;
    }
    
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
