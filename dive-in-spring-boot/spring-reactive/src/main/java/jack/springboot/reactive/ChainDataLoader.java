package jack.springboot.reactive;

import java.util.concurrent.CompletableFuture;

public class ChainDataLoader extends DataLoader {

    @Override
    protected void doLoad() {
        CompletableFuture
                .runAsync(this::loadConfigurations)
                .thenRun(this::loadUsers)
                .thenRun(this::loadOrders)
                .whenComplete(() -> )
    }
}
