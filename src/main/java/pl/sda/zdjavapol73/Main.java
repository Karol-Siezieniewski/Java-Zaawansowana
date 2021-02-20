package pl.sda.zdjavapol73;

import pl.sda.zdjavapol73.api.Task;
import pl.sda.zdjavapol73.tasks.individual.DateTimeIndividual;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Task> tasks = new ArrayList<>();
        //        tasks.add(new DateAndTime());
        //        tasks.add(new RegularExpressions());
        tasks.add(new DateTimeIndividual());

        for (Task task : tasks) {
            task.run();
        }

        //        System.out.println(new Random().nextInt(18) + 1);
    }
}
