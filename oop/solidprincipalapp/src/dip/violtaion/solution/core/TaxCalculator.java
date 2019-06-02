package dip.violtaion.solution.core;

public class TaxCalculator {
	Logger log ;
	public TaxCalculator(Logger log) {
		// TODO Auto-generated constructor stub
		this.log=log;
		
	}
	public int  calculateTax(int amount, int rate) {
		int tax = -1;
		try {
			
		 tax= amount/rate;
		}catch (Exception e) {
			// TODO: handle exception
			
			if(e!=null) {
				log.log(e.toString());
				
				
			}
		}
		return tax;

		
	}
	

}
