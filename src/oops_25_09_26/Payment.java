package oops_25_09_26;

public class Payment {
	void pay() {
		System.out.println("Processing payment...");
	}
}

class UPIPayment extends Payment {
	@Override
	void pay() {
		System.out.println("Payment made using UPI");
	}
}

class CardPayment extends Payment {
	@Override
	void pay() {
		System.out.println("Payment made using Card");
	}
}

class CashPayment extends Payment {
	@Override
	void pay() {
		System.out.println("Payment made using Cash");
	}
}

class Main {
	public static void main(String[] args) {

		UPIPayment payment1 = new UPIPayment();
		payment1.pay();

		CardPayment payment2 = new CardPayment();
		payment2.pay();

		CashPayment payment3 = new CashPayment();
		payment3.pay();
	}
}