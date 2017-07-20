/**
 * 
 */
package solid.interface_segregation.bad;

/**
 * @author: 	 Devender Goyal
 * @description: The interface segregation principle states that if the a single interface
 * 				 does multiple number of responsibilities then its better to split the 
 * 				 interface. This helps us because now, we don't have to implement empty 
 * 				 methods in the implementation classes.
 * @comments:    Here, we can see that we have the empty methods in the ToyCar and ToyAeroplane
 */

interface Toy{
	
	String toyName=null;
	int cost = 0;
	
	public void move();
	public void fly();
}

class ToyCar implements Toy{

	public void move() {
		System.out.println("Move the car by 5 KM");	
	}

	public void fly() {
		
	}

}

class ToyAeroplane implements Toy {

	public void move() {
		
	}

	public void fly() {
		System.out.println("Fly the car over the emirates");
	}
}
