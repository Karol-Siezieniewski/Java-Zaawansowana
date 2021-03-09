package pl.sda.zdjavapol73.tasks.functional;

import pl.sda.zdjavapol73.api.Task;

public class FunctionalTask2 implements Task {

    @Override
    public void run() {

        final TransformableString transformableString = new TransformableString("SDA");
        System.out.println(transformableString);

        StringTransformator transformator = new StringTransformator() {
            @Override
            public String executeTransformation(String stringToTransform) {
                return "";
            }
        };


        final TransformableString transformableString1 = transformableString.transform(stringToTransform -> "");
        System.out.println(transformableString1);

        final TransformableString transformableString2 = transformableString.transform(t -> t.toLowerCase());
        final TransformableString transformableString3 = transformableString.transform(String::toLowerCase);

        System.out.println(transformableString2);
    }
}
