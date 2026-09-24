package operators_24_09_26;

public class Cart {
	double price;
	int quantity;
	int discount;

	Cart(double price, int quantity, int discount) {
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
	}

	public double calcTotal() {
		double discountPer = (double) this.discount;
		double discount = (this.price * this.quantity)*discountPer/100;
		double discountedAmount = (this.price * this.quantity) - discount;
		return discountedAmount;
	}

	public static void main(String[] args) {
		Cart c1= new Cart(999.5,3,10);
		System.out.println(c1.calcTotal());
	}
}
