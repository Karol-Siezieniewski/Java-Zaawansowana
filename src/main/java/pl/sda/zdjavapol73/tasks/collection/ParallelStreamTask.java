package pl.sda.zdjavapol73.tasks.collection;

import pl.sda.zdjavapol73.api.Task;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamTask implements Task {
    @Override
    public void run() {
        example1();
//        example2();
    }

    private void example1() {
        Collection<String> strings = Arrays.asList("Ala ma kota o imieniu Kotosław".split(" "));
        Stream<String> stringStream = strings.parallelStream();
        System.out.println("Is stream parallel -> " + stringStream.isParallel());
        final Collection<String> result = stringStream
                .sorted()
                .map(e -> {
                    System.out.println(Thread.currentThread() + " -> going to map value " + e);
                    return e.toUpperCase();
                })
                .collect(Collectors.toList());
        System.out.println("Result -> " + result);
    }

    private void example2() {
        final Collection<Integer> ints = new ArrayList<>();
        final Random random = new Random();

        for (int i = 0; i < 1_000_000; i++) {
            ints.add(random.nextInt(10));
        }

        final long start = System.currentTimeMillis();
        Stream<Integer> stream = ints.parallelStream();
        System.out.println("stream.isParallel() -> " + stream.isParallel());
        final Optional<Double> result = stream
                .map(v -> Math.pow(v, 3))
                .findFirst();
        final long end = System.currentTimeMillis();

        System.out.println("result.isPresent() -> " + result.isPresent());
        System.out.println("Time(ms): " + (end - start));
    }
}
