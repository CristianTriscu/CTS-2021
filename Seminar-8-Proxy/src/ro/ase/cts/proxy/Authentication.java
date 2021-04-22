package ro.ase.cts.proxy;

public interface Authentication {
	public boolean login(String username, String password) throws AuthenticationSecurityException;
}
