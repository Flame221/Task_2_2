package com.company;

public interface lTriangle extends l2dGeometricFigure {
    public abstract int getTriangleRatio(float array[]);

    public boolean exists(float array[]);

    public static final int TYPE_USUAL = 0; //обычный
    public static final int TYPE_ISOSCELES = 1; //равнобедренный
    public static final int TYPE_EQUILATERAL = 2; //Равносторонний
}
