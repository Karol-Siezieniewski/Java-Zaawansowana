package pl.sda.zdjavapol73.tasks.collection.domain;

import java.util.ArrayList;
import java.util.Collection;

public class Season {
    private final String seasonName;
    private final int seasonNumber;
    private final Collection<Episode> episodes;

    public Season(String seasonName, int seasonNumber, Collection<Episode> episodes) {
        this.seasonName = seasonName;
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public Collection<Episode> getEpisodes() {
        return new ArrayList<>(episodes);
    }

    @Override
    public String toString() {
        return "Season{" + "seasonName='" + seasonName + '\'' + ", seasonNumber=" + seasonNumber + ", episodes=\n" +
                episodes + '}';
    }
}
