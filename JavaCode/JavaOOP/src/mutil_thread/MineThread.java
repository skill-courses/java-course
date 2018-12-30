package mutil_thread;

public class MineThread extends Thread {
    private String name;
    public MineThread(String name) {
        super(name);
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.println(this.name + " is running!");
    }
}
