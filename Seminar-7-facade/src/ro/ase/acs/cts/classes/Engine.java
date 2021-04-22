package ro.ase.acs.cts.classes;

public class Engine {

	private int rpm;

	public int getRpm() {
		return rpm;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
		System.out.println("New rpm " + this.rpm);
	}

	public void start() {

		System.out.println("The engine has started. ");
	}
}
