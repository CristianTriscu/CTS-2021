package ro.ase.acs.simpleFactory;

import javax.management.openmbean.OpenDataException;

public class DocumentFactory {

	public Document getDocument(DocumentType type, String fileName) throws OpenDataException {
		if (type == DocumentType.EXCEL) {
			return new ExcelDocument(fileName);
		} else if (type == DocumentType.WORD) {
			return new WordDocument(fileName);
		} else if (type == DocumentType.OPENOFFICE_TEXT) {
			return new OpenOfficeText();
		} else if (type == DocumentType.OPENOFFICE_SPREDSHEET) {
			return new OpenOfficeSpreadSheet();
		}
		throw new OpenDataException();

	}
}
