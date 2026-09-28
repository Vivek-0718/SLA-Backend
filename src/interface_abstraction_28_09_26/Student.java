package interface_abstraction_28_09_26;

public class Student {
	public String name;
	private int rollNo;
	protected String college;
	private String password;

	Student(String name, int rollNo, String college, String password) {
		this.name = name;
		this.rollNo = rollNo;
		this.college = college;
		this.password = password;
	}

	public int getRollNo() {
		return rollNo;
	}
}

class CollegeStudent extends Student {

    CollegeStudent(String name, int rollNo, String college, String password) {
        super(name, rollNo, college, password);
    }

    void showDetails() {
        System.out.println("Name    : " + name);
        System.out.println("College : " + college);

        System.out.println("Roll No : " + getRollNo()); // private requires methods
    }
}