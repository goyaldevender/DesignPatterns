/**
 * 
 */
package creational.singleton.eager;

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

//		Using the istance method of the OilField Class
		oField.printMessage();
	}
}
