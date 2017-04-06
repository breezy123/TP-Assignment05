package assignment05;

/**
 * Created by aubrey on 31/03/2017.
 */
import junit.framework.TestCase;

public class TestArea extends TestCase{

    AreaCalculator shapeArea = AreaCalculator.getAreaCalculator();

    public void testRectangle(){
        assertEquals(shapeArea.rectangleArea(45.34,67.21), shapeArea.circleArea(34.2),shapeArea.sqaureArea(76.32,12));
    }
}
