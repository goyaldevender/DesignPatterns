/**
 * 
 */
package factory;

/**
 * @author Devender Goyal
 * @date   24 June 2017
 */
public class DeliveryNetworkFactory {
	
	
// Using the method name as "getDeliveryNetwork" because in jave the 
// creation methods usually start with word "get"
	DeliveryNetwork getDeliveryNetwork(String type){
		
		if(type.equalsIgnoreCase("Battery")){
			return new Battery();
		}
		else if(type.equalsIgnoreCase("Non-Battery")){
			return new NonBattery();
		}
		else if(type.equalsIgnoreCase("GasPlant")){
			return new GasPlant();
		}
		else{
		}
		return null;
	}

}
