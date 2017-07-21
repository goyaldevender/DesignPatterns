/**
 * 
 */
package solid.open_close.bad;

/**
 * @author:      Devender Goyal
 * @description: The open close principle states that the class should be extensible for
 * 				 adding new functionality but it should be closed for modification.
 * @comments:    Here we see that as we add new type of surveyors, we have to add new 
 * 				 methods to the manager class also. This means that the we have to modify
 * 				 the manager class again and again. 
 */

class HealthInsuranceSureveyor{
	
	boolean isValid(){
		return true;
	}
}

class VehicleInsuranceSurveyor{
	boolean isValid(){
		return true;
	}
}

class Manager{
	void approve(HealthInsuranceSureveyor hs){
		if (hs.isValid() == true) {
			System.out.println("The claim for the health insurance is valid");
		}else{
			System.out.println("The claim for the health insurance is invalid");
		}
	}

	void approve(VehicleInsuranceSurveyor vs){
		if (vs.isValid() == true) {
			System.out.println("The claim for the vehicle insurance is valid");
		}else{
			System.out.println("The claim for the vehicle insurance is invalid");
		}
	}
}
public class DriverProgram {
	
}
