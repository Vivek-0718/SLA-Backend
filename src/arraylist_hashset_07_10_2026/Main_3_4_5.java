package arraylist_hashset_07_10_2026;

import java.util.ArrayList;
import java.util.HashSet;

import static arraylist_hashset_07_10_2026.Main_1_2.displayStudents;

public class Main_3_4_5 {
    public static HashSet<Student> u_student_list() {
        return new HashSet<>(displayStudents());
    }
    public static HashSet<String> uDeptList(){
        ArrayList<Student> student_list = displayStudents();
        HashSet<String> u_dept_list = new HashSet<>();
        for (Student s : student_list ) {
            u_dept_list.add(s.getDept());
        }
        return u_dept_list;
    }
    public static void main(String[] args) {
        System.out.println("Unique Students");
        System.out.println(u_student_list());
        System.out.println("Unique Departments");
        System.out.println(uDeptList());
    }

}



