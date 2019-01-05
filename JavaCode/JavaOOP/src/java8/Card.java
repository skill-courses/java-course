package java8;

public class Card {
    private int number;
    private String name;
    
    public Card(int number, String name) {
        this.number = number;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getNumber() {
    
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
}
