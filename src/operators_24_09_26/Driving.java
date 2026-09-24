package operators_24_09_26;

public class Driving {
	double age;

	public Driving(double age) {
		this.age = age;
	}

	public String drive() {
		return (int) this.age >= 18 && (int) this.age <= 60 ? "Can drive" : "Cannot drive";
	}

	public static void main(String[] args) {
		Driving d1 = new Driving(18.75);
		System.out.println(d1.drive());
	}

}
