package ro.ase.acs.cts.connections;

public class RestAPI implements RestService {
	
	public RestAPI() {
		System.out.println("Release server");
	}
	
	public void connect() {
		System.out.println("Connected to the release server succesfully!");
	}
}
