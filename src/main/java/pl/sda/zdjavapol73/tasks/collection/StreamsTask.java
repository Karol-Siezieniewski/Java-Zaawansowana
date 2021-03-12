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
        Episode episode3 = new Episode("got3", 4, Arrays.asList(video4, video5));

        Season season = new Season("GOTS1", 1, Arrays.asList(episode, episode1));
        Season season1 = new Season("GOTS2", 2, Arrays.asList(episode2, episode3));

        seasons = Arrays.asList(season, season1);
    }

    @Override
    public void run() {
        // seasons.forEach(System.out::println);

        Collection<Episode> episodes = listOfEpisodes();
        System.out.println("List of episodes(" + episodes.size() + "):");
        System.out.println(episodes + "\n");

        Collection<Video> videos = listOfVideos();
        System.out.println("List of videos(" + videos.size() + "):");
        System.out.println(videos + "\n");

        Collection<String> seasonNames = listOfSeasonNames();
        System.out.println("List of season names(" + seasonNames.size() + "):");
        System.out.println(seasonNames + "\n");

        Collection<Integer> seasonNumbers = listOfSeasonNumber();
        System.out.println("List of season numbers(" + seasonNumbers.size() + "):");
        System.out.println(seasonNumbers + "\n");

        Collection<String> episodeNames = listOfEpisodeNames();
        System.out.println("List of episode names(" + episodeNames.size() + "):");
        System.out.println(episodeNames + "\n");

        Collection<Integer> episodeNumbers = listOfEpisodeNumbers();
        System.out.println("List of episode numbers(" + episodeNumbers.size() + "):");
        System.out.println(episodeNumbers + "\n");

        Collection<String> videoTitles = listOfVideoNames();
        System.out.println("List of video titles(" + videoTitles.size() + "):");
        System.out.println(videoTitles + "\n");

        Collection<String> videoUrls = listOfVideoUrls();
        System.out.println("List of video urls(" + videoUrls.size() + "):");
        System.out.println(videoUrls + "\n");

        Collection<Episode> episodesFromEvenSeasons = listOfEpisodeFromEvenSeasons();
        System.out.println("List of episodes from even seasons(" + episodesFromEvenSeasons.size() + "):");
        System.out.println(episodesFromEvenSeasons + "\n");

        Collection<Video> videosFromEvenSeasons = listOfVideosFromEvenSeasons();
        System.out.println("List of videos from even seasons(" + videosFromEvenSeasons.size() + "):");
        System.out.println(videosFromEvenSeasons + "\n");

        Collection<Video> videosFromEvenSeasonsAndEpisodes = listOfVideosFromEvenSeasonsAndEpisodes();
        System.out.println("List of videos from even seasons and episodes(" + videosFromEvenSeasonsAndEpisodes.size() + "):");
        System.out.println(videosFromEvenSeasonsAndEpisodes + "\n");

        Collection<Video> clipVideosFromEvenEpisodesAndOddSeasons = listOfClipVideosFromEvenEpisodesAndOddSeasons();
        System.out.println("List of clip videos from even episodes and odd seasons(" + clipVideosFromEvenEpisodesAndOddSeasons.size() + "):");
        System.out.println(clipVideosFromEvenEpisodesAndOddSeasons + "\n");

        Collection<Video> previewVideosFromOddEpisodesAndEvenSeasons = listOfPreviewVideosFromOddEpisodesAndEvenSeasons();
        System.out.println("List of preview videos from odd episodes and even seasons(" + previewVideosFromOddEpisodesAndEvenSeasons.size() + "):");
        System.out.println(previewVideosFromOddEpisodesAndEvenSeasons + "\n");
    }

    private Collection<Episode> listOfEpisodes() {
        return seasons.stream() // stream of Season [Season, Season]
                .flatMap(season -> season.getEpisodes().stream()) // stream of Episode [Episode, Episode, Episode]
                .collect(Collectors.toList());
    }

    private Collection<Video> listOfVideos() {
        return seasons.stream()
                .flatMap(season -> season.getEpisodes().stream())
                .flatMap(episode -> episode.getVideos().stream())
                .collect(Collectors.toList());
    }

    private Collection<String> listOfSeasonNames() {
        return seasons.stream()
                .map(Season::getSeasonName)
                .collect(Collectors.toList());
    }

    private Collection<Integer> listOfSeasonNumber() {
        return seasons.stream()
                .map(Season::getSeasonNumber)
                .collect(Collectors.toList());
    }

    private Collection<String> listOfEpisodeNames() {
        return seasons.stream()
                .flatMap(season -> season.getEpisodes().stream())
                .map(Episode::getEpisodeName)
                .collect(Collectors.toList());
    }

    private Collection<Integer> listOfEpisodeNumbers() {
        return seasons.stream()
                .flatMap(season -> season.getEpisodes().stream())
                .map(Episode::getEpisodeNumber)
                .collect(Collectors.toList());
    }

    private Collection<String> listOfVideoNames() {
        return listOfVideos().stream()
                .map(Video::getTitle)
                .collect(Collectors.toList());
    }

    private Collection<String> listOfVideoUrls() {
        return listOfVideos().stream()
                .map(Video::getUrl)
                .collect(Collectors.toList());
    }

    private Collection<Episode> listOfEpisodeFromEvenSeasons() {
        return seasons.stream()
                .filter(season -> season.getSeasonNumber() % 2 == 0)
                .flatMap(season -> season.getEpisodes().stream())
                .collect(Collectors.toList());
    }

    private Collection<Video> listOfVideosFromEvenSeasons() {
        return seasons.stream()
                .filter(season -> season.getSeasonNumber() % 2 == 0)
                .flatMap(season -> season.getEpisodes().stream())
                .flatMap(episode -> episode.getVideos().stream())
                .collect(Collectors.toList());
    }

    private Collection<Video> listOfVideosFromEvenSeasonsAndEpisodes() {
        return seasons.stream()
                .filter(season -> season.getSeasonNumber() % 2 == 0)
                .flatMap(season -> season.getEpisodes().stream())
                .filter(episode -> episode.getEpisodeNumber() % 2 == 0)
                .flatMap(episode -> episode.getVideos().stream())
                .collect(Collectors.toList());
    }

    private Collection<Video> listOfClipVideosFromEvenEpisodesAndOddSeasons() {
        return seasons.stream()
                .filter(season -> season.getSeasonNumber() % 2 != 0)
                .flatMap(season -> season.getEpisodes().stream())
                .filter(episode -> episode.getEpisodeNumber() % 2 == 0)
                .flatMap(episode -> episode.getVideos().stream())
                .filter(video -> video.getVideoType().equals(VideoType.CLIP))
                .collect(Collectors.toList());
    }

    private Collection<Video> listOfPreviewVideosFromOddEpisodesAndEvenSeasons() {
        return seasons.stream()
                .filter(season -> season.getSeasonNumber() % 2 == 0)
                .flatMap(season -> season.getEpisodes().stream())
                .filter(episode -> episode.getEpisodeNumber() % 2 != 0)
                .flatMap(episode -> episode.getVideos().stream())
                .filter(video -> video.getVideoType().equals(VideoType.PREVIEW))
                .collect(Collectors.toList());
    }
}
