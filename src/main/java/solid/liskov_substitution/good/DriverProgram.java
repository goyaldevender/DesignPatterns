/**
 * 
 */
package solid.liskov_substitution.good;

/**
 * @author:      Devender Goyal
 * @description: The objects of the Parent class(P) should be replaceable with objects 
 * 				 of the child class(C) without altering any desirable property of the 
 * 				 program. For example: The class "PocketWatch" behaves as a child of 
 * 				 class "Watch", in accordance with the liskov principle.
 * 				 (Notice: This principle concerns with classes: Parent Class and
 * 						  child class) 
 * @note:	     If you are writing objects which extend classes, but fails the IS-A 
 * 				 test, then you are most likely violating the liskov substitution 
 * 			   	 principle.
 */

class Vehicle{
	
	void printMessage(){
		System.out.println("This is vehicle");
	}
		
	void startMoving(){
		System.out.println("Started Moving");
	}
}

class VehicleWithEngine extends Vehicle{

	void startEngine(){
		System.out.println("Engine started");
	};

}

class VehicleWithoutEngine extends Vehicle{
	
	void startMechanicalMovement(){
		System.out.println("Paddling/Mechanical Movement Started");
	}
}

class Bicycle extends VehicleWithoutEngine{
	
	// Here we will inherit the startMechanicalMovement() method, which is fine :)
}

class Car extends VehicleWithEngine{
	// Here we will inherit the VehicleWithEngine() method, which is also fine :)
}

public class DriverProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Vehicle v = new Bicycle();
		v.startMoving();
	}

}
