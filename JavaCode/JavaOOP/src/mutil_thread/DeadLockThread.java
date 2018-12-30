package mutil_thread;

public class DeadLockThread implements Runnable {
    private String firstChopsticks;
    private String secondChopsticks;
    
    public DeadLockThread(String firstChopsticks, String secondChopsticks) {
        this.firstChopsticks = firstChopsticks;
        this.secondChopsticks = secondChopsticks;
    }
    
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " 准备使用 " + firstChopsticks);
        synchronized (firstChopsticks) {
            System.out.println(name + " 已经使用 " + firstChopsticks);
            work();
            System.out.println(name + " 准备使用 " + secondChopsticks);
            synchronized (secondChopsticks) {
                System.out.println(name + " 已经使用 " + secondChopsticks);
                work();
            }
            System.out.println(name + " 准备使用 " + secondChopsticks);
        }
        System.out.println(name + " 已经使用 " + firstChopsticks);
        System.out.println(name + " 完成就餐");
    }
    private void work() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
