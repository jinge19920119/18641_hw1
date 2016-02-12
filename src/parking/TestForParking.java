/*
 * Name: Ge Jin . Andrew id: gjin.
 */
package parking;

public class TestForParking {
	public static void main(String[] args) {
		ParkedCar car= new ParkedCar("benz","600","black","ABC0011",180);
		PoliceOfficer officer= new PoliceOfficer("Tom", "SB120");
		
		ParkingMeter meter1= new ParkingMeter(200);//case 1. with in time purchased
		ParkingMeter meter2= new ParkingMeter(180);//case 2. just in time purchased
		ParkingMeter meter3= new ParkingMeter(150);//case 3. exceeding less than 1h
		ParkingMeter meter4= new ParkingMeter(30);//case 4. exceeding more than 1h
		
		int extime;
		
		System.out.println("case 1:");
		extime= officer.examine(car, meter1);
		if(extime<0) {
			System.out.println("Good! No fine!");
		} else if(extime==0){
			System.out.println("Good! Just in time! No fine!");
		}
		else {
			ParkingTicket ticket1= officer.issueTicket(car, extime);
			ticket1.report();
		}
		System.out.println();
		
		System.out.println("case 2:");
		extime= officer.examine(car, meter2);
		if(extime<0) {
			System.out.println("Good! No fine!");
		} else if(extime==0){
			System.out.println("Good! Just in time! No fine!");
		}
		else {
			ParkingTicket ticket2= officer.issueTicket(car, extime);
			ticket2.report();
		}
		System.out.println();
		
		System.out.println("case 3:");
		extime= officer.examine(car, meter3);
		if(extime<0) {
			System.out.println("Good! No fine!");
		} else if(extime==0){
			System.out.println("Good! Just in time! No fine!");
		}
		else {
			ParkingTicket ticket3= officer.issueTicket(car, extime);
			ticket3.report();
		}
		System.out.println();
		
		System.out.println("case 4:");
		extime= officer.examine(car, meter4);
		if(extime<0) {
			System.out.println("Good! No fine!");
		} else if(extime==0){
			System.out.println("Good! Just in time! No fine!");
		}
		else {
			ParkingTicket ticket4= officer.issueTicket(car, extime);
			ticket4.report();
		}
		System.out.println();
		
	}

}
