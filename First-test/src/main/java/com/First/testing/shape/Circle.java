package com.First.testing.shape;

public class Circle implements Shape {
    private int radius;
    private final static String name = "Circle";

    public Circle (int radius) {
        this.radius=radius;
    }
    @Override
        public double getField() {
        return Math.PI*radius*radius;
        }
        public String getShapeName(){
        return name;
        }
    }

