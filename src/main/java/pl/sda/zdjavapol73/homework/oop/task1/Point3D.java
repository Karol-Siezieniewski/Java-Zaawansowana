package pl.sda.zdjavapol73.homework.oop.task1;

import pl.sda.zdjavapol73.homework.oop.task1.Point2D;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public float[] getXYZ(){
        float[] arrayXY = new float[3];
        arrayXY[0] = this.x;
        arrayXY[1] = this.y;
        arrayXY[2] = this.z;
        return arrayXY;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void SetXYZ(float x, float y, float z){
        this.z = z;
        super.setX(x);
        super.setY(y);
    }

    @Override
    public String toString() {
        return "(" + x +
                ", " + y +
                ", " + z +
                ')';
    }
}
