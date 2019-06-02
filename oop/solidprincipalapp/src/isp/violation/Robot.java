package isp.violation;

import com.sun.javadoc.ThrowsTag;

public class Robot implements Worker{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("robo start work");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub

		System.out.println("robo stop Work");
	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		throw new RoboCanNotEat();
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		throw new RoboCanNotEat();
	}

}
