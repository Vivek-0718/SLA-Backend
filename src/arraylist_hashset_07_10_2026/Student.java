package arraylist_hashset_07_10_2026;

import java.util.Objects;

public class Student {
    private int rollNo;
    private String name;
    private int mark;
    private String dept;

    public Student(int rollNo, String name, int mark, String dept) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
        this.dept = dept;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMark() {
        return mark;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return String.format("%nName: %s,Roll No: %d,Department: %s,Marks: %d", name, rollNo, dept, mark);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student o = (Student) obj;
            return o.rollNo == this.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}