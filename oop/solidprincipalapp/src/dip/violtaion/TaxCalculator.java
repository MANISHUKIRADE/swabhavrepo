package dip.violtaion;

public class TaxCalculator {
	private DbLogger bblogger;
	public TaxCalculator(LogType log) {
		// TODO Auto-generated constructor stub
		if(log==LogType.DB)
			this.bblogger = new DbLogger();
	}	
	public int calculateTax(int amount , int rate) {
		int tax = -1;
		try {
			
		 tax= amount/rate;
		}catch (Exception e) {
			// TODO: handle exception
			
			if(e!=null) {
				bblogger.log(e.toString());
				
				
			}
		}
		return tax;
	}

}
