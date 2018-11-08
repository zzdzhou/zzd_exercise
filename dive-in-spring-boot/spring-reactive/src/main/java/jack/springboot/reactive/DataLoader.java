package jack.springboot.reactive;

import java.util.concurrent.TimeUnit;

public class DataLoader {

    public final void load() {
        long startTime = System.currentTimeMillis(); // 开始时间
        doLoad(); // 具体执行
        long costTime = System.currentTimeMillis() - startTime; // 消耗时间
        System.out.println("load() 总耗时：" + costTime + " 毫秒");
    }

    protected void doLoad() { // 串行计算
        loadConfigurations(); // 耗时 1s
        loadUsers(); // 耗时 2s
        loadOrders(); // 耗时 3s
    } // 总耗时 1s + 2s + 3s = 6s

    protected final void loadConfigurations() {
//        System.out.println("log loadConfigurations()");
        loadMock("loadConfigurations()", 1);
    }

    protected final void loadUsers() {
//        System.out.println("log loadUsers()");
        loadMock("loadUsers()", 2);
    }

    protected final void loadOrders() {
//        System.out.println("log loadOrders()");
        loadMock("loadOrders()", 3);
    }

    private void loadMock(String source, int seconds) {
        try {
            long startTime = System.currentTimeMillis();
            long milliseconds = TimeUnit.SECONDS.toMillis(seconds);
//            System.out.println("log begin to sleep");
            Thread.sleep(milliseconds);
//            System.out.println("log stop sleeping");
            long costTime = System.currentTimeMillis() - startTime;
            System.out.printf("[线程 : %s] %s 耗时 : %d 毫秒\n",
                    Thread.currentThread().getName(), source, costTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new DataLoader().load();
    }


}
