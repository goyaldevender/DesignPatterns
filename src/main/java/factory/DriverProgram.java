package factory;

/*
 * @patterType 	: Creation
 * 
 * @usage      	: High 
 * 
 * @description : The design pattern involves an interface(DeliveryNetwork) and its implementations.
 *                We also create a factory class ( DeliveryNetwork Factory) that creates the various
 *                objects. Also to demonstrate the program we create a driver program. 
 *                
 *                The Creation of the objects is abstracted from the driver program. The driver program 
 *                simply uses the factory to get various objects by using getDeliveryNetwork("type") method 
 *                for example: getDeliveryNetwork("Well");
 *                
 * @difficulty 	: Low
 */

/**
 *  Description: Driver Program to test the functionality
 */

public class DriverProgram {

	public static void main(String[] args) {
		
		// Creating the object of the factory class
		DeliveryNetworkFactory dnFactory = new DeliveryNetworkFactory();
		
		dnFactory.getDeliveryNetwork("battery");
		dnFactory.getDeliveryNetwork("non-battery");
		dnFactory.getDeliveryNetwork("gasplant");
		
	}
}
