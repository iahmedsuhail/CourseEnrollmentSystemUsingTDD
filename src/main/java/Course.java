

import java.util.ArrayList;

public class Course {
    String name;
    String code;
    int points;
    boolean availability;

    int maxNumberOfStudents;
    ArrayList<String> prereqs;

    public Course(String name, String code, Integer points, boolean availability) {
        this.name = name;
        this.code = code;
        this.points = points;
        this.availability = availability;
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

    public boolean getAvailability() {
        return availability;
    }

    public void setMaxNumberOfStudents(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public void addPrereqs(String code) {
        this.prereqs.add(code);
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public ArrayList<String> getPrereqs() {
        return prereqs;
    }

    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }

    public String showInfo(){
        return String.format("Name: %s Code: %s", this.name, this.code);
    }
}
