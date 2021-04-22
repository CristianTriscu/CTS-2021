package ro.ase.acs.adapter;

public class FlightCovidToNonCovidAdapter extends FlightScheduler{
	private FlightCovidScheduler covidScheduler;
	
	public FlightCovidToNonCovidAdapter(FlightCovidScheduler covidScheduler) {
		this.covidScheduler=covidScheduler;
	}
	@Override
	public void bookPlace(int row, char place) {
		covidScheduler.bookPlace(row);
	}
	
	@Override
	public void displayPlaces() {
		// TODO Auto-generated method stub
		covidScheduler.displayPlaces();
	}
}
