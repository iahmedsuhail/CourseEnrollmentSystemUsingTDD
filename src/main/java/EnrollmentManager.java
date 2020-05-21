import java.util.ArrayList;
import java.util.List;

public class EnrollmentManager {

    private List<CourseClass> courseClassList;
    private List<EnrollmentConcession> concessionRequests;
    private List<Classes> classesList;
    TimeTable tb;

    public EnrollmentManager(){
        courseClassList = new ArrayList<>();
        concessionRequests = new ArrayList<>();
        classesList = new ArrayList<>();

        tb = new TimeTable();
    }

    public EnrollmentManager(List<CourseClass> listOfCours){
        if(listOfCours != null)
            courseClassList = listOfCours;
        else
            courseClassList = new ArrayList<>();
    }

    public void AutoEnroll(StudentClass stu){

        for (CourseClass cor : courseClassList) {
            if (cor.isMandatory())
                stu.enrol(cor);
        }
    }

    public Classes searchClassByID(String key){
        for (Classes clas : classesList) {
            if(clas.getClassID().equalsIgnoreCase(key))
                return clas;
            }
        return null;
    }
    public List<Classes> searchClassByDepartment(String key){
        List<Classes> list = new ArrayList<>();
        for (Classes clas : classesList) {
            if(clas.getDepartment().equalsIgnoreCase(key))
                list.add(clas);
        }
        return list == null ? null : list;
    }

    public List<EnrollmentConcession> getConcessionRequests(){return concessionRequests;}

    public boolean setConcessionRequests(List<EnrollmentConcession> concessionRequests) {
        if(concessionRequests == null) {
            throw new NullPointerException();

        }
        this.concessionRequests = concessionRequests;
        return true;
    }

    boolean submitEnrollmentConcessionRequests(EnrollmentConcession con){
        if (con != null){
            concessionRequests.add(con);
            return true;
        }else {
            return false;
        }
    }

    public TimeTable getTb() {
        return tb;
    }

    public void setTb(TimeTable tb) {
        this.tb = tb;
    }

    public boolean addToClassesList(Classes clas) {
        if (clas == null )
            return false;
        classesList.add(clas);
        return true;
    }
}
