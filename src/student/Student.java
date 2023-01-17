package student;

/**
 *
 * @author yuvraj bhardwaj
 */
public class Student {
    
    private String StudentID;
    private String StudentName;

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

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }
    
}
