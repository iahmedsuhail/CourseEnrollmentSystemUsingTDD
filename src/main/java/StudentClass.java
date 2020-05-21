import java.util.ArrayList;

public class StudentClass {
    private String name;
    PersonRole role;
    public boolean loggedIn = false;


    private String ID;
    private ArrayList<CourseClass> enrolledCours;
    private ArrayList<EnrollmentConcession> appliedCourses;

    public StudentClass() {
        this.enrolledCours = new ArrayList<CourseClass>();
        appliedCourses = new ArrayList<>();
        role = PersonRole.STUDENT;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public ArrayList<CourseClass> getEnrolledCours() {
        return enrolledCours;
    }

    public void enrol(CourseClass courseClassToEnrol) {
        boolean x = false;
        for (EnrollmentConcession con : appliedCourses) {
            if (con.getAccepted() == null)
                x = true;
        }
        if (!x)
            this.enrolledCours.add(courseClassToEnrol);
        else
            throw new IllegalStateException("Concession Request not verified");
    }

    public boolean dropOutCourse(CourseClass cor) {
        if (cor != null && enrolledCours.contains(cor)) {
            enrolledCours.remove(cor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "ID='" + ID + '\'' +
                ", Name=" + getName() + ", role=" + role +
                '}';
    }

    public EnrollmentConcession applyForConcession(CourseClass cor) {
        if (cor != null) {
            appliedCourses.add(new EnrollmentConcession(this, cor));
            return (appliedCourses.get(appliedCourses.size() - 1));
        }
        throw new NullPointerException("CourseClass is Null");
    }

    public String showEnrolledCoursesDetails() {
        String returningString = "";
        for (CourseClass cor : enrolledCours) {
            returningString = returningString + "CourseClass title: " + cor.getTitle() +
                    "\nCourseClass Code: " + cor.getCourseCode() +
                    "\nCourseClass Dept: " + cor.getProgramDept();
        }
        return returningString;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public String getName() {
        return null;
    }

    public void setRole(PersonRole newRole) {
        role = newRole;
    }

    public void setName(String name) {
        this.name = name;
    }

}
