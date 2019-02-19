package travel;

public class AirPlane extends Transport {
    public AirPlane(String name) {
        super(name);
    }
    
    @Override
    public int getPrice() {
        return 1000;
    }
}
