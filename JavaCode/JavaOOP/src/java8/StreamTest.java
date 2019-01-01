package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        streamSum();
    }
    
    public static Stream createStreamByOf() {
        return Stream.of("a", "b", "c");
    }
    
    public static Stream createStreamByArray() {
        String[] strs = new String[]{"a", "b", "c"};
        return Arrays.stream(strs);
    }
    
    public static Stream createStreamByCollection() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        return list.stream();
    }
    
    public static void streamIterator() {
        Stream stream = Stream.of("a", "b", "c");
        Iterator it = stream.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    public static void streamForEach() {
        Stream stream = Stream.of("a", "b", "c");
        stream.forEach(System.out::println);
    }
    
    public static void streamFilter() {
        Stream<String> stream = Stream.of("One", "OneAndOnly", "Derek", "Change", "factory", "justBefore", "Italy", "Thursday", "");
        Stream newStream = stream.filter(element ->  element.contains("d"));
    }
    
    public static void streamMap() {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        Stream<Integer> newStream = stream.map(n -> n * n);
    }
    
    public static void streamFlatMap() {
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));
        Stream newStream = stream.flatMap(element -> element.stream());
    }
    
    public static void streamFind() {
        Stream<String> stream = Stream.of("One", "OneAndOnly", "Derek", "Change", "factory", "justBefore", "Italy", "Thursday", "");
        Optional<String> str = stream.filter(element ->  element.contains("d")).skip(1).findFirst();
        str.ifPresent(System.out::println);
    }
    
    public static void streamSum() {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        Integer sum = stream.reduce(0, (a, b) -> a +b);
        System.out.println(sum);
    }
    
    public static void collectionStream() {
        Stream<Production> productionStream = Stream.of(new Production(1, "jacket",200),
                new Production(2, "sweater", 150), new Production(3, "trousers", 300));
        List<String> names = productionStream.map(Production::getName).collect(Collectors.toList());
        Map<Integer, String> idToNameMap = productionStream.collect(Collectors.toMap(Production::getId, Production::getName));
        String listToString = productionStream.map(Production::getName)
                .collect(Collectors.joining(", ", "[", "]"));
        double averagePrice = productionStream.collect(Collectors.averagingInt(Production::getPrice));
    }
}
