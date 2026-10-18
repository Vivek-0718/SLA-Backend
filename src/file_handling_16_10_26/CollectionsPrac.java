package file_handling_16_10_26;

import java.util.*;

public class CollectionsPrac {
    public static void main(String[] args) {
//        3
        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20);
        Set<Integer> unique = new LinkedHashSet<>(list);
        System.out.println(unique);
//        4
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Arun");
        students.put(102, "Priya");
        students.put(103, "Karthik");
        System.out.println(students.get(102));
//        5
        List<Integer> numbers = new ArrayList<>(List.of(40, 10, 30, 20));
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
