package EncapsulandPoly;

public class ProtonX50 extends ProtonX70{
private String park;

	public void setPark(String newPark) {
		this.park = newPark;
	}

	public String getPark() {
	return park;
	}
	
	void run() {//Polymorphism 
		System.out.println("Proton X50 is running");
		super.run();
	}
	
	void color(String carColor1,String carColor2) {
		System.out.println(carColor1 + carColor2);
	}
	
}
