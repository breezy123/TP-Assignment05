package assignment05.Shapes;

/**
 * Created by aubrey on 02/04/2017.
 */
import assignment05.Service.Implement.Color;
import assignment05.domain.Shape;

public class Pentagon extends Shape {

    public Pentagon (){
        super();
    }
    public Pentagon(Color color){
        super(color);
    }
    public String applyColor(){
        System.out.println("Pentagon filled color");
        return color.applyColor();
    }
}
