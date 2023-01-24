package student;

/**
 * date : 24 jan 2023
 * @author yuvraj bhardwaj
 */
public class Student {
    
    private String StudentID;
    private String StudentName;
    private String address;

    public Student(String StudentID, String StudentName) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }
    
}
