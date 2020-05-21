public class EnrollmentConcession {
    private StudentClass studentClass;
    private CourseClass courseClass;
    private Boolean accepted = null;
    public EnrollmentConcession(StudentClass studentClass, CourseClass courseClass) {
        this.studentClass = studentClass;
        this.courseClass = courseClass;
    }
    public String getDetails() {
        return String.format("%s (%s) wants to enrol in %s (%s)", studentClass.getName(), studentClass.getID(), courseClass.getCourseCode(), courseClass.getProgramDept());
    }

    public StudentClass getStudentClass(){
        return studentClass;
    }

    public CourseClass getCourseClass() {
        return courseClass;
    }

    public void acceptConcessionRequest(){
        this.accepted = true;
    }

    public void rejectConcessionRequest(){
        this.accepted = false;
    }

    public Boolean getAccepted() {
        return accepted;
    }
}
