package oops_25_09_26;

public class Student {
	String name;
	int rollNo;
	int mark;

	Student(String name, int rollNo, int mark) {
		this.name = name;
		this.rollNo = rollNo;
		this.mark = mark;
	}

	void display() {
		System.out.println("Name:" + this.name + "," + " Roll NO:" + this.rollNo + "," + " Marks:" + this.mark);
	}

	public static void main(String[] args) {
		Student s1 = new Student("John", 1, 75);
		Student s2 = new Student("Jack", 2, 80);
		s1.display();
		s2.display();
	}

}
