package ro.ase.acs.adapter;

public class FlightScheduler implements FlightAbstractScheduler {

	private String[][] places = new String[6][20];

	
	public void bookPlace(int row) {
		if(places[1][row].equals("O")) {
			places[1][row]="X";
		}
		else {
			places[3][row]="X";
		}
	}
	
	FlightScheduler() {
		for (int i = 0; i < places.length; i++) {
			for (int j = 0; j < places[i].length; j++) {
				places[i][j] = "O";
			}
		}
	}

	public void bookPlace(int row, char place) {
		int column = -1;
		switch (place) {
		case 'A':
			column = 0;
			break;

		case 'B':
			column = 1;
			break;
		case 'C':
			column = 2;
			break;
		case 'D':
			column = 3;
			break;
		case 'E':
			column = 4;
			break;
		case 'F':
			column = 5;
			break;
		}
		if (places[row][column].equals("O")) {
			places[row][column] = "X";
		}
	}

	public void displayPlaces() {
		for (int i = 0; i < places.length; i++) {
			for (int j = 0; j < places[i].length; j++) {
				System.out.print(places[i][j]);
				System.out.print(" ");
			}
			if (i == 2) {
				System.out.println("<-");
			}
			System.out.println();
		}
	}

	@Override
	public void printAvailablePlaces() {
		// TODO Auto-generated method stub
		
	}

}
