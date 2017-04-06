package assignment05;

/**
 * Created by aubrey on 02/04/2017.
 */
import assignment05.Colors.Green;
import assignment05.Colors.Red;
import assignment05.Shapes.Pentagon;
import assignment05.Shapes.Triangle;
import assignment05.domain.Shape;
import junit.framework.Assert;
import junit.framework.TestCase;
public class TestBridge extends TestCase{

   // Shape trai = new Triangle(new Red());

    public void testShape1(){
        Shape trai = new Triangle(new Red());
        trai.applyColor();

        Assert.assertEquals(trai.applyColor(),"red");
    }

    public void testShap2(){
        Shape pent = new Pentagon(new Green());
        pent.applyColor();

        Assert.assertEquals(pent.applyColor(),"green");
    }
}
