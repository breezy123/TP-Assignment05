package assignment05.domain.Shapes;

/**
 * Created by aubrey on 01/04/2017.
 */
import assignment05.Service.Implement.Shape;
public class Circle implements Shape{
    @Override
    public String draw(){
       return"Circle";
    }
}
