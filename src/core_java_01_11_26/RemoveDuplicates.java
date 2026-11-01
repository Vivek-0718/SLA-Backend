package core_java_01_11_26;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        System.out.println("ArrayList (with duplicates): " + list);

        HashSet<Integer> set = new HashSet<>(list);
        System.out.println("HashSet (duplicates removed): " + set);
    }
}
