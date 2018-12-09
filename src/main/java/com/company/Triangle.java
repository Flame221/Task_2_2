package com.company;

import java.util.Scanner;

import static oracle.jrockit.jfr.events.Bits.intValue;

public class Triangle implements lTriangle {
    public static void main(String[] args) {
    }

    @Override
    public float calcArea(float[] a) {
        float b = a[0];
        for (int i = 1; i < 4; i++) {
        }
        intValue(b);
        return b;
    }


    public int getTriangleRatio(float array[]) {
        if (exists(array)) {
            if (array[0] == array[1] && array[1] == array[2]) {
                return TYPE_EQUILATERAL;
            } else if (array[0] == array[1] || array[1] == array[2] || array[0] == array[2]) {
                return TYPE_ISOSCELES;
            } else {
                return TYPE_USUAL;
            }
        } else {
            return -1;
        }
    }

    public boolean exists(float array[]) {
        if (array[0] + array[1] >= array[2]) {
            return false;
        } else if (array[0] + array[2] >= array[1]) {
            return false;
        } else if (array[2] + array[1] >= array[0]) {
            return false;
        } else {
            return true;
        }
    }

    public float calcPerimeter(float[] a) {
        float b = 0;
        for (int i = 0; i < 3; i++) {
            b += a[i];
        }
        intValue(b);
        return b;
    }

    public float[] GetSizes() {
        Scanner input = new Scanner(System.in);
        float array[] = new float[3];
        System.out.println("Insert sides of a triangle:");
        for (int i = 0; i < 3; i++) {
            array[i] = input.nextFloat();
            if (array[i] < 0) {
                System.out.println("Your side < 0");
                break;
            }
        }
        return array;
    }
}