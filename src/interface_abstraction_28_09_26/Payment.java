package interface_abstraction_28_09_26;

public abstract class Payment {
	abstract void payment();
}
class CreditCard extends Payment{
	@Override
	void payment() {
		System.out.println("CreditCard payment");
	}
}

class Upi extends Payment{
	@Override
	void payment() {
		System.out.println("Upi payment");
	}
}
