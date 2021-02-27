package pl.sda.zdjavapol73;

import pl.sda.zdjavapol73.api.Task;
import pl.sda.zdjavapol73.tasks.functional.FunctionalTask2;
import pl.sda.zdjavapol73.tasks.generic.GenericTask;
import pl.sda.zdjavapol73.tasks.generic.GenericTaskIndividual;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Collection<Task> tasks = new ArrayList<>();
        //                tasks.add(new DateAndTime());
        //        tasks.add(new RegularExpressions());
        //        tasks.add(new DateTimeIndividual());
        //        tasks.add(new RegularExpressions());
        //        tasks.add(new FileReader());
        //        tasks.add(new FileReaderIndividual());
        //        tasks.add(new FileWriter());
        //        tasks.add(new ReadWrite());
        //        tasks.add(new FunctionalTask());
//        tasks.add(new FunctionalTask2());
        tasks.add(new GenericTaskIndividual());

        for (Task task : tasks) {
            task.run();
        }

        //        System.out.println(new Random().nextInt(18) + 1);

        //        final String[] strings = {"To", "jest", "przykład"};

        /*for (String string : strings) {
            System.out.println(string);
        }*/

    }
}
