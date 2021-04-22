package ro.ase.prototype;

public class Texture implements Cloneable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Texture(String name) {
		this.name = name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Texture copy=(Texture) super.clone();
	
		return copy;
	}
	
}
