package pl.sda.zdjavapol73.tasks.individual;

import pl.sda.zdjavapol73.api.Task;

import java.time.ZonedDateTime;

public class DateTimeIndividual implements Task {
    // user1 (create post) - Asia/Aden
    // user2 (read post) - America/Noronha
    // server - UTC

    @Override
    public void run() {
        // create ZonedDateTime 15.12.2015 21:47 in zone Asia/Aden
        ZonedDateTime timeInAsiaAden = ZonedDateTime.now();

        // convert this time to UTC
        ZonedDateTime timeInUtc = ZonedDateTime.now();

        // UTC convert to zone America/Noronha
        ZonedDateTime timeInAmericaNoronha = ZonedDateTime.now();

        if (timeInAsiaAden.isEqual(timeInUtc) && timeInAmericaNoronha.isEqual(timeInUtc)) {
            System.out.println("Success!!!");
        } else {
            System.out.println("Try again...");
        }
    }
}
