package ro.ase.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry2 {
	private static Map<String, BuildingBlock> map=new HashMap<String,BuildingBlock>();
	
	static {
		StoneBlock stoneBlock=new StoneBlock();
		map.put("Stone", stoneBlock);
		WoodBlock woodBlock=new WoodBlock();
		map.put("Wood", stoneBlock);
	}
	public static BuildingBlock getBlock(String blockType) {
		try {
			return (BuildingBlock) map.get(blockType).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
