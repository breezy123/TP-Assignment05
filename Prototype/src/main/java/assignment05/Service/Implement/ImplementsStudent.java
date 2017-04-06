package assignment05.Service.Implement;

/**
 * Created by aubrey on 02/04/2017.
 */
import assignment05.domain.Student;
public class ImplementsStudent implements CloneObject{

    public Student createCopy(){

        Student  std = new Student("214111628","9003307383283","Aubrey","Xaba");
        return std;
    }
}
