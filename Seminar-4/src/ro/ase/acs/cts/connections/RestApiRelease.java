package ro.ase.acs.cts.connections;

public class RestApiRelease implements RestService{

	
	public RestApiRelease() {
		System.out.println("Release server");
	}
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected successfully!");
		
	}

}
