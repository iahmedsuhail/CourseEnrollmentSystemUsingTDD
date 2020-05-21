import java.util.ArrayList;
import java.util.List;

public class TimeTable {
    List<TimeTableEntry> timeTableEntryList;

    public TimeTable() {
        timeTableEntryList = new ArrayList<>();
    }

    public List<TimeTableEntry> getTimeTableEntryList() {
        return timeTableEntryList;
    }

    public void addToTimeTable(TimeTableEntry timeTableEntry) {
        this.timeTableEntryList.add(timeTableEntry);
    }

    public TimeTable(List<TimeTableEntry> timeTableEntryList) {
        this.timeTableEntryList = timeTableEntryList;
    }
}
