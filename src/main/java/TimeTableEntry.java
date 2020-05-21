import java.util.Date;

public class TimeTableEntry {
    Date entryDate;
    Classes entryClass;
    CourseClass entryCourseClass;

    public TimeTableEntry(Date entryDate, Classes entryClass, CourseClass entryCourseClass) {
        this.entryDate = entryDate;
        this.entryClass = entryClass;
        this.entryCourseClass = entryCourseClass;
    }

    @Override
    public String toString() {
        return "TimeTableEntry{" +
                "entryDate=" + entryDate +
                ", entryClass=" + entryClass +
                ", entryCourseClass=" + entryCourseClass +
                '}';
    }
}
