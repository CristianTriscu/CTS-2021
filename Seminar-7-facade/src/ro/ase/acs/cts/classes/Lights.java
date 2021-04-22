package ro.ase.acs.cts.classes;

public class Lights {
	public boolean headlightsOn;
	public boolean hazardLightsOn;
	public boolean brakeLightOn;
	public boolean signalLeftOn;
	public boolean signalRightOn;

	public boolean isHeadlightsOn() {
		return headlightsOn;
	}

	public void setHeadlightsOn(boolean headlightsOn) {
		this.headlightsOn = headlightsOn;
	}

	public boolean isHazardLightsOn() {
		return hazardLightsOn;
	}

	public void setHazardLightsOn(boolean hazardLightsOn) {
		this.hazardLightsOn = hazardLightsOn;
		if (hazardLightsOn) {
			System.out.println("Hazard lights on ");
		} else {
			System.out.println("Hazard lights off ");
		}
	}

	public boolean isBrakeLightOn() {
		return brakeLightOn;
	}

	public void setBrakeLightOn(boolean brakeLightOn) {
		this.brakeLightOn = brakeLightOn;
	}

	public boolean isSignalLeftOn() {
		return signalLeftOn;
	}

	public void setSignalLeftOn(boolean signalLeftOn) {
		this.signalLeftOn = signalLeftOn;
	}

	public boolean isSignalRightOn() {
		return signalRightOn;
	}

	public void setSignalRightOn(boolean signalRightOn) {
		this.signalRightOn = signalRightOn;
	}

}
