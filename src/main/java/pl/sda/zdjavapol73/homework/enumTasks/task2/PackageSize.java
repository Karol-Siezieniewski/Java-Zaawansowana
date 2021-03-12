package pl.sda.zdjavapol73.homework.enumTasks.task2;

public enum PackageSize {
    SMALL(0, 40), MEDIUM(40, 70), LARGE(70, 100);

    int minSize;
    int maxSize;

    PackageSize(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    public static PackageSize getPackageSize(int minSize, int maxSize){
        for(PackageSize packageSize : PackageSize.values()){
            if(minSize >= packageSize.minSize && maxSize <= packageSize.maxSize)
                return packageSize;
        }
        return null;
    }
}
