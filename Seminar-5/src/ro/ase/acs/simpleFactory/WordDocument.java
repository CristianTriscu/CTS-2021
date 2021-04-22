package ro.ase.acs.simpleFactory;

public class WordDocument implements Document {

	private String name;

	public WordDocument(String name) {
		this.name = name;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println(String.format("Opening file %s.docx...", name));
	}

}
