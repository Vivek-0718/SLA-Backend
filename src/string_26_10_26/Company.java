package string_26_10_26;

import java.util.ArrayList;
import java.util.List;

//    1. The String class is immutable: any modification creates a new object.

//2
public class Company {
    static void main() {

        StringBuilder emp_name = new StringBuilder();
        ArrayList<String> emp = new ArrayList<>(List.of("Jack", "Jane", "John"));
        for (String e : emp) {
            emp_name.append(e);
        }
        System.out.println(emp_name);
    }

}
