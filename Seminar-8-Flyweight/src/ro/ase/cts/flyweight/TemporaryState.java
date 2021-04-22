package ro.ase.cts.flyweight;

public class TemporaryState {
	private float x;
	private float y;

	public TemporaryState() {
		x = 0;
		y = 0;
	}

	public TemporaryState(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

}
