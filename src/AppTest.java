import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
    private Rectangle rect; private Circle circ; private Triangle tria; private Cuboid cub; private Cylinder cyl; private ThreeDConverter convThreeD; private TwoDConverter convTwoD; private Rhombus rhom;

    @Before
    public void initialize(){
        rect = new Rectangle(5, 3);
        circ = new Circle(10);
        cub = new Cuboid(5, 3, 5);
        cyl = new Cylinder(5, 3);
        convThreeD = new ThreeDConverter(cyl.printVolume());
    }


    //Valid Tests
    @Test
    public void rectangleAreaCalculation(){
        assertEquals(15.00, rect.printArea(), 0);
    }

    @Test
    public void circleCreation(){
        assertNotNull(circ);
    }

    @Test
    public void inheritanceCheck(){
        assertTrue(Shape.class.isAssignableFrom(Triangle.class));
    }

    @Test
    public void cuboidCreation(){
        assertNotNull(cub);
    }

    @Test
    public void cylinderAreaCalculation(){
        assertEquals(235.5, cyl.printVolume(), 0);
    }

    @Test
    public void converterCalculation(){
        assertNotEquals(cyl.printVolume(), convThreeD.printAreaConvertedFt(), 0);
    }


    //Invalid Tests
    @Test
    public void negativeAreaCalculation(){
        tria = new Triangle(10, -5);
        assertEquals(0, tria.printArea(), 0);
    }

    @Test
    public void zeroAreaCalculation(){
        tria = new Triangle(10, 0);
        assertEquals(0, tria.printArea(), 0);
    }

    @Test
    public void outOfBoundAreaCalculation(){
        Circle c = new Circle(10000000);
        assertEquals(314000000000000.00, c.printArea(), 0);
    }

    @Test
    public void negativeConverting(){
        convTwoD = new TwoDConverter(-50);
        assertEquals(0, convTwoD.printAreaConvertedIn(), 0);
    }

    //Exception Test
    @Test
    public void divideByZero(){
        assertThrows(ArithmeticException.class, () -> {
            rhom = new Rhombus(5, 10, 0);
        });
    }
}
