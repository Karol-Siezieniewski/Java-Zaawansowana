package pl.sda.zdjavapol73.tasks.functional;

@FunctionalInterface
public interface StringTransformator {
    String executeTransformation(String stringToTransform);
}

//  String (String);
// (argument) -> String