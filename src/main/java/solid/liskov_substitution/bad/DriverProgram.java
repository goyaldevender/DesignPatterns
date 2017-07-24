/**
 * 
 */
package solid.liskov_substitution.bad;

/**
 * @author:      Devender Goyal
 * @description: The objects of the Parent class(P) should be replaceable with objects 
 * 				 of the child class(C) without altering any desirable property of the 
 * 				 program. For example: The class "PocketWatch" behaves as a child of 
 * 				 class "Watch", in accordance with the liskov principle.
 * 				 (Notice: This principle concerns with classes: Parent Class and
 * 						  child class) 
 * @comment:     If you are writing objects which extend classes, but fails the IS-A 
 * 				 test, then you are most likely violating the liskov substitution 
 * 			   	 principle.
 */

class Vehicle{
	
	void printMessage(){
		System.out.println("This is vehicle");
	}
	
	void startEngine(){
		System.out.println("Engine started");
	};
	
	void startMoving(){
		System.out.println("Started Moving");
	}
}

class Bicycle extends Vehicle{
	
// Here we will inherit the start engine method but that is not good
// because it doesn't make any sense to have the startEngine() function
// inside the Bicycle class
}

class Car extends Vehicle{
	// Here we will inherit the methods but that fine
}

public class DriverProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Vehicle v = new Bicycle();
		v.printMessage();
		
	}

}
