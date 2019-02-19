package travel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Context {
    private List<Transport> allTransports = new ArrayList<>();
    
    public Context() {
        this.allTransports.add(new Bus("大巴车"));
        this.allTransports.add(new AirPlane("飞机"));
        this.allTransports.add(new SelfDriving("自驾"));
        this.allTransports.add(new Train("火车"));
    }
    
    public List<Transport> getChoosedTransport(int money) {
        return allTransports.stream().filter(transport -> transport.getPrice() <= money).collect(Collectors.toList());
    }
}
