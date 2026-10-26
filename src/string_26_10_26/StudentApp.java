package string_26_10_26;

import java.util.Optional;

public class StudentApp {

    public static void main(String[] args) {
        Optional<String> optName1 = Optional.ofNullable("John");
        System.out.println(optName1.orElse("Student name not available"));

        Optional<String> optName2 = Optional.ofNullable(null);
        System.out.println(optName2.orElse("Student name not available"));
    }
}
