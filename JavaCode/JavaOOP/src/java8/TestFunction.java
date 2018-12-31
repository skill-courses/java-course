package java8;

import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> square = i -> i*i;
        Function<Integer, Integer> autoIncrement = i -> ++i;
        System.out.println(calculate(autoIncrement, 5));
        System.out.println(calculate(square, 5));
    
        System.out.println(autoIncrement.compose(square).apply(5));
        System.out.println(autoIncrement.apply(square.apply(5)));
    
        System.out.println(autoIncrement.andThen(square).apply(5));
        System.out.println(square.apply(autoIncrement.apply(5)));
    }
    
    public static Integer calculate(Function<Integer, Integer> operation, Integer number) {
        return operation.apply(number);
    }
}
