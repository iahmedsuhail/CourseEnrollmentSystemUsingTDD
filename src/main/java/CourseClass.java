public class CourseClass {
    private String title;
    private String courseCode;
    private String programDept;
    private int points;
    private boolean availability;
    private boolean Mandatory = false;

    private int maxNumberOfStudents;


    public CourseClass(String title, String courseCode, Integer points, boolean availability) {
        this.title = title;
        this.courseCode = courseCode;
        this.points = points;
        this.availability = availability;

    }

    @Override
    public String toString() {
        return "CourseClass{" +
                "title='" + title + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", programDept='" + programDept + '\'' +
                ", points=" + points +
                ", Mandatory=" + Mandatory +
                '}';
    }

    public boolean isMandatory() {
        return Mandatory;
    }

    public void makeMandatory() {
        Mandatory = true;
    }

    public String getTitle() {
        return title;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setProgramDept(String programDept) {
        this.programDept = programDept;
    }

    public String getProgramDept() {
        return programDept;
    }

    public int getPoints() {
        return points;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setMaxNumberOfStudents(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }


    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }

    public String showInfo() {
        return String.format("Name: %s Code: %s", this.title, this.courseCode);
    }
}
