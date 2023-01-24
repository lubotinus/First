package com.First.testing.shape;

public class Triangle implements Shape {

   private int side;
   private final static String name="Triangle";

   public Triangle(int side){
       this.side=side;
   }
    @Override
    public String getShapeName() {
    return name;
    }

    @Override
    public double getField() {
        return side*(side/2);
    }
}
