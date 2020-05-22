package second;

public class Course {
	
	String programDepartment;
	String title;
	String courseCode;
	String requirements;
	String stuNameOfThisCourse;
	Boolean status;
	
	public Course(String programDepartment, String title,String courseCode,String requirements,
			String stuNameOfThisCourse) {
		this.programDepartment = programDepartment;
		this.title = title;
		this.courseCode = courseCode;
		this.requirements = requirements;
		this.stuNameOfThisCourse = stuNameOfThisCourse;
		this.status = false;
		
	}
	
	public String getStuName() {
		return stuNameOfThisCourse;
	}
	
	public void setStatus(boolean decision) {
	    status = decision;
	}
	public boolean getStatus() {
		return status;
	}
	
	public String  getCourseInfo() {
		return "Course Information: ProgramDepartmant is:" + programDepartment +
				", Title is: "+ title + ", Course code: " + courseCode +  ", Requirements"+requirements
				+", student name of taking this course" + stuNameOfThisCourse;
				
	}
	
}
