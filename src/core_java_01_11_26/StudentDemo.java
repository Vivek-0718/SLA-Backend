package core_java_01_11_26;

public class StudentDemo {
    private int id;
    private String name;
    private double marks;


    public StudentDemo(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        StudentDemo s1 = new StudentDemo(101, "Arun", 87.5);
        StudentDemo s2 = new StudentDemo(102, "Priya", 92.0);

        s1.display();
        s2.display();
    }
}
