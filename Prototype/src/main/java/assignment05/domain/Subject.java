package assignment05.domain;

/**
 * Created by aubrey on 02/04/2017.
 */
import assignment05.Service.Implement.CloneObject;
public class Subject  implements CloneObject{

    private String subjectCode;
    private String subjectName;
    private String subjectCourse;
    public Subject(){}

    public Subject(String subjectCode,String subjectName,String subjectCourse){
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.subjectCourse = subjectCourse;
    }
    public String getSubjectCode(){
        return this.subjectCode;
    }
    public String getSubjectName(){
        return this.subjectName;
    }
    public String getSubjectCourse(){
        return this.subjectCourse;
    }
    //@Override
    public CloneObject createCopy(){
        return new Subject(subjectCode,subjectName,subjectCourse);
    }
    public String toString(){
        String format = String.format("%s\t%s\t%s\t",subjectCode,subjectName,subjectCourse);
        return format;
    }
}
