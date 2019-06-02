package isp.violation;

public class Manager implements  Worker{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("manger start work");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("manager stop work");
	}

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

}
