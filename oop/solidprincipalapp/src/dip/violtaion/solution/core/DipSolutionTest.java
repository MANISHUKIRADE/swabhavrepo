package dip.violtaion.solution.core;

public class DipSolutionTest {
	public static void main(String[] args) {
		Logger log = new DbLogger();
	TaxCalculator taxcalculator =		new TaxCalculator(log);
	taxcalculator.calculateTax(10, 0);
	}

}
