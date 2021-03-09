package pl.sda.zdjavapol73.tasks.collection;

import pl.sda.zdjavapol73.api.Task;
import pl.sda.zdjavapol73.tasks.collection.domain.Episode;
import pl.sda.zdjavapol73.tasks.collection.domain.Season;
import pl.sda.zdjavapol73.tasks.collection.domain.Video;
import pl.sda.zdjavapol73.tasks.collection.domain.VideoType;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
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
        Episode episode3 = new Episode("got3", 4, Arrays.asList(video4, video5));

        Season season = new Season("GOTS1", 1, Arrays.asList(episode, episode1));
        Season season1 = new Season("GOTS2", 2, Arrays.asList(episode2));

        seasons = Arrays.asList(season, season1);
    }

    @Override
    public void run() {
        seasons.forEach(System.out::println);

        Collection<Episode> episodes = listOfEpisodes();
        System.out.println("List of episodes(" + episodes.size() + "):");
        System.out.println(episodes);

        Collection<String> namesOfVideos = listOfVideoNames();
        System.out.println("List of video names(" + namesOfVideos.size() + "):");
        System.out.println(namesOfVideos);

        System.out.println("OPTIONAL");
        final String givenName = "GOT1";
        findVideoByName(givenName).ifPresentOrElse(
                video -> System.out.println("found video: " + video),
                () -> System.out.println("No video with given name was found."));
    }

    private Collection<Episode> listOfEpisodes() {
        return seasons.stream() // stream of Season [Season, Season]
                .flatMap(season -> season.getEpisodes().stream()) // stream of Episode [Episode, Episode, Episode]
                .collect(Collectors.toList());
    }

    private Collection<Video> listOfVideos() {
        return seasons.stream().flatMap(s -> s.getEpisodes().stream()).flatMap(episode -> episode.getVideos().stream())
                .collect(Collectors.toList());
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
        return listOfVideos().stream().map(Video::getTitle).collect(Collectors.toList());
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
        return seasons.stream().filter(season -> season.getSeasonNumber() % 2 == 0)
                .flatMap(season -> season.getEpisodes().stream()).filter(episode -> episode.getEpisodeNumber() % 2 == 0)
                .flatMap(episode -> episode.getVideos().stream()).collect(Collectors.toList());
    }

    private Collection<Video> listOfClipVideosFromEvenEpisodesAndOddSeasons() {
        return null;
    }

    private Collection<Video> listOfPreviewVideosFromOddEpisodesAndEvenSeasons() {
        return null;
    }

    private Optional<Video> findVideoByName(String name) {
        return listOfVideos().stream()
                .filter(video -> video.getTitle().equals(name))
                .findFirst();
    }
}
