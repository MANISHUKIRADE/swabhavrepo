package oddevencheck;

import oddeventest.OddEvenChecker;

public class OddEvenPrinter {
	public  void evenPrint(int limit) {
		OddEvenChecker evenChecker=new OddEvenChecker();
		
		for(int num=0;num<=limit;num++)
		{
			if(evenChecker.checkEven(num)==true)
			{
				System.out.println(num);
				
			}
		}
	}
	
	
	
	public  void oddPrint(int limit) {
		OddEvenChecker evenChecker=new OddEvenChecker();
		
		for(int num=0;num<=limit;num++)
		{
			if(evenChecker.checkEven(num)==false)
			{
				System.out.println(num);
				
			}
		}
	}
	
	
	
}
