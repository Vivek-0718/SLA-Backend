package arraylist_hashset_07_10_2026;

import java.util.ArrayList;

public class Main_1_2 {

    public static ArrayList<Student> displayStudents(){
        ArrayList<Student> student_list = new ArrayList<>();
        student_list.add(new Student(1,"John",50,"CSE"));
        student_list.add(new Student(2,"Jack",60,"MECH"));
        student_list.add(new Student(3,"Paul",91,"CSE"));
        student_list.add(new Student(3,"Sam",56,"EEE"));
        student_list.add(new Student(4,"Matt",80,"ECE"));
        student_list.add(new Student(5,"Jane",90,"EEE"));
        student_list.add(new Student(5,"Jane",90,"EEE"));
        return student_list;
    }
    public static Student topMarkStudent(){
        ArrayList<Student> studentList = displayStudents();
        Student topScorer = null;
        for (Student student : studentList) {
            if (topScorer == null || student.getMark() > topScorer.getMark()) {
                topScorer = student;
            }
        }
        return topScorer;
    }
    public static Student getStudent(int rollNo){
        ArrayList<Student> studentList = displayStudents();
        for (Student student : studentList) {
            if (student.getRollNo() == rollNo) {
                return student;
            }
        }
        return null;
    }
    public static void main(String[] args) {
//        1
        System.out.println(displayStudents());
        System.out.print("Top Scorer:");
        System.out.println(topMarkStudent().toString());
//        2
        System.out.print("Search by Roll number: 1");
        System.out.println(getStudent(1).toString());
    }
}
