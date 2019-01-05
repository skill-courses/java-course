package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {
    private static List<User> users = new ArrayList<>();
    
    public UserService() {
        User zhangsan = new User(1, "zhangsan", 123);
        User lisi  = new User(2, "lisi", 234);
        User wangwu = new User(3, "wangwu", 345);
        
        users.add(zhangsan);
        users.add(lisi);
        users.add(wangwu);
    }
    
    public User getUser(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().get();
    }
}
