/*
 * Name: Ge Jin . Andrew id: gjin.
 */
package parking;
public class ParkingMeter {
	private int purchaseMinute;
	
	ParkingMeter() {
		
	}
	ParkingMeter(int minute) {
		this.purchaseMinute= minute;
	}
	
	public int getMinute() {
		return this.purchaseMinute;
	}

}
