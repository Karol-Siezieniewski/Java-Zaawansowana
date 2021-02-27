package pl.sda.zdjavapol73.tasks.functional;

public class TransformableString {
    private final String content;

    public TransformableString(String content) {
        this.content = content;
    }

    public TransformableString transform(StringTransformator transformator) {
        String newContent = transformator.executeTransformation(this.content);
        return new TransformableString(newContent);
    }

    @Override
    public String toString() {
        return content;
    }
}
