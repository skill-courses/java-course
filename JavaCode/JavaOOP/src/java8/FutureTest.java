package java8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<String> future = executor.submit(() -> {
            System.out.println("running task");
            Thread.sleep(1000);
            return "complete task";
        });
    
        String result = future.get();
        System.out.println(result);
        executor.shutdown();
    }
}
