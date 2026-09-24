package operators_24_09_26;

import java.util.Scanner;

public class CheckOddEven {
	Scanner scan = new Scanner(System.in);
	double value;

	public CheckOddEven(double value) {
		this.value = value;
	}

	public String oddOrEven() {
		return (int) this.value % 2 == 0 ? "Even" : "Odd";
	}

	public static void main(String[] args) {
		CheckOddEven c1 = new CheckOddEven(25.75);
		System.out.println(c1.oddOrEven());
	}
}
