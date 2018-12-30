package mutil_thread;

public class ThreadTest {
    public static void main(String[] args) {
        createThreadByThread();
    }
    
    public static void createThreadByThread() {
        Thread thread = new MineThread("my_thread");
        thread.start();
    }
    
    public static void createThreadByRunnable() {
        MyThread myThread = new MyThread("my_thread");
        Thread thread = new Thread(myThread);
        thread.start();
    }
}
