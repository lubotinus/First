package com.First.testing.shape;
import java.util.ArrayList;                                    // [2]
import java.util.LinkedList;                                   // [3]
import java.util.List;
public class ShapeCollector {
  private List<Shape> shapeList = new ArrayList<>();

  public List<Shape> getshapeList() {
      return shapeList;
  }

  public void addFigure(Shape shape) {
        shapeList.add(shape);
    }
    public void removeFigure(Shape shape) {

        shapeList.remove(shape);
  }

    public Shape getFigure(int n){

      return shapeList.get(n);
    }
    public void showFigures(){
    System.out.println(shapeList.toString());
    }
}
