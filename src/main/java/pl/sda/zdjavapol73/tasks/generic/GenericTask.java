package pl.sda.zdjavapol73.tasks.generic;

import pl.sda.zdjavapol73.api.Task;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class GenericTask implements Task {
    @Override
    public void run() {
        System.out.println("10 - 5 = " + Subtractor.subtract(10, 5));
        System.out.println("3.14 - 5.12 = " + Subtractor.subtract(3.14, 5.12));
        System.out.println("BigDecimal(3.14) - BigDecimal(5.12) = " +
                Subtractor.subtract(new BigDecimal("3.14"), new BigDecimal("5.12")));

        final Consumer<String> c = (String t) -> {};
    }
}
