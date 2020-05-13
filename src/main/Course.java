public class Course {
    String name;
    String code;
    int points;
    boolean availaibility;

    public Course(String name, String code, Integer points, boolean availaibility) {
        this.name = name;
        this.code = code;
        this.points = points;
        this.availaibility = availaibility;
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
}
