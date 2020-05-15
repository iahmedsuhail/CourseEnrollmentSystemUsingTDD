public class EnrollmentConcession {
    Student student;
    Course course;

    public EnrollmentConcession(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public String getDetails() {
        return String.format("%s wants to enrol in %s", student.getName(), course.getCode());
    }
}
