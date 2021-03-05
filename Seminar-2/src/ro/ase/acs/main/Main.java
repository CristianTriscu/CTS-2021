package ro.ase.acs.main;

import ro.ase.acs.contracts.Writeable;
import ro.ase.acs.readers.Reader;
import ro.ase.acs.writers.ConsoleWriter;
import ro.ase.acs.writers.FileWriter;

public class Main {


	public static void main(String[] args) {
		
		IoC ioc=new IoC();
		ioc.Register(Readable.class, Reader.class);
		ioc.Register(Writeable.class, FileWriter.class);
		Orchestrator orchestrator = new Orchestrator(ioc.Resolve(Readable.class),ioc.Resolve(Writeable.class));
		orchestrator.execute();
	}

}