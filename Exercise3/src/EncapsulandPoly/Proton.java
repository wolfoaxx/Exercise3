package EncapsulandPoly;

public class Proton {
	
	private String brand,windows,headlights;

	
	public void setbrand(String newBrand) {
		this.brand= newBrand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setwindows(String newWindows) {
		this.windows = newWindows;
	}
	
	public String getWindows() {
		return windows;
	}
	
	public void setHeadlights(String newHeadlights) {
		this.headlights = newHeadlights;
	}
	
	public String getHeadlights() {
		return headlights;
	}
	
	void run() { 
		System.out.println("car is running");
		
	}
	
	void sum(int basePrice, double standard) {
		System.out.println(basePrice + standard);
	}
	
	void sum(String tyre , int size) {
		System.out.println(tyre + size);
	}
	
	void color(String carColor1,String carColor2) {
		System.out.println(carColor1 + carColor2);
	}
	

	
	
	
	
	

}


