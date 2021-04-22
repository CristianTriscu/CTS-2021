package ro.ase.acs.main;

import ro.ase.acs.factoryMethod.AbstractDocumentFactory;
import ro.ase.acs.factoryMethod.FileType;
import ro.ase.acs.factoryMethod.OpenOfficeFactory;
import ro.ase.acs.simpleFactory.Document;
import ro.ase.acs.simpleFactory.NoSuchDocumentException;

public class NewMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractDocumentFactory documentFactory=new OpenOfficeFactory();
		Document document;
		try {
			document = documentFactory.getDocument(FileType.SPREADSHEET, "Studenti");
			document.open();
		} catch (NoSuchDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
