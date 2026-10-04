package loops_04_10_26;

public class StudentMarks {

    public static void main(String[] args) {
        int[] marks = new int[]{66, 78, 35, 29, 93};
        for (int mark : marks) {
            if (mark > 50) {
                System.out.println(mark + "-Pass");
            } else {
                System.out.println(mark + "-Fail");
            }
        }
    }
}
