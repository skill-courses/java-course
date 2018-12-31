package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(8);
        integers.add(1);
        integers.add(5);
        integers.add(3);
        integers.add(9);
        
        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        
        integers.forEach(integer -> {
            System.out.println(integer);
        });
    }
}
