package loops_04_10_26;

public class Student {
    private static String collegeName ="ABC";
    private String name;
    private String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public static void main(String[] args) {
        Student s1 = new Student("John","CSE");
        Student s2 = new Student("Jack","Mech");
        Student s3 = new Student("Jane","ECE");
        System.out.println(Student.collegeName);
    }
}
