package travel;

public abstract class Transport {
    protected String name;
    
    public Transport(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract int getPrice();
}
