package com.techlab.isp.violation;

public class TestWorker {

	public static void main(String[] args) {
		Manager manager=new Manager();
		Robot robot=new Robot();
		atTheWorkstation(manager);
		atTheWorkstation(robot);
		atCanteen(manager);
		atCanteen(robot);

	}
	
	public static void atTheWorkstation(IWorker worker){
		System.out.println("At WorkStation");
		worker.startWork();
		worker.stopWork();
	}
	public static void atCanteen(IWorker worker){
		System.out.println("At Cateen");
		worker.startEat();
		worker.stopEat();
	}
	

}
