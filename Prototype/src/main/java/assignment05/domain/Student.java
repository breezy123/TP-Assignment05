package assignment05.domain;

/**
 * Created by aubrey on 02/04/2017.
 */
import assignment05.Service.Implement.CloneObject;
public class Student implements CloneObject {

    private String studentNo;
    private String idNumber;
    private String fName;
    private String lName;

    private  Student(){}
    public Student(String studentNo,String idNumber, String fName, String lName){
        this.studentNo = studentNo;
        this.idNumber = idNumber;
        this.fName = fName;
        this.lName = lName;
    }
    //@Override
    public CloneObject createCopy(){
        return new Student(studentNo,idNumber,fName,lName);
    }
    public String getStudentNo(){
        return this.studentNo;
    }
    public String getIdNumber(){
        return this.idNumber;
    }
    public String getfName(){
        return this.fName;
    }
    public String getlName(){
        return this.lName;
    }
    public String toString(){

        String format = String.format("%s\t%s\t%s\t%s",studentNo,idNumber,fName,lName);
        return format;
    }

}
