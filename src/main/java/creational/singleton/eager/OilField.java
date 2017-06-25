/**
 * 
 */
package creational.singleton.eager;

/**
 * @author       : Devender Goyal
 * @description  : This refers to the eager instantiation of the Singleton Pattern.
 * 				   In the singleton pattern, the constructor is always private and
 * 				   we use the getInstance() method to get the object.
 */
public class OilField { 

	// We will return oField from the static method hence this oField object should also be static
	private static OilField oField = new OilField();
	
	/**
	 * Making the constructor as private, so that the instance can't be created by 
	 * using the new keyword
	 */
	private OilField() {
	
	}
	
	/**
	 * @return:      Object of OilField
	 * @description: This method should be static because it will accessed to create the object
	 */
	public static OilField getInstance() {
		return oField;
	}

	/**
	 * @description : The print method to test the created object 
	 */
	public void printMessage() {
		System.out.println("Printing message from oil field");
		
	}
}
