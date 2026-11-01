package core_java_01_11_26;

public class MathDemo {
    public static void main(String[] args) {
        double num = 144;
        double base = 2, exponent = 10;
        int negative = -25;
        int x = 40, y = 75;

        System.out.println("Square root of " + num + " = " + Math.sqrt(num));
        System.out.println(base + " raised to " + exponent + " = " + Math.pow(base, exponent));
        System.out.println("Absolute value of " + negative + " = " + Math.abs(negative));
        System.out.println("Maximum of " + x + " and " + y + " = " + Math.max(x, y));
    }
}