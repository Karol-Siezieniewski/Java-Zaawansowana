package pl.sda.zdjavapol73.tasks.collection;

import pl.sda.zdjavapol73.api.Task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionTask implements Task {

    private final Random random = new Random();

    @Override
    public void run() {
        //collectionBasics();

        collectionIteration();
    }

    private void collectionBasics() {
        final Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Django"));
        Movie joker = new Movie("Joker");
        System.out.println("joker hash: " + joker.hashCode());
        movies.add(joker);

        movies.removeIf(movie -> movie.getTitle().startsWith("J"));

        Movie joker1 = new Movie("Joker");
        System.out.println("joker1 hash: " + joker1.hashCode());
        if (movies.contains(joker1)) {
            System.out.println("Joker is in movies");
        } else {
            System.out.println("Joker isn't in movies");
        }
    }

    private void collectionIteration() {
        final Collection<Integer> ints = new ArrayList<>(100);
        System.out.println("Size of collection before loop: " + ints.size());

        for (int i = 0; i < 100; i++) {
            ints.add(random.nextInt(10));
        }

        System.out.println("Size of collection after loop: " + ints.size());

        printCollection(ints.stream());

        System.out.println("After filtration");
        ints.stream().filter(num -> num % 2 == 0).map(num -> Math.pow(num, 2)).distinct().sorted()
                .forEach(num -> System.out.print(num + " "));
        // TODO: przefiltrowac parzyste wartosci, podniesc przefiltrowane wartosci do kwadratu
        // przefiltrowac unikalne wartosci
        // posortowac od najmniejszej do najwiekszej
        // wynik wypisac na ekranie
        final Collection<Double> filteredInts = new HashSet<>();
        for (int num: ints) {
            filteredInts.add(0.0);
        }
    }

    private void printCollection(Stream<Integer> ints) {
        ints.forEach(num -> System.out.print(num + " "));
        System.out.println();
    }
}
