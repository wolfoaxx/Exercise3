package EncapsulandPoly;

public class ProtonMain {

	public static void main(String[] args) {
	ProtonPersona prs = new ProtonPersona();
	ProtonX50 px50 = new ProtonX50();
	ProtonSaga psg = new ProtonSaga();
	ProtonX70 px70 = new ProtonX70();
	
	
	System.out.println("Proton Persona features");
	prs.setVoice("Voice Control");
	System.out.println(prs.getVoice());
	prs.setbrand("Dunlop");
	System.out.println(prs.getBrand());
	prs.setwindows("Windows roll up");
	System.out.println(prs.getWindows());
	prs.run();
	prs.sum(10000, 45000.50);
	prs.sum("Dunlop ", 17);
	prs.color("Green", "Red");
	System.out.println("=============================");
	System.out.println("Proton Saga features");
	psg.setFuel("Fuel efficient enabled");
	System.out.println(psg.getFuel());
	psg.setwindows("Windows roll down");
	System.out.println(psg.getWindows());
	psg.run();
	psg.sum("Michellin ", 18);
	psg.color("Dark", "Blue");
	System.out.println("=============================");
	System.out.println("Proton X50 features");
	px50.setPark("Auto Park initiated");
	System.out.println(px50.getPark());
	px50.run();
	System.out.println("=============================");
	System.out.println("Proton X70 features");
	px70.setDrive("Auto-drive enabled");
	System.out.println(px70.getDrive());
	px70.setHeadlights("Headlights up");
	System.out.println(px70.getHeadlights());
	px70.run();
	
	
	}

}
