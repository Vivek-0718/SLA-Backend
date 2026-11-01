package core_java_01_11_26;

class Student {
    static String college = "ABC College";
    final double pi = 3.14;
}

public class StaticFinalDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.college = "XYZ College";

        System.out.println(s1.college);
        System.out.println(s2.college);
        System.out.println(s1.pi);
    }
}