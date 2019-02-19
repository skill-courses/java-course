package travel;

public class SelfDriving extends Transport {
    public SelfDriving(String name) {
        super(name);
    }
    
    @Override
    public int getPrice() {
        return 500;
    }
}
