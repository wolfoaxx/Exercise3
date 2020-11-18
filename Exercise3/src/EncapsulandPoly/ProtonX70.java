package EncapsulandPoly;

public class ProtonX70 extends Proton {
private String drive; 


	public void setDrive(String newDrive) {
		this.drive = newDrive;
	}
	
	public String getDrive() {
	return drive;
	}
	
	void run() {//Polymorphism 
		System.out.println("ProtonX70 is running");
		super.run();
	}
	
	void color(String carColor1,String carColor2) {
		System.out.println(carColor1 + carColor2);
	}
}
