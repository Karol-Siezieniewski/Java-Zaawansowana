package pl.sda.zdjavapol73.tasks.functional;

public class TransformableString {
    private final String content;

    public TransformableString(String content) {
        this.content = content;
    }

    public TransformableString transform(StringTransformator transformator) {
        return new TransformableString(transformator.transform(content));
    }

    @Override
    public String toString() {
        return content;
    }
}
