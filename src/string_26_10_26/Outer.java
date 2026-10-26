package string_26_10_26;

//4
public class Outer {
    class Inner{
        public void display(){
            System.out.println("Student details");
        }
    }

    static void main() {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.display();
    }
}
