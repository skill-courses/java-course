package travel;

public class Bus extends Transport {
    public Bus(String name) {
        super(name);
    }
    
    @Override
    public int getPrice() {
        return 300;
    }
}
