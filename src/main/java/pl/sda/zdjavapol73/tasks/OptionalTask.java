package pl.sda.zdjavapol73.tasks;

import pl.sda.zdjavapol73.api.Task;

import java.util.Optional;

public class OptionalTask implements Task {
    @Override
    public void run() {
        final Optional<Integer> optionalInt = Optional.of(10);
        final int value = optionalInt.map(v -> {
            System.out.println("Map optional");
            return v * v;
        }).orElse(0);

        System.out.println("value -> " + value);
    }
}
