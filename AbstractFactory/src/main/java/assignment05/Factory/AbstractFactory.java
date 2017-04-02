package assignment05.Factory;

/**
 * Created by aubrey on 01/04/2017.
 */
import assignment05.Service.Implement.Colour;
import assignment05.Service.Implement.Shape;
public abstract class AbstractFactory {
   public abstract Colour getColour(String color);
   public abstract Shape getShape(String shape);
}
