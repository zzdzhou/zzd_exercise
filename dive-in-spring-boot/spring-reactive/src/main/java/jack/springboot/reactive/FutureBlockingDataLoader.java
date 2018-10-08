package jack.springboot.reactive;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureBlockingDataLoader extends DataLoader {

    @Override
    protected void doLoad() {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<?>> results = new ArrayList<>();
        results.add(exec.submit(super::loadConfigurations));
        results.add(exec.submit(super::loadUsers));
        results.add(exec.submit(super::loadOrders));
        exec.shutdown();
        for (Future<?> item : results) {
            try {
                item.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new FutureBlockingDataLoader().load();
    }
}


