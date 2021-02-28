package pl.sda.zdjavapol73.tasks.collection.domain;

import java.util.ArrayList;
import java.util.Collection;

public class Episode {
    private final String episodeName;
    private final int episodeNumber;
    private final Collection<Video> videos;

    public Episode(String episodeName, int episodeNumber, Collection<Video> videos) {
        this.episodeName = episodeName;
        this.episodeNumber = episodeNumber;
        this.videos = videos;
    }

    public Collection<Video> getVideos() {
        return new ArrayList<>(videos);
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    @Override
    public String toString() {
        return "Episode{" + "episodeName='" + episodeName + '\'' + ", episodeNumber=" + episodeNumber + ", videos=\n" +
                videos + '}';
    }
}
