import java.util.ArrayList;

public class Student {

    ArrayList<Course> enrolledCourses;

    public Student() {
        this.enrolledCourses = new ArrayList<Course>();
    }

    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrol(Course courseToEnrol) {
        this.enrolledCourses.add(courseToEnrol);
    }
}
