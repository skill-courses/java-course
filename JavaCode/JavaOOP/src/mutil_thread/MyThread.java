package mutil_thread;

public class MyThread implements Runnable {
    
    private String name;
    
    public MyThread(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.println(this.name + " is running!");
    }
}
