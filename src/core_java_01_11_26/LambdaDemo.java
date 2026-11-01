package core_java_01_11_26;

public class LambdaDemo {
    public static void main(String[] args) {
        CalculatorInterface calc = (a, b) -> a + b;

        int result = calc.add(15, 25);
        System.out.println("Sum = " + result);
    }
}
