public class EnrollmentConcession {
    Student student;
    Course course;
    String description;

    public EnrollmentConcession(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public EnrollmentConcession(Student student, Course course, String description){

    }

    public String getDetails() {
        return String.format("%s wants to enrol in %s", student.getName(), course.getCode());
    }

    public String getDescription(){
        return "";
    }
}
