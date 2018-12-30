package mutil_thread;

public class DeadLockTest {
    public static void main(String[] args) throws InterruptedException {
        String firstChopsticks = "第一支筷子";
        String secondChopsticks = "第二支筷子";
        
        Thread t1 = new Thread(new DeadLockThread(firstChopsticks, secondChopsticks), "甲");
        Thread t2 = new Thread(new DeadLockThread(secondChopsticks, firstChopsticks), "乙");
        
        t1.start();
        Thread.sleep(5000);
        t2.start();
        Thread.sleep(5000);
    }
}
