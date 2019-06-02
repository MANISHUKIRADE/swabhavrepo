package isp.violation.solution;

import isp.violation.Worker;

public class TestSolutionIsp {
public static void main(String[] args) {

	Worker manger = new Manager();
	Robot robot = new Robot();
	atCafeteria(manger);
	

}
public static void atCafeteria(Worker worker) {
	worker.startEat();
	worker.stopEat();
}

public static void atWorkStation(WorkreWork worker) {
	worker.startWork();
	worker.stopWork();
}

}
