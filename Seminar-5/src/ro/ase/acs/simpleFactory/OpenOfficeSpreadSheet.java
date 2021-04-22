package ro.ase.acs.simpleFactory;

public class OpenOfficeSpreadSheet implements Document {

	private String name="NewSpreadSheet";
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	@Override
	public void open() {
		System.out.println(String.format("Opening file %s.ods...", this.name));
	}

}
