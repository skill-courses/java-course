package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(8);
        integers.add(1);
        integers.add(5);
        integers.add(3);
        integers.add(9);
        
        integers.stream().sorted(Comparator.naturalOrder()).filter(i -> i % 2 == 0)
        .forEach(System.out::println);
    }
}
