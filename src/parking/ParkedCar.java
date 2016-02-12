/*
 * Name: Ge Jin . Andrew id: gjin.
 */
package parking;

public class ParkedCar {
	private String make;
	private String model;
	private String color;
	private String licenseNumber;
	private int minute;
	
	ParkedCar() {
		
	}
	ParkedCar(String make, String model, String color, String licenseNumber, int minute)
	{
		this.make= make;
		this.model= model;
		this.color= color;
		this.licenseNumber= licenseNumber;
		this.minute= minute;
	}
	
	public String getMake(){
		return this.make;
	}
	public String getModel() {
		return this.model;
	}
	public String getColor() {
		return this.color;
	}
	public String getLicenseNumber(){
		return this.licenseNumber;
	}
	public int getMinute() {
		return this.minute;
	}

}
