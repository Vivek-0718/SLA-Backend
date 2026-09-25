package oops_25_09_26;

public class Developer extends Employee {
	String programmingLanguage;

	public Developer(String name, int id, double salary, String programmingLanguage) {
		super(name, id, salary);
		this.programmingLanguage = programmingLanguage;
	}

	public static void main(String[] args) {
		
		Developer e1 = new Developer("John", 1, 30000, "Java");
		System.out.println(e1.name +" - " +e1.id +"," + e1.programmingLanguage +","+ e1.salary);

	}

}
