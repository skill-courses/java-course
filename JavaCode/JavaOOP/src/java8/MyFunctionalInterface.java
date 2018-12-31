package java8;

@FunctionalInterface
public interface MyFunctionalInterface {
    void abstractMethod();
    default void defaultMethod() {
        //implement code
    }
    static void staticMethod() {
        //implement code
    }
}
