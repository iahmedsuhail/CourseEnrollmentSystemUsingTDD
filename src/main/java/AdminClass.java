import javax.swing.*;
import java.util.List;

public class AdminClass {

    CourseClass setCourseAvailability(CourseClass cor, boolean availability){
        cor.setAvailability(availability);
        return cor;
    }

    CourseClass setCourseStudentStrength(CourseClass cor, int strength){
        cor.setMaxNumberOfStudents(strength);
        return cor;
    }

    boolean acceptConscession(EnrollmentConcession con){
        if (con==null )
            return false;
        con.acceptConcessionRequest();
        return true;
    }

    boolean rejectConscession(EnrollmentConcession con){
        if (con==null )
            return false;
        con.rejectConcessionRequest();
        return true;
    }

    void checkConcessionRequests(List<EnrollmentConcession> requests){
        for(EnrollmentConcession request : requests){
            //System.out.println(request.getDetails());
            int choice = JOptionPane.showConfirmDialog(null,request.getDetails() + "\n Accept this?");
            if(choice == 1){
                request.acceptConcessionRequest();
            } if (choice == 0){
                request.rejectConcessionRequest();
            }
        }
    }

}
