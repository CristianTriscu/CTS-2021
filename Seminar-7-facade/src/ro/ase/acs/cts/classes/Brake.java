package ro.ase.acs.cts.classes;

public class Brake {
	private float level;

	public float getLevel() {
		return level;
	}

	public void setLevel(float level) {
		this.level = level;
		System.out.println("New brake level " + this.level);
	}
	
}
