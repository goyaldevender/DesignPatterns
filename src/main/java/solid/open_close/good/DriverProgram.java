/**
 * 
 */
package solid.open_close.good;

/**
 * @author:      Devender Goyal
 * @description: The open close principle states that the class should be extensible for
 * 				 adding new functionality but it should be closed for modification.
 * @comments:    Here we see that we made an interface( making use of polymorphism), and 
 * 				 we can add new type of surveyors, and still use the same manager class
 * 				 without any modification.
 * 
 * 				 Polymorphism: In computer science, polymorphism is a programming language feature that
 * 			     allows values of different data types to be handled in a uniform manner.
 * 
 * @notes:       All the methods in an interface are by default public. The default and 
 * 				 public are the only valid modifiers for the methods in an interface.
 */

interface Surveyor{
	boolean isValid();
}

class HealthInsuranceSureveyor implements Surveyor{
	
	public boolean isValid(){
		return true;
	}
}

class VehicleInsuranceSurveyor implements Surveyor{
	public boolean isValid(){
		return true;
	}
}

class Manager{
	void approve(Surveyor s){
		if (s.isValid() == true) {
			System.out.println("The claim for the insurance is valid");
		}else{
			System.out.println("The claim for the insurance is invalid");
		}
	}
}
public class DriverProgram {
	
}
