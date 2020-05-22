
public class Students extends Person{

	public Students(int ID, String name, int age) {
		super(ID, name, age);
		// TODO Auto-generated constructor stub
	}

	public String getStuInfo() {
		return "Student information: student ID is: " + ID + ", student name is: " + name + 
				", Student age is :" + age;
	}
	
	
	
}
