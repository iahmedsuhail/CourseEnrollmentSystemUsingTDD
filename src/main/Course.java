import java.util.ArrayList;

public class Course {
    String name;
    String code;
    int points;
    boolean availaibility;

    int maxNumberOfStudents;
    ArrayList<String> prereqs;

    public Course(String name, String code, Integer points, boolean availaibility) {
        this.name = name;
        this.code = code;
        this.points = points;
        this.availaibility = availaibility;
        this.prereqs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getPoints() {
        return points;
    }

    public boolean getAvailaibility() {
        return availaibility;
    }

    public void setMaxNumberOfStudents(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public void addPrereqs(String code) {
        this.prereqs.add(code);
    }

    public void setAvailaibility(boolean availaibility) {
        this.availaibility = availaibility;
    }

    public ArrayList<String> getPrereqs() {
        return prereqs;
    }

    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }
}
