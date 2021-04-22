package ro.ase.prototype;

public class StoneBlock extends BuildingBlock{
	private Texture texture=null;
	
	public StoneBlock() {
		try {
			System.out.println("Loading texture...");
			Thread.sleep(3000);
			texture=new Texture("Stone");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void render() {
		System.out.println(String.format("The %s block was rendered at %d %d %d", texture.getName(), this.getX(),this.getY(),this.getZ()));
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		StoneBlock copy=(StoneBlock)super.clone();
		copy.texture=(Texture)texture.clone();
		return copy;
	}
}
