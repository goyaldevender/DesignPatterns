/**
 * 
 */
package creational.singleton.lazy_dcl;

/**
 * @author 		: Devender Goyal
 * @description : Here we are creating the singleton pattern using the Double Check Locking
 * 				  This method of creating the singleton is thread safe
 */
public class OilField {

	// Creating the variable to hold the instance of the class
	// This variable should not be accessed outside the class, hence private;
	// The variable will used inside the static method, hence static
	// Creating the variable with default value as null, because this is lazy loading
	private static OilField oField = null;
	
	/**
	 *  First, we are making the constructor as private, inorder to prevent the creation of 
	 *  multiple instances using the new keyword
	 */
	private OilField() {
		// TODO Auto-generated constructor stub
	}

	/**
	 *  getInstance() method to return the instance of the class
	 *  
	 *  @description : Here we could have made the entire method synchronised, it will work, but it 
	 *  			   will not be efficient because there can be the case where we have already created 
	 *                 the instance and we just need to return it. In such, cases we don't need to keep 
	 *                 the thread waiting.
	 */
	static OilField getInstance(){
		
		if(oField == null){ // First Check 
			
			synchronized (OilField.class) { // We have put the OilField.class as the parameter to sync block

				if(oField == null){ // Second Check
					oField = new OilField();
				}
			}
			
		}
		
		return oField;
	}
	
	void printMessage(){
		System.out.println("Printing the message from the instance method of class");
	}
}
