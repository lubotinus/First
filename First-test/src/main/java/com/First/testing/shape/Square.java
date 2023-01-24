package com.First.testing.shape;

public class Square implements Shape{
    private int length;
    private final static String name = "Square";
    public Square (int length){
        this.length=length;
    }
    @Override
    public String getShapeName() {
        return name;

    }

    @Override
    public double getField() {
        return length*length;
    }
}
