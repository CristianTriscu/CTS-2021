package ro.ase.acs.factoryMethod;

import ro.ase.acs.simpleFactory.Document;
import ro.ase.acs.simpleFactory.NoSuchDocumentException;
import ro.ase.acs.simpleFactory.OpenOfficeSpreadSheet;
import ro.ase.acs.simpleFactory.OpenOfficeText;


public class OpenOfficeFactory implements AbstractDocumentFactory {

	@Override
	public Document getDocument(FileType type, String fileName) throws  NoSuchDocumentException {
		if(type==FileType.DOCUMENT) {
			OpenOfficeText officeText=new OpenOfficeText();
			officeText.setName(fileName);
			return officeText;
		}else if(type==FileType.SPREADSHEET) {
			OpenOfficeSpreadSheet officeSpreadSheet=new OpenOfficeSpreadSheet();
			officeSpreadSheet.setName(fileName);
			return officeSpreadSheet;
		}throw new NoSuchDocumentException();
		
	}

}
