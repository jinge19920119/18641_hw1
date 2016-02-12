/*
 * Name: Ge Jin . Andrew id: gjin.
 */
package parking;
public class PoliceOfficer {
	private String name;
	private String badgeNumber;
	
	PoliceOfficer() {
		
	}
	PoliceOfficer(String name, String badgeNumber) {
		this.name= name;
		this.badgeNumber= badgeNumber;
	}
	
	public String getname() {
		return this.name;
	}
	public String getBadgeNumber() {
		return this.badgeNumber;
	}
	
	public int examine(ParkedCar car, ParkingMeter meter) {
		int parkMin, purchMin;
		parkMin= car.getMinute();
		purchMin= meter.getMinute();
		return (parkMin- purchMin);
	}
	public ParkingTicket issueTicket(ParkedCar car, int minute) {
		int fine;
		if(minute<= 60){
			fine= 25;
		}else if(minute%60 == 0) {
			fine= 25+ 10*(minute/60-1);
		} else {
			fine= 25+ 10*(minute/60);
		}
		ParkingTicket ticket= new ParkingTicket(car, fine, this);
		return ticket;
	}

}
