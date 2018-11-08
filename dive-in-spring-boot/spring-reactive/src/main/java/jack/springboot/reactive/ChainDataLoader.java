package jack.springboot.reactive;

import java.util.concurrent.CompletableFuture;

public class ChainDataLoader extends DataLoader {

    @Override
    protected void doLoad() {
        CompletableFuture
                .runAsync(this::loadConfigurations)
                .thenRun(this::loadUsers)
                .thenRun(this::loadOrders)
                .whenComplete((r, t) -> {
                    System.out.println("[线程 : " + Thread.currentThread().getName() + "] 加载完成");
                })
                .join();
    }

    public static void main(String[] args) {
        new ChainDataLoader().load();
    }
}
