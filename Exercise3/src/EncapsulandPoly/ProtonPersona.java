package EncapsulandPoly;

public class ProtonPersona extends Proton{
	
	private String voice;
	
	
	public void setVoice(String newVoice) {
		this.voice = newVoice;
	}
	
	public String getVoice() {
		return voice;
	}
	
	
	void run() { //Polymorphism 
		System.out.println("Proton Persona is running");
		super.run();
	}
	
	void color(String carColor1,String carColor2) {
		System.out.println(carColor1 + carColor2);
	}
}
