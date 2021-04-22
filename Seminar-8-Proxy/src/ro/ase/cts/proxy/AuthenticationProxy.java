package ro.ase.cts.proxy;

public class AuthenticationProxy implements Authentication {

	private WebsiteAuthentication websiteAuth = null;
	private int numberOfFailedLogins = 0;
	public AuthenticationProxy(WebsiteAuthentication websiteAuth) {
		super();
		this.websiteAuth = websiteAuth;
	}

	@Override
	public boolean login(String username, String password) throws AuthenticationSecurityException {
		
		if(numberOfFailedLogins>2) {
			throw new AuthenticationSecurityException("Too many bad logins!");
		}
		
		if((username!=null && username.trim().length() <3 )||
				password!=null && password.trim().length()<3) {
			throw new AuthenticationSecurityException("Invalid credentials!");
		}
		
		if(!websiteAuth.login(username, password)) {
			numberOfFailedLogins++;
			return false;
		}else {
			return true;
		}
		
		
	}

}
