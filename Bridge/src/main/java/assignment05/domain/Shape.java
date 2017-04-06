package assignment05.domain;

/**
 * Created by aubrey on 02/04/2017.
 */
import assignment05.Service.Implement.Color;
public abstract class Shape {
    protected Color color;

    public Shape(){}
    public Shape(Color color){
        this.color = color;
    }
    abstract public String applyColor();
}
