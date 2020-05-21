import java.util.ArrayList;
import java.util.List;

public class Classes {
    private final String ClassID;
    private String Department;
    private CourseClass courseClass;
    private List<StudentClass> studentClassList;
    private int numberOfStudents;

    @Override
    public String toString() {
        return "Classes{" +
                "ClassID='" + ClassID + '\'' +
                ", Department='" + Department + '\'' +
                ", courseClass=" + courseClass +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }

    public Classes(String classID, CourseClass courseClass) {
        ClassID = classID;
        this.courseClass = courseClass;
        studentClassList = new ArrayList<>();
        numberOfStudents = 0;
    }

    public Classes(String classID, CourseClass courseClass, List<StudentClass> studentClassList) {
        ClassID = classID;
        this.courseClass = courseClass;
        this.studentClassList = studentClassList;
        getNumberOfStudents();
    }

    public boolean enrollStudentIntoClass(EnrollmentConcession con){
        if(con!=null && con.getCourseClass().getCourseCode().equalsIgnoreCase(courseClass.getCourseCode())){
            studentClassList.add(con.getStudentClass());
            numberOfStudents++;
            return true;
        }
        return false;
    }

    public String getClassID() {
        return ClassID;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getNumberOfStudents() {
        numberOfStudents = studentClassList.size();
        return numberOfStudents;
    }

}
