package core_java_01_11_26;

public class PrimitiveDemo {
    public static void main(String[] args) {
        byte b = 10;
        short s = 200;
        int i = 100000;
        long l = 123456789L;
        float f = 5.75f;
        double d = 19.99;
        char c = 'A';
        boolean isEven = true;

        System.out.println("byte: " + b + ", short: " + s + ", int: " + i);
        System.out.println("long: " + l + ", float: " + f + ", double: " + d);
        System.out.println("char: " + c + ", boolean: " + isEven);


        int x = 50;
        double widened = x;
        System.out.println("Widening int -> double: " + widened);


        double y = 9.78;
        int narrowed = (int) y;
        System.out.println("Narrowing double -> int: " + narrowed);


        int ascii = c;
        char ch = (char) (ascii + 1);
        System.out.println("ASCII of A: " + ascii + ", next char: " + ch);
    }
}