package assignment05;

/**
 * Created by aubrey on 01/04/2017.
 */


import assignment05.Factory.AbstractFactory;
import assignment05.Factory.ColorFactory;
import assignment05.Factory.ShapeFactory;
import assignment05.Factory.FactoryProducer;
import assignment05.Service.Implement.Shape;
import assignment05.Service.Implement.Colour;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class TestShapeColors extends TestCase{

    AbstractFactory shapeFactory;
    AbstractFactory colorFactory;

    Shape shape1;
    Shape shape2;
    Shape shape3;

    Colour color1;
    Colour color2;
    Colour color3;

    public void testShape(){

        shapeFactory = FactoryProducer.getFactory("SHAPE");
        shape1 = shapeFactory.getShape("Circle");
        shape2 = shapeFactory.getShape("Rectangle");
        shape3 = shapeFactory.getShape("Sqaure");

        //noinspection deprecation
        Assert.assertEquals(shape1.draw(),"Circle");
        Assert.assertEquals(shape2.draw(),"Rectangle");
        Assert.assertEquals(shape3.draw(),"Sqaure");
    }
    public void testColor(){

        colorFactory = FactoryProducer.getFactory("COLOR");
        color1 = colorFactory.getColour("Blue");
        color2 = colorFactory.getColour("Indigo");
        color3 = colorFactory.getColour("White");


        Assert.assertEquals(color1.fill(),"Blue");
        Assert.assertEquals(color2.fill(),"Indigo");
        Assert.assertEquals(color3.fill(),"White");

    }

}
