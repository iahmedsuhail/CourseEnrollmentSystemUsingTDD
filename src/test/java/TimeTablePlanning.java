import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

public class TimeTablePlanning {

    @Test
    public void testGetTimeTable(){
        EnrollmentManager system = new EnrollmentManager();
        TimeTable tb = new TimeTable();
        CourseClass courseClass = new CourseClass("Software Requirements Engineering", "SOFTENG754", 15, true);
        TimeTableEntry entry = new TimeTableEntry((new Date()),new Classes("102", courseClass), courseClass);
        tb.addToTimeTable(entry);
	assertNotNull(tb.getTimeTableEntryList());
            }
}
