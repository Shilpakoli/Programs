package Polymorphism;

public class DynamicP {

	public static void main(String[] args) {
		
		Two t = new Two();
		t.calculate(26);
		
		One o;	// reference o of One type
		o = new Two();
		o.calculate(4);
		
		o = new One();
		o.calculate(4);
	}

}
