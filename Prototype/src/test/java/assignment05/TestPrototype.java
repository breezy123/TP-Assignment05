package assignment05;

/**
 * Created by aubrey on 02/04/2017.
 */
import assignment05.Service.Implement.ImplementSubject;
import assignment05.Service.Implement.ImplementsStudent;
import assignment05.domain.Student;
import assignment05.domain.Subject;
import junit.framework.Assert;
import junit.framework.TestCase;

public class TestPrototype extends  TestCase {

    ImplementsStudent newStudent = new ImplementsStudent();
    ImplementSubject newSubject = new ImplementSubject();

    Subject subject ;
    Student student;

    public void testSubjectPrototype(){
        subject = newSubject.createCopy();
        System.out.println(subject.toString());
        Assert.assertEquals(subject.getSubjectCode(),"IRP300");
    }

    public void testStudentProtoType(){
        student = newStudent.createCopy();
        System.out.println(student.toString());
        Assert.assertEquals(student.getStudentNo(),"214111628");
    }
}
