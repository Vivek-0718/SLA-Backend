package core_java_01_11_26;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("s1 == s2      : " + (s1 == s2));
        System.out.println("s1 == s3      : " + (s1 == s3));

        // equals() compares content
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));
    }
}
