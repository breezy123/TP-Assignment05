package assignment05.Factory;

/**
 * Created by aubrey on 01/04/2017.
 */

import assignment05.Service.Implement.Colour;
import assignment05.Service.Implement.Shape;
import assignment05.domain.Shapes.*;
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType ==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("sqaure")){
            return  new Square();
        }

            return null;

    }
    @Override
    public Colour getColour(String color){
        return null;
    }
}
