package pl.sda.zdjavapol73.tasks.generic;

import pl.sda.zdjavapol73.api.Task;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class GenericTaskIndividual implements Task {

    @Override
    public void run() {
        final Consumer<Double> c = aDouble -> {};
        checkIfNotNull(c);

        final Consumer<String> c1 = System.out::println;
        checkIfNotNull(c1);

        final Consumer<BigDecimal> c2 = null;
        checkIfNotNull(c2);

        final Function<String, Double> f = Double::valueOf;
        checkIfNotNull(f);

        final Function<Integer, String> f1 = null;
        checkIfNotNull(f1);

        final Function<Double, BigDecimal> f2 = null;
        checkIfNotNull(f2);

        final Supplier<String> s = null;
        checkIfNotNull(s);

        final Supplier<Double> s1 = null;
        checkIfNotNull(s1);

        final Supplier<Object> s2 = null;
        checkIfNotNull(s2);

        final Predicate<String> p = null;
        checkIfNotNull(p);

        final Predicate<Integer> p1 = null;
        checkIfNotNull(p1);

        final Predicate<BigDecimal> p2 = null;
        checkIfNotNull(p2);
    }

    private void checkIfNotNull(Object o) {
        if (o == null) {
            throw new RuntimeException("Task failed!!!");
        }
    }
}
