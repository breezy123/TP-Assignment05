package assignment05.Shapes;

import assignment05.Service.Implement.Color;
import assignment05.domain.Shape;

/**
 * Created by aubrey on 02/04/2017.
 */
public class Triangle extends Shape {

    public Triangle(){}
    public Triangle(Color color){
        super(color);
    }
    public String applyColor(){
        System.out.println("Triangle filled with color");
       return color.applyColor();

    }
}
