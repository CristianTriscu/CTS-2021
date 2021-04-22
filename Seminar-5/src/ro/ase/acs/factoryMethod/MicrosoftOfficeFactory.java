package ro.ase.acs.factoryMethod;

import ro.ase.acs.simpleFactory.Document;
import ro.ase.acs.simpleFactory.ExcelDocument;
import ro.ase.acs.simpleFactory.NoSuchDocumentException;
import ro.ase.acs.simpleFactory.WordDocument;

public class MicrosoftOfficeFactory implements AbstractDocumentFactory {

	@Override
	public Document getDocument(FileType type, String fileName) throws NoSuchDocumentException {
		if(type==FileType.DOCUMENT) {
			WordDocument wordDoc=new WordDocument(fileName);
			return wordDoc;
		}else if(type==FileType.SPREADSHEET) {
			ExcelDocument excelDoc=new ExcelDocument(fileName);
			return excelDoc;
		}throw new NoSuchDocumentException();
		
	}
	
}
