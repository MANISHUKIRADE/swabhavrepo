package isp.violation.solution;

public class Manager implements Worker, isp.violation.Worker{

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		System.out.println("manger start eat");
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		System.out.println("manger stop eat");
		
	}

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("manger start work");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("manger stop work");
	}

	
}
