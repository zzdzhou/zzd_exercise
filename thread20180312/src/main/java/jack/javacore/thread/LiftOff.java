package jack.javacore.thread;

public class LiftOff implements Runnable {
    protected int countDown = 10; //defaut
    public static int taskCount = 0;
    public int id = taskCount++;

    public LiftOff() {

    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public void run() {

    }
}
