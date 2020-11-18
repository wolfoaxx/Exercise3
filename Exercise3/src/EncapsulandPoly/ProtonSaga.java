package EncapsulandPoly;

public class ProtonSaga extends Proton {

	private String fuel;
	
	public void setFuel(String newFuel) {
		this.fuel = newFuel;
	}
	
	public String getFuel() {
		return fuel;
	}
	
	void run() {//Polymorphism 
		System.out.println("Proton Saga is running ");
		super.run();
	}
	
	void color(String carColor1,String carColor2) {
		System.out.println(carColor1 + carColor2);
	}
}
