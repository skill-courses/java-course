package java8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        testComplete();
    }
    
    public static void testSupplyAndRun() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Hello");
        });
        future.get();
    
        CompletableFuture<String> futureSupply = CompletableFuture.supplyAsync(() -> "Hello");
        System.out.println(futureSupply.get());
    }
    
    public static void testComplete() throws ExecutionException, InterruptedException{
        CompletableFuture<String> future  = CompletableFuture.supplyAsync(() -> "Hello");
        future.complete("World");
        System.out.println(future.join());
    }
}
