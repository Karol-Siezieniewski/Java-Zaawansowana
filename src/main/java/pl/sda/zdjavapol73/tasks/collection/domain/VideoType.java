package pl.sda.zdjavapol73.tasks.collection.domain;

public enum VideoType {
    CLIP(15), PREVIEW(20), EPISODE(120);

    private final int maxDuration;

    VideoType(int maxDuration) {
        this.maxDuration = maxDuration;
    }

    public int getMaxDuration() {
        return maxDuration;
    }
}
