package pl.sda.zdjavapol73.tasks;

import pl.sda.zdjavapol73.api.Task;
import pl.sda.zdjavapol73.tasks.collection.domain.VideoType;

import java.util.Arrays;
import java.util.function.Consumer;

public class EnumTask implements Task {
    @Override
    public void run() {
        final VideoType clip = VideoType.CLIP;
        System.out.println("name -> " + clip.name());
        System.out.println("ordinal -> " + clip.ordinal());
        System.out.println("maxDuration -> " + clip.getMaxDuration());
        Consumer<VideoType> c1 = System.out::println;
        Arrays.stream(VideoType.values())
                .forEach(c1.andThen(videoType -> System.out.println(videoType.getMaxDuration())));
    }
}
