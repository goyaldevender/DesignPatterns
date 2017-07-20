/**
 * 
 */
package creational.singleton.lazy_dcl;

/**
 * @author Devender Goyal
 * The difference is not the correct way to ask.because singleton is not a keyword compared to static. you should be asking like "When to choose which one?". what are the advantages of singleton class over static class, these questions comes at the design stages.

Singleton: Usage: classes that serve as global configuration , ex: Trial version of software with one database connection, JDK Runtime classes instances per jvm.

When to go: 1.While developing your code,you think of forward compatibilty, like tomorrow when you need to convert this singleton class to normal class or allow subclassing. 2. You can provide lazy loading feature , when this singleton class is heavy.

static: Usage: classes that basically does conversions,utility functions. please check Math class.

When to go: 1. helper classes, used by all the classes in your api development.

disadvantage: 1. classes are eagerly loaded .

expecting points from other people.

Singleton Pattern does two things: It manages its own instance creation as well as it does
the main work of a class.
 */

public class driverProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//      We can't use the new keyword because the constructor is private		
//		OilField oField = new OilField();   -> results in error

//	    For Singleton class, we don't create the instance( using new constructor),
//      instead we ask for the object using the getInstance() method.
		OilField oField = OilField.getInstance();

//		Using the instance method of the OilField Class
		oField.printMessage();
	}
}

