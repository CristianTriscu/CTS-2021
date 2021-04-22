package ro.ase.acs.factoryMethod;

import ro.ase.acs.simpleFactory.Document;
import ro.ase.acs.simpleFactory.NoSuchDocumentException;


public interface AbstractDocumentFactory {
	public Document getDocument(FileType type, String fileName) throws NoSuchDocumentException;
}
