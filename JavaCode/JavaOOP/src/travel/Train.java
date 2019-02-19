package travel;

public class Train extends Transport {
    
    public Train(String name) {
        super(name);
    }
    
    @Override
    public int getPrice() {
        return 400;
    }
}
