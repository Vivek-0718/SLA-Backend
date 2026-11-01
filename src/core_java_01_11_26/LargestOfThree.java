package core_java_01_11_26;

public class LargestOfThree {
    private int a, b, c;

    public LargestOfThree(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int findLargest() {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        LargestOfThree obj = new LargestOfThree(25, 78, 42);
        System.out.println("Largest : " + obj.findLargest());
    }
}