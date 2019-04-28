package deadlydiamond;

public class Dog implements Animal,Robo  {

	@Override
	public void beFriendly() {
		System.out.println("Friendly From Pet");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		System.out.println("play from pet");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void charging() {
		System.out.println("charging From robo");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eating() {
		System.out.println("eating from animal");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moving() {
		// TODO Auto-generated method stub
		Robo.super.moving();
	}

	@Override
	public void noise() {
		// TODO Auto-generated method stub
		Robo.super.noise();
	}

	
	
}
