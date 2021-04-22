package ro.ase.prototype;

public class WoodBlock extends BuildingBlock{
	private Texture texture=null;
	
	public WoodBlock() {
	
		try {
			System.out.println("Loading texture...");
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.println(String.format("The %s block was rendered at %d %d %d", texture.getName(), getX(),getY(),getZ()));
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
				WoodBlock copy=(WoodBlock)super.clone();
				copy.texture=(Texture)texture.clone();
				return copy;
	}
}
