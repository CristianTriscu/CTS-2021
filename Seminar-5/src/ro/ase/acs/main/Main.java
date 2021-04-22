package ro.ase.acs.main;

import javax.management.openmbean.OpenDataException;

import ro.ase.acs.simpleFactory.Document;
import ro.ase.acs.simpleFactory.DocumentFactory;
import ro.ase.acs.simpleFactory.DocumentType;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentFactory factory = new DocumentFactory();
		Document document = null;
		try {
			document = factory.getDocument(DocumentType.OPENOFFICE_SPREDSHEET, "Doc");
			document.open();
		} catch (OpenDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
