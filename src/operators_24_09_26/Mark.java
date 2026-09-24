package operators_24_09_26;

public class Mark {
	int mark;
	Mark(int mark){
		this.mark = mark;
	}
	double calcPersentage() {
		double marks = (double) this.mark;
		return (marks/100)*100;
	}
	public static void main(String[] args) {
		Mark m1 = new Mark(85);
		System.out.println(m1.calcPersentage()+"%");
	}
}
