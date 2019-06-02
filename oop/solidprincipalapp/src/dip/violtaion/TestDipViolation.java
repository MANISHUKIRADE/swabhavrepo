package dip.violtaion;

public class TestDipViolation {
	public static void main(String[] args) {
		TaxCalculator mycalci = new TaxCalculator(LogType.DB);
		System.out.println(mycalci.calculateTax(10, 0));
		
	}
	

}
