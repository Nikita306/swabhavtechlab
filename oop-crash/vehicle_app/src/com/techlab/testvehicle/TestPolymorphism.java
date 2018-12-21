package com.techlab.testvehicle;

import com.techlab.vehicle.Bike;
import com.techlab.vehicle.Car;
import com.techlab.vehicle.IMoveable;
import com.techlab.vehicle.Truck;

public class TestPolymorphism {

	public static void main(String[] args) {
		IMoveable[] array=new IMoveable[3];
		IMoveable car=new Car();
		startRace(car);
		IMoveable bike=new Bike();
		startRace(bike);
		IMoveable truck=new Truck();
		startRace(truck);
		array[0]=new Car();
		array[1]=new Bike();
		array[2]=new Truck();
		
		startRace(array);
	}
	
	
	public static void startRace(IMoveable m){
		//System.out.println("starting");
		//m.move();
		//System.out.println("stopping");
	}
	
	public static void startRace(IMoveable[] m1){
	
		System.out.println("race start");
		for(IMoveable move:m1){
			move.move();
		}
		System.out.println("race stop");
		
	}

}
