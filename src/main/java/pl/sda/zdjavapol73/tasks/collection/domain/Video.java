package pl.sda.zdjavapol73.tasks.collection.domain;

public class Video {
    private final String title;
    private final String url;
    private final VideoType videoType;

    public Video(String title, String url, VideoType videoType) {
        this.title = title;
        this.url = url;
        this.videoType = videoType;
    }

    public VideoType getVideoType() {
        return videoType;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Video{" + "title='" + title + '\'' + ", url='" + url + '\'' + ", videoType=" + videoType + '}';
    }
}
