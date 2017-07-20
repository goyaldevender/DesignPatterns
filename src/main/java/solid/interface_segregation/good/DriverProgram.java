/**
 * 
 */
package solid.interface_segregation.good;

/**
 * @author: 	 Devender Goyal
 * @description: The interface segregation principle states that if the a single interface
 * 				 does multiple number of responsibilities then its better to split the 
 * 				 interface. This helps us because now, we don't have to implement empty 
 * 				 methods in the implementation classes.
 * @comments:    Here, we can see that we have segregated the Toy interface into Toy, Flyable,
 *			     Movable		
 * 
 * @note:        The variables in the interface are by default static and final, hence the 
 * 				 value of the variable is constant and can't be changed.
 */

interface Toy{
	
	String toyName=null;
	int cost = 0;
	
	public void printName();
	public void printCost();
}

interface Flyable{
	
	public void fly();
}

interface Movable{
	public void move();
}

class ToyCar implements Toy, Movable{

	public void printName(){
		System.out.println("Name of the toy = " + toyName);
	}

	public void printCost(){
		System.out.println("Cost of the toy = " + cost);
	}
	
	public void move() {
		System.out.println("Move the car by 5 KM");	
	}
}

class ToyAeroplane implements Toy, Flyable {

	public void printName(){
		System.out.println("Name of the toy = " + toyName);
	}

	public void printCost(){
		System.out.println("Cost of the toy = " + cost);
	}
	
	public void fly() {
		System.out.println("Fly the car over the emirates");
	}

}

public class DriverProgram{
	
	public static void main(){
		ToyCar tCar = new ToyCar();
	}
}
