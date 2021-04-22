package ro.ase.acs.adapter;

public class Main {

	public static void main(String[] args) {
		FlightScheduler scheduler = new FlightScheduler();
		
		//cod existent
		scheduler.bookPlace(1, 'B');
		scheduler.bookPlace(1, 'C');
		
		scheduler.displayPlaces();
		
		

	}

}
