package ro.ase.acs.cts.main;

import ro.ase.acs.cts.classes.Car;
import ro.ase.acs.cts.classes.CockpitFacade;

public class Main {

	public static void main(String[] args) {
			
			CockpitFacade cockpit = new CockpitFacade();
			cockpit.startCar();
			System.out.println();
			cockpit.stopCar();
	}

}
