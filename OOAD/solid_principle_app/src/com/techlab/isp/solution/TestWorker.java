package com.techlab.isp.solution;

public class TestWorker {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Robot robot = new Robot();

		atTheWorkstation(manager);
		atTheWorkstation(robot);
		atCanteen(manager);

	}

	public static void atTheWorkstation(IRobot worker) {
		System.out.println("At WorkStation");
		worker.startWork();
		worker.stopWork();
	}

	public static void atCanteen(IManager worker) {
		System.out.println("At Cateen");
		worker.startEat();
		worker.stopEat();
	}

}
