package isp.violation.test;

import isp.violation.Manager;
import isp.violation.Robot;
import isp.violation.Worker;

public class TestIspViolation {
	public static void main(String[] args) {
		Manager manger = new Manager();
		Robot robot = new Robot();
		atCafeteria(manger);
		atWorkStation(manger);
		atWorkStation(robot);

		atCafeteria(robot);
		
	}

	public static void atCafeteria(Worker worker) {
		worker.startEat();
		worker.stopEat();
	}

	public static void atWorkStation(Worker worker) {
		worker.startWork();
		worker.stopWork();
	}

}
