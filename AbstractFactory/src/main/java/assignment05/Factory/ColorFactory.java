package assignment05.Factory;

/**
 * Created by aubrey on 01/04/2017.
 */
import assignment05.Color.*;
import assignment05.Service.Implement.Colour;
import assignment05.domain.Shapes.*;
import assignment05.Service.Implement.Shape;

public class ColorFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType){
        return null;
    }
    public Colour getColour(String color){

        if(color ==null){
            return null;
        }
        if(color.equalsIgnoreCase("blue")){
            return new Blue();
        }
        else if(color.equalsIgnoreCase("white")){
            return new White();
        }
        else if(color.equalsIgnoreCase("indigo")){
            return new Indigo();
        }

        return null;
    }
}
