package pl.sda.zdjavapol73.tasks.collection;

import pl.sda.zdjavapol73.api.Task;
import pl.sda.zdjavapol73.tasks.collection.domain.Episode;
import pl.sda.zdjavapol73.tasks.collection.domain.Season;
import pl.sda.zdjavapol73.tasks.collection.domain.Video;
import pl.sda.zdjavapol73.tasks.collection.domain.VideoType;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class StreamsTask implements Task {

    private final Collection<Season> seasons;

    public StreamsTask() {
        Video video = new Video("GOT1", "got1.com", VideoType.CLIP);
        Video video1 = new Video("GOT2", "got2.com", VideoType.EPISODE);
        Video video2 = new Video("GOT3", "got3.com", VideoType.PREVIEW);
        Video video3 = new Video("GOT4", "got4.com", VideoType.PREVIEW);
        Video video4 = new Video("GOT5", "got5.com", VideoType.CLIP);
        Video video5 = new Video("GOT6", "got6.com", VideoType.EPISODE);

        Episode episode = new Episode("got1", 1, Arrays.asList(video, video1));
        Episode episode1 = new Episode("got2", 2, Arrays.asList(video2, video3));
        Episode episode2 = new Episode("got3", 3, Arrays.asList(video4, video5));

        Season season = new Season("GOTS1", 1, Arrays.asList(episode, episode1));
        Season season1 = new Season("GOTS2", 2, Collections.singletonList(episode2));

        seasons = Arrays.asList(season, season1);
    }

    @Override
    public void run() {
        seasons.forEach(System.out::println);

        Collection<Episode> episodes = listOfEpisodes();
        System.out.println("List of episodes(" + episodes.size() + "):");
        System.out.println(episodes);
    }

    private Collection<Episode> listOfEpisodes() {
        return seasons.stream() // stream of Season [Season, Season]
                .flatMap(season -> season.getEpisodes().stream()) // stream of Episode [Episode, Episode, Episode]
                .collect(Collectors.toList());
    }

    private Collection<Video> listOfVideos() {
        return null;
    }

    private Collection<String> listOfSeasonNames() {
        return null;
    }

    private Collection<Integer> listOfSeasonNumber() {
        return null;
    }

    private Collection<String> listOfEpisodeNames() {
        return null;
    }

    private Collection<Integer> listOfEpisodeNumbers() {
        return null;
    }

    private Collection<String> listOfVideoNames() {
        return null;
    }
    private Collection<String> listOfVideoUrls() {
        return null;
    }

    private Collection<Episode> listOfEpisodeFromEvenSeasons() {
        return null;
    }

    private Collection<Video> listOfVideosFromEvenSeasons() {
        return null;
    }

    private Collection<Video> listOfVideosFromEvenSeasonsAndEpisodes() {
        return null;
    }

    private Collection<Video> listOfClipVideosFromEvenEpisodesAndOddSeasons() {
        return null;
    }

    private Collection<Video> listOfPreviewVideosFromOddEpisodesAndEvenSeasons() {
        return null;
    }
}
