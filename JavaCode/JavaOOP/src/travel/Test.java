package travel;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        List<Transport> transports = context.getChoosedTransport(500);
        System.out.println("小明可以选择下面的交通工具：");
        transports.forEach(transport -> System.out.println(transport.getName()));
    }
}
