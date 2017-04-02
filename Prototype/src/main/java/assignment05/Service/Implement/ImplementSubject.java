package assignment05.Service.Implement;

/**
 * Created by aubrey on 02/04/2017.
 */
import assignment05.domain.Student;
import assignment05.domain.Subject;

public class ImplementSubject implements CloneObject {

    public Subject createCopy(){
        Subject subjects = new Subject("IRP300","Internet Programming 3","Information Technology");
        return  subjects;
    }


}
