/**
 * 
 */
package creational.singleton.lazy_dcl;

/**
 * @author Devender Goyal
 *
 */
public class driverProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//      We can't use the new keyword because the constructor is private		
//		OilField oField = new OilField();   -> results in error

//		Getting the singleton object
		OilField oField = OilField.getInstance();

//		Using the instance method of the OilField Class
		oField.printMessage();
	}
}

