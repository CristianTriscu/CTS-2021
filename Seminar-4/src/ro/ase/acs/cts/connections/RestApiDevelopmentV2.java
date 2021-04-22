package ro.ase.acs.cts.connections;

public class RestApiDevelopmentV2  extends RestServiceV2{

	public RestApiDevelopmentV2(String serverUrl) {
		super(serverUrl);
		// TODO Auto-generated constructor stub
		System.out.println("Development server v2");
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected succesfully to "+ serverUrl);
	}

}
