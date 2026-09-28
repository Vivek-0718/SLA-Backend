package conditions_28_09_26;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1
		System.out.println("1. Enter student's mark: ");
		int mark = sc.nextInt();
		if (mark >= 40) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		// 2
		System.out.println("2. Enter an integer: ");
		int num = sc.nextInt();
		String result = (num % 2 == 0) ? "Even" : "Odd";
		System.out.println(num + " is " + result);

		// 3
		System.out.println("3. Enter age: ");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("Eligible to Vote");
		} else {
			System.out.println("Not Eligible");
		}

		// 4
		System.out.println("4. Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		int largest = (a > b) ? a : b;
		System.out.println("Largest number: " + largest);

		// 5
		System.out.println("5. Enter student mark: ");
		int m = sc.nextInt();
		if (m >= 90 && m <= 100) {
			System.out.println("A Grade");
		} else if (m >= 75 && m <= 89) {
			System.out.println("B Grade");
		} else if (m >= 50 && m <= 74) {
			System.out.println("C Grade");
		} else if (m >= 40 && m <= 49) {
			System.out.println("D Grade");
		} else if (m >= 0 && m < 40) {
			System.out.println("Fail");
		} else {
			System.out.println("Invalid mark");
		}
	}

}
