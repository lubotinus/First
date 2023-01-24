package com.First.testing.shape;
import com.First.testing.shape.ShapeCollector;
        import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;
@DisplayName("TDD: Test shape suite")
public class ShapeCollectionTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void addFigureTest(){
    //Given
        ShapeCollector shapeCollector = new ShapeCollector();
    //When
        Shape shapeAdd = new Circle(10);
        shapeCollector.addFigure(shapeAdd);
        // Then
        Assertions.assertEquals(1, shapeCollector.getshapeList().size());
    }

    @Test
    void removeFigureTest(){
//Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        Shape shapeOff = new Circle(10);
        shapeCollector.removeFigure(shapeOff);
        //Then
        Assertions.assertEquals(0, shapeCollector.getshapeList().size());
    }

    @Test
    void getFigureTest(){
//Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape exceptionResult1 = new Circle(10);
        Shape exceptionResult2 = new Square(10);

        //When
        shapeCollector.addFigure(exceptionResult1);
        shapeCollector.addFigure(exceptionResult2);

        Shape result = shapeCollector.getFigure(0);

        //Then
        Assertions.assertEquals(exceptionResult1, result);
    }
    @Test
    void showFiguresTest(){
//Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(10);
        Shape square=new Square(10);
        Shape triangle = new Triangle(10);

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        ArrayList<Shape> exceptshapeList = new ArrayList<>();
        exceptshapeList.add(circle);
        exceptshapeList.add(square);
        exceptshapeList.add(triangle);

        //When

        List<Shape> result = shapeCollector.getshapeList();
                 //Then
        Assertions.assertEquals(exceptshapeList.toString(), result.toString());
    }
}
