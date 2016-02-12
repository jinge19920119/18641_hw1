/*
 * Name: Ge Jin . Andrew id: gjin.
 */
package parking;

public class ParkingTicket {
	private ParkedCar car;
	private int fine;
	private PoliceOfficer officer;
	
	ParkingTicket() {
		
	}
	ParkingTicket(ParkedCar car, int fine, PoliceOfficer officer){
		this.car= car;
		this.fine= fine;
		this.officer= officer;
	}
	
	public void report() {
		System.out.print("it's a "+this.car.getMake()+" make, "+this.car.getModel()+" model, ");
		System.out.println(this.car.getColor()+" color car, and license number is "+this.car.getLicenseNumber());
		System.out.println("the fine is: "+ this.fine+" dollars");
		System.out.println("this is issued by "+this.officer.getname()+", badge number is: "+this.officer.getBadgeNumber());
		
	}
	
	

}
